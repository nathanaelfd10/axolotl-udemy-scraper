/**
 * 
 */
package com.noxfl.axolotl.scraper.page.category.impl;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.apache.commons.text.WordUtils;
import org.apache.http.client.utils.URIBuilder;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.Option;
import com.jayway.jsonpath.spi.json.JsonOrgJsonProvider;
import com.noxfl.axolotl.dao.udemy.CategoryDAO;
import com.noxfl.axolotl.dao.udemy.CourseDAO;
import com.noxfl.axolotl.dao.udemy.TopicDAO;
import com.noxfl.axolotl.model.schema.udemy.api2.discoveryunits.ContextInfo;
import com.noxfl.axolotl.model.schema.udemy.api2.discoveryunits.CourseDiscoverySchema;
import com.noxfl.axolotl.model.schema.udemy.api2.discoveryunits.Item;
import com.noxfl.axolotl.model.schema.udemy.api2.discoveryunits.Label;
import com.noxfl.axolotl.model.schema.udemy.api2.discoveryunits.SourceObject;
import com.noxfl.axolotl.model.udemy.Category;
import com.noxfl.axolotl.model.udemy.Course;
import com.noxfl.axolotl.model.udemy.CourseDetail;
import com.noxfl.axolotl.model.udemy.Price;
import com.noxfl.axolotl.model.udemy.Topic;
import com.noxfl.axolotl.scraper.PageNotFoundException;
import com.noxfl.axolotl.scraper.RequestBlockedException;
import com.noxfl.axolotl.scraper.page.category.UdemyCategoryPage;
import com.noxfl.axolotl.utils.DateTimeUtils;
import com.noxfl.axolotl.utils.HttpUtils;
import com.noxfl.axolotl.utils.JsonPathUtils;
import com.noxfl.axolotl.utils.NumberUtils;
import com.noxfl.axolotl.utils.StringFormatter;

/**
 * @author Fernando Nathanael
 *
 */
@Primary
@Component
public class UdemyCategoryPageImpl implements UdemyCategoryPage {

	// WARNING: THIS URL SHOULD NOT CONTAIN TRAILING SPACE
	public final static String UDEMY_ROOT_URL = "https://www.udemy.com";

	private final static HashMap<String, String> headers = new HashMap<>() {
		{
//			put("content-type", "application/json");
//			put("accept", "application/json");
//			put("user-agent",
//					"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/104.0.0.0 Safari/537.36");
		}
	};

	private final int maxUdemyPricingPageSize = 50;

	private boolean saveToDb = true;

	private boolean saveCategoryOrTopicToDb = false;

	private final Configuration jsonPathConfiguration = Configuration.builder().jsonProvider(new JsonOrgJsonProvider())
			.build().setOptions(Option.SUPPRESS_EXCEPTIONS);

	private CourseDAO udemyCourseDAO;

	private TopicDAO topicDAO;

	private CategoryDAO categoryDAO;

	private ObjectMapper objectMapper;

	@Autowired
	public UdemyCategoryPageImpl(CourseDAO udemyCourseDAO, TopicDAO topicDAO, CategoryDAO categoryDAO,
			ObjectMapper objectMapper) {
		this.topicDAO = topicDAO;
		this.categoryDAO = categoryDAO;
		this.udemyCourseDAO = udemyCourseDAO;
		this.objectMapper = objectMapper;
	}

	@Override
	public List<Course> findProductsInCategory(Category topic, int minPage, int maxPage)
			throws RequestBlockedException, PageNotFoundException, IOException {

		List<Course> courses = new ArrayList<>();

		for (int page = minPage; page < maxPage + 1; page++) {
			System.out.println(String.format("[Page %s of %s]", page, maxPage));
			List<Course> scrapedCourses = findProductsInCategory(topic, page);

			courses.addAll(scrapedCourses);
		}

		System.out.println(String.format("[*] Obtained total of %s products", courses.size()));

		return courses;
	}

	/**
	 * Get courses from selected Category
	 * 
	 * @param TopicEntity
	 * @return List<Courses>
	 * @throws RequestBlockedException
	 * @throws PageNotFoundException
	 * @throws IOException
	 */
	@Override
	public List<Course> findProductsInCategory(Category category, int atPage)
			throws RequestBlockedException, PageNotFoundException, IOException {
		if (atPage == 0)
			throw new ArrayIndexOutOfBoundsException("Udemy pagination starts at 1 and can't be 0.");

		/*
		 * TO-DO: Max udemy page size is 60. Pricing API limit is 50, so Pricing API
		 * endpoint as of now is a bottleneck due to its page size being lower than
		 * udemy page size. We're going to set this to equals for now. This shouldn't be
		 * hardcoded and be configurable
		 */

		int pageSize = maxUdemyPricingPageSize;
		String topicId = String.valueOf(category.getCategoryId());

		System.out.println(
				String.format("Starting to scrape category id '%s' at page '%s'", category.getCategoryId(), atPage));

		HashMap<String, String> params = new HashMap<>();

		params.put("page_size", String.valueOf(pageSize));
		params.put("subcategory", null);
		params.put("subcategory_id", topicId);
		params.put("source_page", "subcategory_page");
		params.put("locale", "en_US");
		params.put("currency", "idr");
		params.put("navigation_locale", "en_US");
		params.put("skip_price", "true");
		params.put("sos", "ps");
		params.put("fl", "scat");
		params.put("p", String.valueOf(atPage));

		String pageUrl = buildUdemyProductDiscoveryUrl(category.getCategoryId(), params);

		List<Course> courses = scrapeProductsOnPage(pageUrl);

		return courses;

	}

	public CourseDiscoverySchema parseCourseDiscoverySchema(String courseDiscoverySchema)
			throws JsonMappingException, JsonProcessingException {
		return objectMapper.readValue(courseDiscoverySchema, CourseDiscoverySchema.class);
	}

	private CourseDiscoverySchema parseCourseDiscoverySchema(JSONObject courseDiscoverySchema)
			throws JsonMappingException, JsonProcessingException {
		return parseCourseDiscoverySchema(courseDiscoverySchema.toString());
	}

	private String convertCategoryUrlToBreadcrumb(String udemyCategoryUrl) {

		String rootUrl = StringFormatter.removeTrailingSlash(UDEMY_ROOT_URL);

		if (!udemyCategoryUrl.startsWith(rootUrl))
			udemyCategoryUrl = rootUrl + udemyCategoryUrl;

		String regexp = "(?<=https:\\/\\/www\\.udemy\\.com\\/courses/).*";

		Matcher matcher = Pattern.compile(regexp).matcher(udemyCategoryUrl);

		String categoryUrlPaths = matcher.find() ? matcher.group() : "";

		String breadcrumb = String.join(" > ", categoryUrlPaths.replaceAll("-", " ").split("/"));

		return WordUtils.capitalize(breadcrumb);

	}

	public Topic parseTopic(ContextInfo contextInfo) {

		// also known as Topic
		Label courseLabel = contextInfo.getLabel();

		if (courseLabel == null)
			return null;

		int id = courseLabel.getId();
		String url = courseLabel.getUrl().startsWith(UDEMY_ROOT_URL) ? courseLabel.getUrl()
				: UDEMY_ROOT_URL + courseLabel.getUrl();
		String title = courseLabel.getTitle();

		return new Topic(null, id, title, url);
	}

	public Category parseCategory(ContextInfo contextInfo) {

		com.noxfl.axolotl.model.schema.udemy.api2.discoveryunits.Category category = contextInfo.getCategory();

		if (category == null)
			return null;

		// Fetch category

		int id = category.getId();
		String url = category.getUrl().startsWith(UDEMY_ROOT_URL) ? category.getUrl()
				: UDEMY_ROOT_URL + category.getUrl();
		String title = category.getTitle();
		String description = null;
		String breadcrumb = convertCategoryUrlToBreadcrumb(url);

		return new Category(null, id, url, title, description, breadcrumb);
	}

	public Topic parseTopic(SourceObject source) {

		if (source == null)
			return null;

		int id = source.getId();
		String url = source.getUrl();
		String title = source.getTitle();

		return new Topic(null, id, title, url);
	}

	public Category parseCategory(SourceObject source) {
		// Fetch category

		if (source == null)
			return null;

		int id = source.getId();
		String url = source.getUrl();
		String title = source.getTitle();
		String description = source.getDescription();
		String breadcrumb = convertCategoryUrlToBreadcrumb(url);

		return new Category(null, id, url, title, description, breadcrumb);
	}

	public void printCategory(List<SourceObject> sourceObjects) {
		if (sourceObjects == null || sourceObjects.size() == 0)
			return;
		System.out.println(String.format("[x] Received response\nCategory ID: %s\nCategory Name: %s",
				sourceObjects.get(0).getId(), sourceObjects.get(0).getTitle()));
	}

	public List<Course> addPricings(List<Course> courses) throws IOException {

		List<Integer> courseIds = courses.stream().map(course -> course.getCourseId()).toList();

		// Get prices as (int) courseId-Price pair
		HashMap<Integer, Price> prices = getPricingByCourseIds(courseIds);

		for (Course course : courses) {
			Price price = prices.get(course.getCourseId());
			course.getCourseDetail().setPrice(price);
		}

		return courses;
	}

	private String buildUdemyProductDiscoveryUrl(int topicId, HashMap<String, String> params) {
		List<String> paths = Arrays.asList(new String[] { "api-2.0", "discovery-units", "all_courses" });
		return HttpUtils.createUrl(UDEMY_ROOT_URL, paths, params);
	}

	/**
	 * 
	 * Returns List<Course> object
	 * 
	 * @param udemyJsonObject
	 * @return
	 * @throws RequestBlockedException
	 */
	private List<Course> extractCourses(List<Item> items) throws RequestBlockedException {

		List<Course> courses = new ArrayList<>();

		for (int i = 0; i < items.size(); i++) {

			Item item = items.get(i);

			int courseId = item.getId();

			double contentDuration = NumberUtils.findDecimalNumber(item.getContentInfoShort());

			Topic topic = parseTopic(item.getContextInfo());

			Category category = parseCategory(item.getContextInfo());

			Course course = new Course(courseId, item.getTitle(),
					StringFormatter.removeTrailingSlash(UDEMY_ROOT_URL) + item.getUrl(), item.getPublishedTime());

			course.setTopic(topic);

			course.setCategory(category);

			CourseDetail courseDetail = new CourseDetail(item.getInstructionalLevel(), contentDuration,
					item.getNumPublishedLectures(), null, item.getNumSubscribers(), item.getNumReviews(),
					DateTimeUtils.getCurrentDateTime());

			courseDetail.setCourseId(courseId);

			course.setCourseDetail(courseDetail);

			courses.add(course);

			System.out.println(String.format("[%s] Received: %s - %s", i + 1, course.getTitle(), course.getUrl()));

		}

		System.out.println(String.format("[*] Found %s items in current page", courses.size()));

		return courses;
	}

	private String buildPriceParams(List<Integer> courseIds) throws URISyntaxException {

		final String priceApiUrl = "https://www.udemy.com/api-2.0/pricing/?fields[pricing_result]=price,discount_price,list_price,price_detail,price_serve_tracking_id";

		URIBuilder pricingUri = new URIBuilder(priceApiUrl);

		String courseIdsString = courseIds.stream().map(id -> String.valueOf(id)).collect(Collectors.joining(","));

		pricingUri.addParameter("course_ids", courseIdsString);

		return pricingUri.build().toString();
	}

	private HashMap<Integer, Price> getPricingByCourseIds(List<Integer> courseIds) throws IOException {

		String priceApi = null;
		try {
			priceApi = buildPriceParams(courseIds);
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}

		JSONObject priceJson = HttpUtils.getJsonFromApiUrl(priceApi, headers);

		HashMap<Integer, Price> idPricingPair = new HashMap<>();

		DocumentContext priceContext = JsonPathUtils.getDocumentContext(priceJson, jsonPathConfiguration);

		for (Integer courseId : courseIds) {

			String priceRootPath = "$.courses" + String.format(".%s", courseId);

			Integer priceInt = priceContext.read(priceRootPath + ".price_detail.amount", Integer.class);
			if (priceInt == null)
				priceInt = 0;

			Integer priceDiscountInt = priceContext.read(priceRootPath + ".discount_price.amount", Integer.class);
			if (priceDiscountInt == null)
				priceDiscountInt = 0;

			String currency = priceContext.read(priceRootPath + String.format(".price.currency", courseId));
			String currencySymbol = priceContext
					.read(priceRootPath + String.format(".price.currency_symbol", courseId));

			Price price = new Price(courseId, true, priceInt, priceDiscountInt, currency, currencySymbol);

			idPricingPair.put(courseId, price);

		}

		return idPricingPair;
	}

	@Override
	public List<Course> scrapeProductsOnPage(String pageUrl)
			throws PageNotFoundException, RequestBlockedException, IOException {
		JSONObject courseDiscoveryJson = null;

		try {
			System.out.println("Sending GET request to: " + pageUrl);
			courseDiscoveryJson = HttpUtils.getJsonFromApiUrl(pageUrl, headers);
		} catch (IOException e) {
			e.printStackTrace();
		}

		CourseDiscoverySchema courseDiscoverySchema = null;

		try {
			courseDiscoverySchema = parseCourseDiscoverySchema(courseDiscoveryJson);
		} catch (JsonMappingException e1) {
			e1.printStackTrace();
		} catch (JsonProcessingException e1) {
			e1.printStackTrace();
		}

		List<SourceObject> sourceCategoriesOrTopic = courseDiscoverySchema.getUnit().getSourceObjects();

		// This can't be null because in this class we're scraping from
		// category or topic (duh)
		SourceObject source = sourceCategoriesOrTopic.get(0);
		String sourceType = sourceCategoriesOrTopic.get(0).getType();

		// Detect current page source (Category or Topic)

		List<Item> courseItems = courseDiscoverySchema.getUnit().getItems();

		List<Course> courses = extractCourses(courseItems);

		/*
		 * Synchronize categories of all courses in current page if the page source is
		 * from a category.
		 * 
		 * Sometimes category can be inconsistent and be missing subcategories, so this
		 * field needs to be ironed out. Topic is a consistent field, which means every
		 * course data has labels, so there is no need to iron it out.
		 */
		boolean isCategory = sourceType.equalsIgnoreCase("subcategory") || sourceType.equalsIgnoreCase("category");

		if (isCategory) {

			Category sourceCategory = parseCategory(source);

			for (Course course : courses) {
				course.setCategory(sourceCategory);

				if (saveCategoryOrTopicToDb) {
					topicDAO.save(course.getTopic());
					categoryDAO.save(course.getCategory());
				}
			}

		}

		courses = addPricings(courses);

		if (saveToDb) {
			for (Course course : courses)
				udemyCourseDAO.save(course);
		}

		return courses;
	}

	// scrapeAllProductsFromCategory() >> getCourses() >> getCourse() >> getPrice

}
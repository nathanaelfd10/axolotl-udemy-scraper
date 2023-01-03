/**
 * 
 */
package com.noxfl.axolotl;

import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.text.WordUtils;
import org.apache.http.client.utils.URIBuilder;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import com.noxfl.axolotl.utils.HttpUtils;

/**
 * @author Fernando Nathanael
 *
 */
public class BuilderTest {

	public void buildUdemyApiUrl() {
		// Max udemy page size is 60
		int pageSize = 60;
		String topicId = String.valueOf(50);

		String host = "https://udemy.com";

		List<String> paths = Arrays.asList(new String[] { "api-2.0", "discovery-units", "all_courses" });

		HashMap<String, String> params = new HashMap<>();
		params.put("page_size", String.valueOf(pageSize));
		params.put("subcategory", null);
		params.put("subcategory_id", topicId);
		params.put("source_page", "subcategory_page");
		params.put("locale", "en_US");
		params.put("currency", "idr");
		params.put("navigation_locale", "en_US");
		params.put("skip_price", "false");
		params.put("sos", "ps");
		params.put("fl", "scat");

		String url = HttpUtils.createUrl(host, paths, params);
		System.out.println(url);
	}

//	@Test
	public void buildUdemyCategoryBreadcrumb() {

		String categoryUrl = "/courses/development/programming-languages/";

		String[] categories = categoryUrl.replace("/courses/", "").replace("-", " ").split("/");

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < categories.length; i++) {
			sb.append(categories[i]);
			if (i < categories.length - 1)
				sb.append(" > ");
		}

		String breadcrumb = WordUtils.capitalize(sb.toString());

		System.out.println(breadcrumb);

		Assertions.assertThat(breadcrumb.equalsIgnoreCase("Development > Programming Languages"));
	}

	public String buildPriceParams(String apiUrl, List<Integer> courseIds) throws URISyntaxException {

		StringBuilder sb = new StringBuilder();

		URIBuilder pricingUri = new URIBuilder(apiUrl);

		for (int i = 0; i < courseIds.size(); i++) {
			sb.append(courseIds.get(i));
			if (i < courseIds.size() - 1) {
				sb.append(",");
			}
		}

		pricingUri.addParameter("course_ids", sb.toString());

		return pricingUri.build().toString();
	}

	@Test
	public void asd() {

		String priceApiTemplate = "https://www.udemy.com/api-2.0/pricing/?fields[pricing_result]=price,discount_price,list_price,price_detail,price_serve_tracking_id";

		List<Integer> courseIds = new ArrayList<>();
		
		// 622414,671576,765242
		
		courseIds.add(622414);
		courseIds.add(671576);
		courseIds.add(765242);

		String url = null;
		try {
			url = buildPriceParams(priceApiTemplate, courseIds);
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println(url);
		}
	}

}

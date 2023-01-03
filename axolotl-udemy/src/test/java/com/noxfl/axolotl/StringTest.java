/**
 * 
 */
package com.noxfl.axolotl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.text.WordUtils;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import com.noxfl.axolotl.scraper.page.category.impl.UdemyCategoryPageImpl;
import com.noxfl.axolotl.utils.StringFormatter;

/**
 * @author Fernando Nathanael
 *
 */
public class StringTest {

	private static final String UDEMY_ROOT_URL = UdemyCategoryPageImpl.UDEMY_ROOT_URL;

	public double findDecimalNumber(String str) {

		String regexp = "^[-+]?\\d*[.]?\\d+|^[-+]?\\d+[.]?\\d*";
		Pattern p = Pattern.compile(regexp);
		Matcher m = p.matcher(str);

		if (m.find())
			return Double.valueOf(m.group());

		return 0;

	}

	public String parseBreadcrumb(String udemyUnitsDiscoveryUrl) {

		// Ensures root url doesn't have trailing space.
		String rootUrl = StringFormatter.removeTrailingSlash(UDEMY_ROOT_URL);

		if (!udemyUnitsDiscoveryUrl.startsWith(rootUrl))
			udemyUnitsDiscoveryUrl = rootUrl + udemyUnitsDiscoveryUrl;

		String regexp = "(?<=https:\\/\\/www\\.udemy\\.com\\/courses/).*";

		Matcher matcher = Pattern.compile(regexp).matcher(udemyUnitsDiscoveryUrl);

		String categoryUrlPaths = matcher.find() ? matcher.group() : "";

		String breadcrumb = String.join(" > ", categoryUrlPaths.split("/"));

		return WordUtils.capitalize(breadcrumb);

	}

	@Test
	public void testExtractDecimal() {
		String input = "4.54 hourssssss";
		double expectedOutput = 4.54;

		double output = findDecimalNumber(input);
		Assertions.assertThat(output).isEqualTo(expectedOutput);
	}

	@Test
	public void testExtractUdemyBreadcrumb() {
		String input = "https://www.udemy.com/courses/business/industry/";
		String expectedOutput = "Business > Industry";

		String breadcrumb = parseBreadcrumb(input);

		Assertions.assertThat(breadcrumb).isEqualTo(expectedOutput);
	}

}

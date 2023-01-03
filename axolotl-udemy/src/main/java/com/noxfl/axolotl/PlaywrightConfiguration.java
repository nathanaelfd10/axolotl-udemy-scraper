/**
 * 
 */
package com.noxfl.axolotl;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Playwright;
import com.noxfl.axolotl.utils.StringFormatter;

/**
 * @author Fernando Nathanael
 *
 */
//@Configuration
public class PlaywrightConfiguration {

	@Value("${playwright.defaultTimeout}")
	private int defaultTimeout;

	@Value("${playwright.browser.type}")
	private String browserTypeString;

	@Value("${playwright.browser.channel}")
	private String browserChannelString;

	@Value("${playwright.headless}")
	private boolean isHeadless;

	@Value("${playwright.args}")
	private List<String> args;

	@Bean
	public Playwright playwright() {
		return Playwright.create();
	}

	@Bean
	public Browser browser(Playwright playwright) {

		BrowserType browserType = browserTypeSelector(playwright, browserTypeString);

		System.out.println("\nUsing browser: " + StringFormatter.capitalizeFirstLetter(browserType.name()));

		showActivePlaywrightArguments();

		return browserType.launch(
				new BrowserType.LaunchOptions().setHeadless(isHeadless).setArgs(args).setChannel(browserChannelString));
	}

	public void showActivePlaywrightArguments() {
		if (args == null || args.size() == 0)
			return;

		String argsAsString = String.join("\n", args);
		System.out.println("Active arguments for Playwright browser:\n" + argsAsString);
	}

	public BrowserType browserTypeSelector(Playwright playwright, String browserTypeString) {

		final BrowserType defaultBrowserType = playwright.chromium();
		final String defaultBrowserTypeName = defaultBrowserType.name();

		if (browserTypeString.isBlank()) {
			System.out.println("No browser type detected.\nDefaulting to " + defaultBrowserTypeName + ".");
			return defaultBrowserType;
		}

		switch (browserTypeString.toLowerCase()) {
		case "chromium":
			return playwright.chromium();
		case "firefox":
			return playwright.firefox();
		case "webkit":
			return playwright.webkit();
		default:
			System.out.println("Not a valid browser type: " + browserTypeString + "\nDefaulting to "
					+ defaultBrowserTypeName + ".");
			return defaultBrowserType;
		}

	}

}

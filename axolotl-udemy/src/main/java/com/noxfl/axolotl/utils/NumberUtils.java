/**
 * 
 */
package com.noxfl.axolotl.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Fernando Nathanael
 *
 */
public final class NumberUtils {

	public static int extractIntFromString(String str) {
		return Integer.valueOf(str.replaceAll("\\D", ""));
	}

	public static double findDecimalNumber(String str) {
		String regexp = "^[-+]?\\d*[.]?\\d+|^[-+]?\\d+[.]?\\d*";
		Matcher m = Pattern.compile(regexp).matcher(str);

		if (m.find())
			return Double.valueOf(m.group());

		return 0;
	}

	public static int generateRandomNumber(int min, int max) {
		return (int) ((Math.random() * (max - min)) + min);
	}

	public static int multiplyDecimalNumberInString(String string, int multiplier, String limiter)
			throws NumberFormatException {

		// This is an inefficient code, try to refactor later

		if (string == null)
			throw new NumberFormatException("String object can't be null.");
		else if (string.equalsIgnoreCase(""))
			throw new NumberFormatException("Please make sure a correct string was entered. Received: " + string);

		double priceDouble = Double.valueOf(string.replaceAll(limiter, ".").replaceAll("[^0-9.]+", "")) * multiplier;
		return (int) priceDouble;

	}

}
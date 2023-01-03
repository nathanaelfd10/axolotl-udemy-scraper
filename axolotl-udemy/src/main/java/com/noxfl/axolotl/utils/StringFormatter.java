/**
 * 
 */
package com.noxfl.axolotl.utils;

/**
 * @author Fernando Nathanael
 *
 */
public class StringFormatter {
	
	public static String capitalizeFirstLetter(String str) {
		if (str == null || str.length() == 0)
			return str;
		return str.substring(0, 1).toUpperCase() + str.substring(1);
	}

	public static String removeTrailingSlash(String url) {
		return url.endsWith("/") ? url.substring(0, url.length() - 1) : url;
	}
	
}
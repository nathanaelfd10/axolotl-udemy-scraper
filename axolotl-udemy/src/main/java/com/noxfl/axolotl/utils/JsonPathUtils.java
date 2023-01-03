/**
 * 
 */
package com.noxfl.axolotl.utils;

import org.json.JSONObject;

import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;

/**
 * @author Fernando Nathanael
 *
 */
public class JsonPathUtils {

	public static DocumentContext getDocumentContext(JSONObject json) {
		/**
		 * Returns JSONPath DocumentContext
		 */
		return JsonPath.parse(json);
	}

	public static DocumentContext getDocumentContext(String jsonString) {
		/**
		 * Returns JSONPath DocumentContext
		 */
		return JsonPath.parse(jsonString);
	}

	public static DocumentContext getDocumentContext(String jsonString, Configuration config) {
		/**
		 * Using JSONPath Config, returns JSONPath DocumentContext
		 */
		return JsonPath.using(config).parse(jsonString);
	}

	public static DocumentContext getDocumentContext(JSONObject json, Configuration config) {
		/**
		 * Using JSONPath Config, returns JSONPath DocumentContext
		 */
		return JsonPath.using(config).parse(json);
	}

}

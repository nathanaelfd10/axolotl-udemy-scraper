/**
 * 
 */
package com.noxfl.axolotl.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import org.apache.http.client.utils.URIBuilder;
import org.json.JSONObject;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author Fernando Nathanael
 *
 */
@Component
@Scope("prototype")
public class HttpUtils {

	public static JSONObject getJsonFromApiUrl(String url, HashMap<String, String> headers) throws IOException {

		StringBuilder response = null;

		URL urlObj = new URL(url);

		HttpURLConnection con = (HttpURLConnection) urlObj.openConnection();

		con.setRequestMethod("GET");

		for (String header : headers.keySet()) {
			con.setRequestProperty(header, headers.get(header));
		}

		BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(), "utf-8"));

		response = new StringBuilder();
		String responseLine = null;
		while ((responseLine = br.readLine()) != null) {
			response.append(responseLine.trim());
		}

		return new JSONObject(response.toString());

	}

	public static String createUrl(String rootUrl, List<String> paths, HashMap<String, String> params) {
		String url = null;
		URIBuilder uri = null;
		try {
			uri = new URIBuilder(rootUrl);
			StringBuilder sb = new StringBuilder();
			for (String path : paths)
				sb.append("/" + path);

			uri.setPath(sb.toString());

			for (Entry<String, String> param : params.entrySet())
				uri.addParameter(param.getKey(), param.getValue());

			url = uri.build().toString();

		} catch (URISyntaxException e) {
			e.printStackTrace();
		}

		return url;
	}

}

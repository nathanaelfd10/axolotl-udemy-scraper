/**
 * 
 */
package com.noxfl.axolotl.utils;

import java.net.URI;
import java.net.URISyntaxException;

import com.google.common.net.InternetDomainName;

/**
 * @author Fernando Nathanael
 *
 */
public class UrlUtils {

	public static String getDomainName(String url) throws URISyntaxException {
		URI uri = new URI(url);
		String host = uri.getHost();
		InternetDomainName internetDomainName = InternetDomainName.from(host).topPrivateDomain();
		String domainName = internetDomainName.toString();
//		String publicSuffix = internetDomainName.publicSuffix().toString();
//		String name = domainName.substring(0, domainName.lastIndexOf("." + publicSuffix));

		return domainName;
	}

	public static String generateShopeeFullProductUrl(String title, String itemId, String shopId) {

		String productUrlTemplate = "https://www.shopee.co.id/%s-i.%s.%s";

		return String.format(productUrlTemplate, title.replaceAll(" ", "-"), shopId, itemId);
	}
}

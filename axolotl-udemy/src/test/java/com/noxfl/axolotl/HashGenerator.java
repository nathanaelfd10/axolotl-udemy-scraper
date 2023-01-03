/**
 * 
 */
package com.noxfl.axolotl;

import static org.assertj.core.api.Assertions.assertThat;

import java.security.MessageDigest;

import javax.xml.bind.DatatypeConverter;

import org.junit.jupiter.api.Test;

/**
 * @author Fernando Nathanael
 *
 */
public class HashGenerator {

	static String getShopeeItemId(String productUrl) {
		String regExp = "https://shopee.co.id/.*-i.";
		return productUrl.replaceAll(regExp, "").split("[.]")[1];
	};

	static String getShopeeShopId(String productUrl) {
		String regExp = "https://shopee.co.id/.*-i.";
		return productUrl.replaceAll(regExp, "").split("[.]")[0];
	}

	public static void main(String[] args) {
		
		String generatedMd5 = null;

		String input = "https://shopee.co.id/Tp-Link-WR840-versi-6-300Mbps-Werless-N-Router-i.706340567.17335694056";

		String itemId = getShopeeItemId(input);
		String shopId = getShopeeShopId(input);

		String newFormatTemplate = "https://shopee.co.id/product/%s/%s";

		String newFormat = String.format(newFormatTemplate, shopId, itemId);

		System.out.println(newFormat);

		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(newFormat.getBytes());
			byte[] digest = md.digest();
			generatedMd5 = DatatypeConverter.printHexBinary(digest).toLowerCase();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Generated: " + generatedMd5);
	}

}

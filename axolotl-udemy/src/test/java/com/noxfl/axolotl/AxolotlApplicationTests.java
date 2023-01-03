package com.noxfl.axolotl;

import static org.assertj.core.api.Assertions.assertThat;

import java.security.MessageDigest;
import java.util.HashMap;

import javax.xml.bind.DatatypeConverter;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AxolotlApplicationTests {

	String getShopeeItemId(String productUrl) {
		String regExp = "https://shopee.co.id/.*-i.";		
		return productUrl.replaceAll(regExp, "").split("[.]")[1];
	};

	String getShopeeShopId(String productUrl) {
		String regExp = "https://shopee.co.id/.*-i.";
		return productUrl.replaceAll(regExp, "").split("[.]")[0];
	}

	@Test
	void generateMd5HashNewFormat() {

		String generatedMd5 = null;
		
		String input = "https://shopee.co.id/TP-Link-TP-Link-EAP110-Outdoor-EAP110-Outdoor-300Mbps-Wireless-N-Outdoor-Access-Point-i.1898501.1500697706";
		String expectedHash = "d85ab5613398864b192fcf24b0dedfd0";

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

		assertThat(generatedMd5.equals(expectedHash)).isTrue();

	}

}

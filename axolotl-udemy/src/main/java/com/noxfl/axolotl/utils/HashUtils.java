/**
 * 
 */
package com.noxfl.axolotl.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.xml.bind.DatatypeConverter;

/**
 * @author Fernando Nathanael
 *
 */
public class HashUtils {

	public static String generateMd5Hash(String str) {
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(str.getBytes());
			byte[] digest = md.digest();
			return DatatypeConverter.printHexBinary(digest).toLowerCase();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}

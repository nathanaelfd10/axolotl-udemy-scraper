/**
 * 
 */
package com.noxfl.axolotl.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Component;

/**
 * @author Fernando Nathanael
 *
 */
@Component
public class DateTimeUtils {
	
	public static String getCurrentDateTime() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		return dtf.format(now);
	}
	
	public static String getCurrentDate() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDateTime now = LocalDateTime.now();
		return dtf.format(now);
	}

}

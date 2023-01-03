/**
 * 
 */
package com.noxfl.axolotl.utils;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.opencsv.CSVReader;

/**
 * @author Fernando Nathanael
 *
 */
public class CsvUtils {

	public List<List<String>> readCsv(String filePath) {

		List<List<String>> records = new ArrayList<>();

		try (CSVReader csvReader = new CSVReader(new FileReader(filePath))) {
			String[] values = null;
			while ((values = csvReader.readNext()) != null) {
				records.add(Arrays.asList(values));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return records;
	}

}

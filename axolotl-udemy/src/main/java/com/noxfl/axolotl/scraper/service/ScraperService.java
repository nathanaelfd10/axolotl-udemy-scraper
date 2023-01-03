/**
 * 
 */
package com.noxfl.axolotl.scraper.service;

import java.util.List;

import com.noxfl.axolotl.scraper.PageNotFoundException;
import com.noxfl.axolotl.scraper.RequestBlockedException;

/**
 * @author Fernando Nathanael
 *
 */
public interface ScraperService<E, T> {

	// Add URISyntaxException?
	public E scrapeProduct(String productUrl) throws RequestBlockedException, PageNotFoundException;

	public List<E> scrapeProducts(List<String> productUrls);

	public List<E> scrapeProductsFromCategoryPage(T t);

}
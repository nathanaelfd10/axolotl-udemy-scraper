/**
 * 
 */
package com.noxfl.axolotl.scraper.page;

import java.io.IOException;
import java.util.List;

import com.noxfl.axolotl.scraper.PageNotFoundException;
import com.noxfl.axolotl.scraper.RequestBlockedException;

/**
 * @author Fernando Nathanael
 *
 */
public interface ProductListingPage<E> {

	public List<E> scrapeProductsOnPage(String pageUrl) throws PageNotFoundException, RequestBlockedException, IOException;

}
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
public interface CategoryListingPage<E, T> extends ProductListingPage<E> {

	/**
	 * 
	 * Scrape products from selected category
	 * 
	 * @param t
	 * @return
	 * @throws RequestBlockedException
	 */

	public List<E> findProductsInCategory(T t, int atPage)
			throws PageNotFoundException, RequestBlockedException, IOException;

	public List<E> findProductsInCategory(T t, int minPage, int maxPage)
			throws PageNotFoundException, RequestBlockedException, IOException;

}
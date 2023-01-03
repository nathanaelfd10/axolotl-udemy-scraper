/**
 * 
 */
package com.noxfl.axolotl.scraper.page;

import java.util.List;

import com.noxfl.axolotl.scraper.PageNotFoundException;
import com.noxfl.axolotl.scraper.RequestBlockedException;

/**
 * @author Fernando Nathanael
 *
 */
public interface ProductDetailPage<E> {

	public E getProduct(String productUrl) throws PageNotFoundException, RequestBlockedException;

	public List<E> getProducts(List<String> productUrl) throws PageNotFoundException, RequestBlockedException;

}
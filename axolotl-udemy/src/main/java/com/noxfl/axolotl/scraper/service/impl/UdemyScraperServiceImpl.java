/**
 * 
 */
package com.noxfl.axolotl.scraper.service.impl;

import java.util.List;

import com.noxfl.axolotl.model.udemy.Category;
import com.noxfl.axolotl.model.udemy.Course;
import com.noxfl.axolotl.scraper.PageNotFoundException;
import com.noxfl.axolotl.scraper.RequestBlockedException;
import com.noxfl.axolotl.scraper.page.CategoryListingPage;
import com.noxfl.axolotl.scraper.service.ScraperService;

/**
 * @author Fernando Nathanael
 *
 */
public class UdemyScraperServiceImpl implements ScraperService<Course, Category> {

	private CategoryListingPage categoryScraper;

	public UdemyScraperServiceImpl(CategoryListingPage categoryScraper) {
		this.categoryScraper = categoryScraper;
	}

	@Override
	public Course scrapeProduct(String productUrl) throws RequestBlockedException, PageNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Course> scrapeProducts(List<String> productUrls) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Course> scrapeProductsFromCategoryPage(Category t) {
		return null;
	}

}
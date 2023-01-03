/**
 * 
 */
package com.noxfl.axolotl;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.noxfl.axolotl.dao.udemy.CourseDAO;
import com.noxfl.axolotl.model.udemy.Category;
import com.noxfl.axolotl.model.udemy.Course;
import com.noxfl.axolotl.scraper.PageNotFoundException;
import com.noxfl.axolotl.scraper.RequestBlockedException;
import com.noxfl.axolotl.scraper.page.category.UdemyCategoryPage;

/**
 * @author Fernando Nathanael
 *
 */
@Component
public class UdemyRunner implements CommandLineRunner {

	private UdemyCategoryPage udemyCategoryScraper;
	private CourseDAO courseEntityDAO;

	@Autowired
	private ConfigurableApplicationContext ctx;

	@Autowired
	private void setScraperService(UdemyCategoryPage udemyCategoryScraper, CourseDAO courseEntityDAO) {
		this.udemyCategoryScraper = udemyCategoryScraper;
		this.courseEntityDAO = courseEntityDAO;
	}

	private void userInterface() throws PageNotFoundException, RequestBlockedException, IOException {
		Scanner scan = new Scanner(System.in);
		System.out.print("Category id: ");
		int categoryId = scan.nextInt();

		Category category = new Category();
		category.setCategoryId(categoryId);
		category.setTitle("Placeholder Category Title");

		System.out.print("Min page: ");
		int minPage = scan.nextInt();

		System.out.print("Max page: ");
		int maxPage = scan.nextInt();

		List<Course> courses = udemyCategoryScraper.findProductsInCategory(category, minPage, maxPage);

		courses.forEach(course -> courseEntityDAO.save(course));

		Scanner scan2 = new Scanner(System.in);

		System.out.print("Continue? (Y/N): ");
		String option = scan2.nextLine();

		if (option.equalsIgnoreCase("y"))
			userInterface();
	}

	@Override
	public void run(String... args) throws Exception {

		// 20 = Industry category

		userInterface();

		ctx.close();

	}

}

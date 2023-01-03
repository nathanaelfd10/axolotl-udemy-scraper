/**
 * 
 */
package com.noxfl.axolotl.scraper.service.impl;

import java.util.List;

import com.noxfl.axolotl.dao.udemy.CourseDAO;
import com.noxfl.axolotl.model.udemy.Course;
import com.noxfl.axolotl.scraper.service.CourseService;

/**
 * @author Fernando Nathanael
 *
 */
public class CourseServiceImpl implements CourseService {

	private CourseDAO courseDAO;

	public CourseServiceImpl(CourseDAO courseDAO) {
		this.courseDAO = courseDAO;
	}

	@Override
	public List<Course> findAll() {
		return courseDAO.findAll();
	}

	@Override
	public Course findById(Integer id) {
		return courseDAO.findById(id);
	}

	@Override
	public void save(Course e) {
		courseDAO.save(e);
	}

	@Override
	public void deleteById(Integer id) {
		courseDAO.deleteById(id);
	}

}

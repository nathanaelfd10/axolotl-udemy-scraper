/**
 * 
 */
package com.noxfl.axolotl.dao.udemy.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.noxfl.axolotl.dao.udemy.CourseDAO;
import com.noxfl.axolotl.model.udemy.Course;

/**
 * @author Fernando Nathanael
 *
 */
@Repository
@Transactional
public class CourseDAOImpl implements CourseDAO {

	private EntityManager entityManager;

	public CourseDAOImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public List<Course> findAll() {
		Session currentSession = entityManager.unwrap(Session.class);

		Query<Course> query = currentSession.createQuery("from Course", Course.class);

		List<Course> courses = query.getResultList();

		return courses;
	}

	@Override
	public Course findById(Integer courseId) {
		Session currentSession = entityManager.unwrap(Session.class);

		Course courseEntity = currentSession.get(Course.class, courseId);

		return courseEntity;
	}

	@Override
	public void save(Course course) {
		Session currentSession = entityManager.unwrap(Session.class);

		currentSession.saveOrUpdate(course);
	}

	@Override
	public void deleteById(Integer courseId) {
		Session currentSession = entityManager.unwrap(Session.class);

		Query query = currentSession.createQuery("delete from Course where id=:id");
		query.setParameter("id", courseId);

		query.executeUpdate();
	}

}
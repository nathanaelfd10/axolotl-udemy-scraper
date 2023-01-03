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

import com.noxfl.axolotl.dao.udemy.CategoryDAO;
import com.noxfl.axolotl.model.udemy.Category;

/**
 * @author Fernando Nathanael
 *
 */
@Repository
@Transactional
public class CategoryDAOImpl implements CategoryDAO {

	private EntityManager entityManager;

	public CategoryDAOImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public List<Category> findAll() {
		Session currentSession = entityManager.unwrap(Session.class);

		Query<Category> query = currentSession.createQuery("Category", Category.class);

		List<Category> categories = query.getResultList();

		return categories;
	}

	@Override
	public Category findById(Integer id) {
		Session currentSession = entityManager.unwrap(Session.class);

		Category category = currentSession.get(Category.class, id);

		return category;
	}

	@Override
	public void save(Category course) {
		Session currentSession = entityManager.unwrap(Session.class);

		currentSession.saveOrUpdate(course);
	}

	@Override
	public void deleteById(Integer id) {
		Session currentSession = entityManager.unwrap(Session.class);

		Query query = currentSession.createQuery("delete from Category where id=:id");
		query.setParameter("id", id);

		query.executeUpdate();
	}

}
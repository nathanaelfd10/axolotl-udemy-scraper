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

import com.noxfl.axolotl.dao.udemy.TopicDAO;
import com.noxfl.axolotl.model.udemy.Topic;

/**
 * @author Fernando Nathanael
 *
 */
@Repository
@Transactional
public class TopicDAOImpl implements TopicDAO {

	private EntityManager entityManager;

	public TopicDAOImpl(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}

	@Override
	public List<Topic> findAll() {
		Session currentSession = entityManager.unwrap(Session.class);

		Query<Topic> query = currentSession.createQuery("from Topic", Topic.class);

		List<Topic> topics = query.getResultList();

		return topics;
	}

	@Override
	public Topic findById(Integer id) {
		Session currentSession = entityManager.unwrap(Session.class);

		Topic topic = currentSession.get(Topic.class, id);

		return topic;
	}

	@Override
	public void save(Topic topic) {
		Session currentSession = entityManager.unwrap(Session.class);

		currentSession.saveOrUpdate(topic);
	}

	@Override
	public void deleteById(Integer id) {
		Session currentSession = entityManager.unwrap(Session.class);

		Query query = currentSession.createQuery("delete from Topic where id=:id");
		query.setParameter("id", id);

		query.executeUpdate();
	}

}

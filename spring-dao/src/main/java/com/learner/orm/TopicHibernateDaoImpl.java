package com.learner.orm;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TopicHibernateDaoImpl {

	@Autowired
	SessionFactory sessionFactory;

	public int getCount() {

		String hql = "select count(*) from Topic";// Not working with 'topic'

		Query<Long> query = sessionFactory.openSession().createQuery(hql);

		Long topicCount = query.getSingleResult();

		System.out.println("Topic Count :" + topicCount);
		return topicCount.intValue();

	}

}

package com.learner.jpa;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.learner.entity.Topic;

@Repository
public class TopicJpaDaoImpl {

	@Autowired
	EntityManager entityManager;
	
	@Transactional
	public void insert() {
		Topic topic = new Topic();
		topic.setName("Spring Core");
		topic.setDescription("Spring Core Desc");
		
		entityManager.persist(topic);
		
		System.out.println("Topic inserted successfully using JPA!!!!");
	}
	
}

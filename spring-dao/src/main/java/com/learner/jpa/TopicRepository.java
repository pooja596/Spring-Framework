package com.learner.jpa;

import org.springframework.data.repository.CrudRepository;

import com.learner.entity.Topic;

public interface TopicRepository extends CrudRepository<Topic, Integer>{
	
}

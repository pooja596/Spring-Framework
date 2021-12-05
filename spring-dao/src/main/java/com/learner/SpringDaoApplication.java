package com.learner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.learner.core.jdbc.TopicCoreJdbcDaoImpl;
import com.learner.entity.Topic;
import com.learner.jdbc.TopicJdbcDaoImpl;
import com.learner.jpa.TopicJpaDaoImpl;

@SpringBootApplication
public class SpringDaoApplication implements CommandLineRunner {

	@Autowired
	TopicJdbcDaoImpl topicJdbcDaoImpl;

	@Autowired
	TopicJpaDaoImpl topicJpaDaoImpl;

	@Autowired
	TopicCoreJdbcDaoImpl topicCoreJdbcDaoImpl;

	public static void main(String[] args) {
		SpringApplication.run(SpringDaoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("TopicJdbcDaoImpl.insert() start!!");
		topicJdbcDaoImpl.insert();
		System.out.println("TopicJdbcDaoImpl.insert() end!!");

		System.out.println();

		System.out.println("TopicJpaDaoImpl.insert() start!!");
		topicJpaDaoImpl.insert();
		System.out.println("TopicJpaDaoImpl.insert() end!!");

		System.out.println();

		System.out.println("TopicCoreJdbcDaoImpl.insert() start!!");
		topicCoreJdbcDaoImpl.insert();
		System.out.println("TopicCoreJdbcDaoImpl.insert() end!!");

		System.out.println();

		System.out.println("TopicCoreJdbcDaoImpl.insertByUsingDataSource() start!!");
		topicCoreJdbcDaoImpl.insertByUsingDataSource();
		System.out.println("TopicCoreJdbcDaoImpl.insertByUsingDataSource() end!!");

		System.out.println();

		System.out.println("topicJdbcDaoImpl.getCount() start!!");
		topicJdbcDaoImpl.getCount();
		System.out.println("topicJdbcDaoImpl.getCount() end!!");

		System.out.println();

		System.out.println("topicJdbcDaoImpl.getTopic() start!!");
		topicJdbcDaoImpl.getTopic(1);
		System.out.println("topicJdbcDaoImpl.getTopic() end!!");

		System.out.println();

		System.out.println("topicJdbcDaoImpl.getAllTopic() start!!");
		System.out.println(topicJdbcDaoImpl.getAllTopic().size());
		System.out.println("topicJdbcDaoImpl.getAllTopic() end!!");

		System.out.println();

		System.out.println("topicJdbcDaoImpl.insertTopic() start!!");
		Topic topic = new Topic(10, "Random ", "Random Desc");
		System.out.println(topicJdbcDaoImpl.insertTopic(topic));
		System.out.println("topicJdbcDaoImpl.insertTopic() end!!");

	}

}

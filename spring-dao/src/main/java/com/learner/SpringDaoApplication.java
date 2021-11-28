package com.learner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.learner.jdbc.TopicJdbcDaoImpl;
import com.learner.jpa.TopicJpaDaoImpl;

@SpringBootApplication
public class SpringDaoApplication implements CommandLineRunner{

	@Autowired
	TopicJdbcDaoImpl topicJdbcDaoImpl;
	
	@Autowired
	TopicJpaDaoImpl topicJpaDaoImpl;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringDaoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {		
		System.out.println("TopicJdbcDaoImpl.insert() start!!");
		topicJdbcDaoImpl.insert();
		System.out.println("TopicJdbcDaoImpl.insert() end!!");
		
		System.out.println("TopicJpaDaoImpl.insert() start!!");
		topicJpaDaoImpl.insert();
		System.out.println("TopicJpaDaoImpl.insert() end!!");		
		
	}

}

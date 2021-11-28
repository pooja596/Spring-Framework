package com.learner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.learner.jdbc.TopicJdbcDaoImpl;

@SpringBootApplication
public class SpringDaoApplication implements CommandLineRunner{

	@Autowired
	TopicJdbcDaoImpl topicJdbcDaoImpl;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringDaoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {		
		topicJdbcDaoImpl.insert();
	}

}

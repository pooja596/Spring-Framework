package com.learner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.learner.model.Circle;

@SpringBootApplication
public class SpringAopApplication implements CommandLineRunner {

	@Autowired
	private Circle circle;

	public static void main(String[] args) {
		SpringApplication.run(SpringAopApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		circle.setName("circleName");
//		circle.setNameAndReturn("Dummy name");
//		circle.setRadiousAndThrowException(10);
//		System.out.println(circle.getName());
//		System.out.println(circle.getRadious());
	}

}

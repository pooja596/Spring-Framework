package com.learner.model;

import org.springframework.stereotype.Component;

@Component
public class Circle {

	private String name;
	private int radious;

	public String getName() {
		System.out.println("Inside Circle.getName()!!!");
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRadious() {
		System.out.println("Inside Circle.getRadious()!!!");
		return radious;
	}

	public void setRadious(int radious) {
		this.radious = radious;
	}

}

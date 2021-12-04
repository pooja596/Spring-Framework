package com.learner.model;

import org.springframework.stereotype.Component;

import com.learner.aspects.Loggable;

@Component
public class Circle {

	private String name;
	private int radious;

	public String getName() {
		System.out.println("Inside Circle.getName()!!!");
		return name;
	}

	@Loggable
	public void setName(String name) {
		System.out.println("Inside Circle.setName()!!!");
		this.name = name;
	}

	public String setNameAndReturn(String name) {
		System.out.println("Inside Circle.setName()!!!");
		this.name = name;
		return name;
	}

	public int getRadious() {
		System.out.println("Inside Circle.getRadious()!!!");
		return radious;
	}

	public void setRadious(int radious) {
		System.out.println("Inside Circle.setRadious()!!!");
		this.radious = radious;
	}

	public void setRadiousAndThrowException(int radious) {
		System.out.println("Inside Circle.setRadious()!!!");
		this.radious = radious;
		throw new RuntimeException();
	}

	@Override
	public String toString() {
		return "Circle [name=" + name + ", radious=" + radious + "]";
	}

}

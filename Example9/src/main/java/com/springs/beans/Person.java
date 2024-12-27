package com.springs.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {

	private String name;//for final variable make use of constructor injection
	
	/* @Autowired */  //field Injection
	private Animal pet;
	public String getName() {
		return name;
	}
	

	
	@Override
	public String toString() {
		return "Person [name=" + name + ", pet=" + pet + "]";
	}
	@Autowired
	public Person(@Qualifier("Animal3") Animal pet) {
		super();
		//this.name = name;
		this.pet = pet;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Animal getPet() {
		return pet;
	}
	//@Autowired
	public void setPet(Animal pet) {
		this.pet = pet;
	}
	
}

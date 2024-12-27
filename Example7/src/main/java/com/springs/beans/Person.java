package com.springs.beans;

import org.springframework.stereotype.Component;

@Component
public class Person {

	private String name;
	private Animal pet;
	public String getName() {
		return name;
	}
	public Person() {
		super();
		
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", pet=" + pet + "]";
	}
	public Person(String name, Animal pet) {
		super();
		this.name = name;
		this.pet = pet;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Animal getPet() {
		return pet;
	}
	public void setPet(Animal pet) {
		this.pet = pet;
	}
	
}

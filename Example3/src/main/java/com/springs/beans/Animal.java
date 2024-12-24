package com.springs.beans;

import org.springframework.stereotype.Component;

@Component
public class Animal {
private String colour;
private String name;
public Animal(String colour, String name) {
	super();
	this.colour = colour;
	this.name = name;
}
public String getColour() {
	return colour;
}
public void setColour(String colour) {
	this.colour = colour;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Animal() {
	super();
	// TODO Auto-generated constructor stub
}

public void bark() {
	System.out.println("Animal "+name+" is shouting");
}

}

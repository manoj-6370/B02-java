package com.springs.beans;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class Animal {
private String colour;
@Override
public String toString() {
	return "Animal [colour=" + colour + ", name=" + name + "]";
}

private String name="jam";

public Animal(String colour, String name) {
	
	this.colour = colour;
	this.name = name;
}

@PostConstruct
public void init() {
	
    System.out.println("Animal [Name: "+"animl ; "+"colour: "+"unknown] from postconstruct.");
}
@PreDestroy
public void destroy() {
	System.out.println("Bean Destroyed: from Predestroy method .");
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
	
}

public void bark() {
	System.out.println("Animal "+name+" is shouting");
}

}

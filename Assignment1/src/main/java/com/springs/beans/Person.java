package com.springs.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
private String name;

private Vehicle vehicle;
@Override
public String toString() {
	return "Person [name=" + name + ", vehicle=" + vehicle + "]";
}


@Autowired
public Person( Vehicle vehicle) {
	
	//this.name = name;
	this.vehicle = vehicle;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Vehicle getVehicle() {
	return vehicle;
}

public void setVehicle(Vehicle vehicle) {
	this.vehicle = vehicle;
}
}

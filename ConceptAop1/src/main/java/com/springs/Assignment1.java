package com.springs;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springs.beans.Person;
import com.springs.config.ProjectConfiguration;

public class Assignment1 {

	public static void main(String[] args) {
		var context= new AnnotationConfigApplicationContext(ProjectConfiguration.class);
		Person p=context.getBean(Person.class);
		
		p.getVehicle().getVehicleService().StartVehicle(true);
		p.getVehicle().getVehicleService().getSpeaker().makeSound();
		p.getVehicle().getVehicleService().getTyre().rotate();
		
	}
	
}

package com.springs;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springs.beans.Animal;
import com.springs.config.ProjectConfiguration;

public class Example5 {

	public static void main(String[] args) {
		var context= new AnnotationConfigApplicationContext(ProjectConfiguration.class);
		Animal a1=context.getBean(Animal.class);
		//Here we are using @ComponentScan to Scan the Beans
	a1.setName("Lion");
           a1.bark();
           a1.setName("Rat");
           a1.bark();
       	Animal a2=context.getBean(Animal.class);
       	a2.bark();
		
	}
	
}

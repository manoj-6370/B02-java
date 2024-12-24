package com.springs;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springs.beans.Animal;
import com.springs.config.ProjectConfiguration;

public class Example3 {

	public static void main(String[] args) {
		var context= new AnnotationConfigApplicationContext(ProjectConfiguration.class);
		Animal a1=context.getBean(Animal.class);
	     //^ Here i have used @Primery on top of Bean Configuration 
           a1.bark();
		
	}
	
}

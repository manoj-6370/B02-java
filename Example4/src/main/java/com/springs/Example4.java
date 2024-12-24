package com.springs;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springs.beans.Animal;
import com.springs.config.ProjectConfiguration;

public class Example4 {

	public static void main(String[] args) {
		var context= new AnnotationConfigApplicationContext(ProjectConfiguration.class);
		Animal a1=context.getBean("bear",Animal.class);
		Animal a2=context.getBean("panda",Animal.class);
		Animal a3=context.getBean("tiger",Animal.class);
		
		a1.bark();
		a2.bark();
		a3.bark();
		
	}
	
}

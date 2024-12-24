package com.springs;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springs.beans.Animal;
import com.springs.config.ProjectConfiguration;

public class Example2 {

	public static void main(String[] args) {
		var context= new AnnotationConfigApplicationContext(ProjectConfiguration.class);
		Animal a1=context.getBean(Animal.class);
		//^We have multiple Bean for Same Class Animal. Here I have not specified which Bean has to be created for Animal class
		//^so we will get an --"NoUniqueBeanDefinitionException" 
           a1.bark();
		
	}
	
}

package com.springs;



import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springs.beans.Person;
import com.springs.config.ProjectConfiguration;

public class Example9 {

	public static void main(String[] args) {
		//closing context with try with resourse
		try(var context= new AnnotationConfigApplicationContext(ProjectConfiguration.class);){
		Person person1=context.getBean(Person.class);
		System.out.println(person1);
		}
		
		
		
		
	}
	
}

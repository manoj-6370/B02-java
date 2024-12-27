package com.springs;

import java.util.Random;
import java.util.function.Supplier;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springs.beans.Animal;
import com.springs.beans.Person;
import com.springs.config.ProjectConfiguration;

public class Example9 {

	public static void main(String[] args) {
		var context= new AnnotationConfigApplicationContext(ProjectConfiguration.class);
		Person person1=context.getBean(Person.class);
		System.out.println(person1);
		
		
		
		
		
	}
	
}

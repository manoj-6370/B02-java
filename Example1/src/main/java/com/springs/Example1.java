package com.springs;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springs.beans.Animal;
import com.springs.config.ProjectConfiguration;

public class Example1 {

	public static void main(String[] args) {
		var context= new AnnotationConfigApplicationContext(ProjectConfiguration.class);
		Animal a1=context.getBean("Animal2",Animal.class);
		//^Here I have specified the bean throw the method name
		//Note:- if we have not given names for Bean then ,the method name will be the bean name
           a1.bark();
		
	}
	
}

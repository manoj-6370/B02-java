package com.springs;

import java.util.Random;
import java.util.function.Supplier;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springs.beans.Animal;
import com.springs.config.ProjectConfiguration;

public class Example7 {

	public static void main(String[] args) {
		var context= new AnnotationConfigApplicationContext(ProjectConfiguration.class);
		
		
		
		
		
		//Animal a1=context.getBean("Animal2",Animal.class);
		//^Here I have specified the bean throw the method name
		//Note:- if we have not given names for Bean then ,the method name will be the bean name
          // a1.bark();
		
	}
	
}

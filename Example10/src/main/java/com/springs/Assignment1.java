package com.springs;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springs.config.ProjectConfiguration;

public class Assignment1 {

	public static void main(String[] args) {
		var context= new AnnotationConfigApplicationContext(ProjectConfiguration.class);
		
		
	}
	
}

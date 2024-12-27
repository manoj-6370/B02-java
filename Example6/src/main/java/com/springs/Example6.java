package com.springs;

import java.util.Random;
import java.util.function.Supplier;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springs.beans.Animal;
import com.springs.config.ProjectConfiguration;

public class Example6 {

	public static void main(String[] args) {
		var context= new AnnotationConfigApplicationContext(ProjectConfiguration.class);
		Supplier<Animal> monkeySupp =()->{
			Animal monkey=new Animal();
			monkey.setName("king");
			monkey.setColour("gold");
			return monkey;
		};
		Supplier<Animal> catSupp=()->{
			Animal cat=new Animal();
			cat.setName("rick");
			cat.setColour("white");
			return cat;
		};
		
		
		Random random=new Random();
		int randomNumber=random.nextInt(10);
		System.out.println("Random number is "+randomNumber+"");
		context.registerBean("cat",Animal.class,catSupp);
		context.registerBean("monkey",Animal.class,monkeySupp);
		
		Animal animal1;
		if(randomNumber%2==0) {
		
			animal1=context.getBean("monkey", Animal.class);
		}
		else {
			
			animal1=context.getBean("cat", Animal.class);
		}
		
		animal1.bark();
		context.close();
		
		
		
		
		//Animal a1=context.getBean("Animal2",Animal.class);
		//^Here I have specified the bean throw the method name
		//Note:- if we have not given names for Bean then ,the method name will be the bean name
          // a1.bark();
		
	}
	
}

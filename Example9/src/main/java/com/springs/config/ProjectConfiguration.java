package com.springs.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.springs.beans.Animal;
import com.springs.beans.Person;

//@ComponentScan(basePackages  = {"com.springs.beans"})
@ComponentScan(basePackageClasses  = {com.springs.beans.Person.class})
@Configuration
public class ProjectConfiguration {

	@Bean
	public Animal Animal1() {
		Animal a1= new Animal();
		a1.setColour("black");
		a1.setName("Bear");
		return a1;
	}
	@Bean
	public Animal Animal2() {
		Animal a1= new Animal();
		a1.setColour("white");
		a1.setName("Panda");
		return a1;
	}
	@Bean("Animal3")
	public Animal Animal3() {
		Animal a1= new Animal();
		a1.setColour("yellow-black");
		a1.setName("Tiger");
		return a1;
	}
//	@Bean
//	public Person person1() {
//		Person person1=   new Person();
//		person1.setName("manoj");
//		person1.setPet(Animal1());
//		return person1;
//	}
////	@Bean
////	public Person person1(Animal pet) {
////		Person person1=new Person("Harish", pet);
////	//	person1.setName("manoj");
////		//person1.setPet(pet);
////		return person1;
////	}
	
}

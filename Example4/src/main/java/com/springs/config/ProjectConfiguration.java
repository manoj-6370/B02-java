package com.springs.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.springs.beans.Animal;

@Configuration
public class ProjectConfiguration {

	@Bean(name="bear")
	public Animal Animal1() {
		Animal a1= new Animal();
		a1.setColour("black");
		a1.setName("Bear");
		return a1;
	}
	@Bean(name="panda")
	public Animal Animal2() {
		Animal a1= new Animal();
		a1.setColour("white");
		a1.setName("Panda");
		return a1;
	}
	@Bean(name="tiger")
	public Animal Animal3() {
		Animal a1= new Animal();
		a1.setColour("yellow-black");
		a1.setName("Tiger");
		return a1;
	}
}

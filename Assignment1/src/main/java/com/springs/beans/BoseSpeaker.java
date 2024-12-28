package com.springs.beans;

import org.springframework.stereotype.Component;

@Component
public class BoseSpeaker implements Speakers{

	public BoseSpeaker() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void makeSound() {
		System.out.println("Sound from BoseSpeaker");
		
	}

}

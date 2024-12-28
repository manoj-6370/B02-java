package com.springs.beans;

import org.springframework.stereotype.Component;

@Component
public class SonySpeaker implements Speakers {

	public SonySpeaker() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void makeSound() {
		System.out.println("Sound from SonySpeaker");
		
	}

}

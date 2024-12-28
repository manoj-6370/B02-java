package com.springs.beans;

import org.springframework.stereotype.Component;

@Component
public class SonySpeaker implements Speakers {

	@Override
	public void makeSound() {
		System.out.println("Sound from SonySpeaker");
		
	}

}

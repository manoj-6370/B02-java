package com.springs.beans;

import org.springframework.stereotype.Component;

@Component
public class MichelinTyres implements Tyres{

	public MichelinTyres() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void rotate() {
		System.out.println("MichelinTyres is rotating");
		
	}

}

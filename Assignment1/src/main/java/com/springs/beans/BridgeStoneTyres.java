package com.springs.beans;

import org.springframework.stereotype.Component;

@Component
public class BridgeStoneTyres implements Tyres{

	public BridgeStoneTyres() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void rotate() {
		System.out.println("BridgeStoneTyres is rotating");
		
	}

}

package com.springs.beans;

import org.springframework.stereotype.Component;

@Component
public class VehicleService {
private Speakers speaker;
private Tyres tyre;

public VehicleService(Speakers speaker, Tyres tyre) {
	super();
	this.speaker = speaker;
	this.tyre = tyre;
}

}

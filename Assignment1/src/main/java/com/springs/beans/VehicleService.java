package com.springs.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class VehicleService {
	private Speakers speaker;
	private Tyres tyre;
@Override
	public String toString() {
		return "VehicleService [speaker=" + speaker + ", tyre=" + tyre + "]";
	}

public Speakers getSpeaker() {
		return speaker;
	}

	public VehicleService() {
	super();
	// TODO Auto-generated constructor stub
}

	public void setSpeaker(Speakers speaker) {
		this.speaker = speaker;
	}

	public Tyres getTyre() {
		return tyre;
	}

	public void setTyre(Tyres tyre) {
		this.tyre = tyre;
	}


@Autowired
public VehicleService(@Qualifier("sonySpeaker") Speakers speaker,@Qualifier("bridgeStoneTyres") Tyres tyre) {

	this.speaker = speaker;
	this.tyre = tyre;
}

}

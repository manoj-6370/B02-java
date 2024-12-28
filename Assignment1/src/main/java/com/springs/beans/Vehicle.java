package com.springs.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {
	private String name;
	private VehicleService vehicleService;
@Autowired
public Vehicle( VehicleService vehicleService) {
		
		this.vehicleService = vehicleService;
	}


public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public VehicleService getVehicleService() {
	return vehicleService;
}
public void setVehicleService(VehicleService vehicleService) {
	this.vehicleService = vehicleService;
}
}

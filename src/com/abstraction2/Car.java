package com.abstraction2;

public class Car extends Vehicle {
	int numofDoors;
	boolean hasSunroof;

	public Car(String modelName, String vehicleNumber, String company, int numofDoors, boolean hasSunroof) {
		super(modelName, vehicleNumber, company);
		this.numofDoors = numofDoors;
		this.hasSunroof = hasSunroof;

	}

	public void startEngine() {
		System.out.println("Starting engine with key ignition.");
	}
	
	

}

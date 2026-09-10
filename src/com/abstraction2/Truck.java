package com.abstraction2;

public class Truck extends Vehicle {
	
	int cargoCapacity;

	public Truck(String modelName, String vehicleNumber, String company, int cargoCapacity) {
		super(modelName, vehicleNumber, company);
		this.cargoCapacity = cargoCapacity;
	}
	
	public void startEngine() {
		System.out.println("Starting engine with heavy-load warm-up.");
	}

	public void fuelType(){
		System.out.println("Diesel");
	}
}

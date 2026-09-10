package com.abstraction2;

public abstract class Vehicle {
	String modelName, vehicleNumber, company;
	
	

	public Vehicle(String modelName, String vehicleNumber, String company) {
	
		this.modelName = modelName;
		this.vehicleNumber = vehicleNumber;
		this.company = company;
	}

	 void startEngine() {
		 
	 }
	 
	  void PollutionCheck() {
		  
	  }

	public void fuelType() {
		System.out.println("Petrol");
	}
}

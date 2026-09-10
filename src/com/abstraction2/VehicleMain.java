package com.abstraction2;

public class VehicleMain {

	public static void main(String[] args) {

		Vehicle vh;

		vh = new Car("Toyota Camry", "ABC123", "Toyota", 4, true);
		vh.startEngine();
		vh.fuelType();
		System.out.println("-------------------");
   
		vh=new Bike("Yamaha R1", "XYZ789", "Yamaha", false);
		
		vh.startEngine();
		vh.fuelType();

	}

}

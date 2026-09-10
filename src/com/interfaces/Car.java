package com.interfaces;

public class Car implements Vehicle {

	@Override
	public void accelarate() {
		System.out.println("Car moving....");

	}

	@Override
	public void breaking() {
		System.out.println("Car stop Moving....");

	}

	@Override
	public void lights() {
		System.out.println("Car in modern days used LED Lights...");
	}
}

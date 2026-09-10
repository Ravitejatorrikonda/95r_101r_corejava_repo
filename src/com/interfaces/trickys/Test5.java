package com.interfaces.trickys;

interface Vehicle {
	void start();

	void stop();
	default void digitalmeter() {
		System.out.println("digital meter");
	}
}

class Bike implements Vehicle {

	@Override
	public void start() {
		System.out.println("start");

	}

	@Override
	public void stop() {
		System.out.println("stop");

	}
	
	@Override
	public void digitalmeter() {
		System.out.println("digital meter for Bike...");
	}

}

class Car implements Vehicle {

	@Override
	public void start() {
		System.out.println("start");
	}

	@Override
	public void stop() {
		System.out.println("stop");
	}

}

class Truck implements Vehicle {

	@Override
	public void start() {
		System.out.println("start");
	}

	@Override
	public void stop() {
		System.out.println("stop");
	}

}

public class Test5 {

	public static void main(String[] args) {
		
		
		Vehicle vh;
		
		vh=new Bike();
		vh.start();
		vh.stop();
		vh.digitalmeter();

	}

}

package com.abstraction;

abstract class Animal{
	public abstract void makingSound();
}
class Dog extends Animal{

	public void makingSound() {
		System.out.println("Animals making sound.........");
	}
	
}






public class Example1 {

	public static void main(String[] args) {
		Animal ani=new Dog();
		
		ani.makingSound();

		
		
	}

}

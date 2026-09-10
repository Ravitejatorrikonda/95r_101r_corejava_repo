package com.interfaces.trickys;


class A1{
	
	public static void getData() {
		System.out.println("this is parent static");
	}
	
}
class B1 extends A1{

	public static void getData() {
		A1.getData();
		System.out.println("this is child class static");
	}
	
}

public class Test2 {

	public static void main(String[] args) {
	       
	        B1.getData();

	}

}

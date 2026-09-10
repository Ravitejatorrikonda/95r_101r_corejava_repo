package com.interfaces.trickys;


interface X1{
	public static void getData() {
		System.out.println("this is parent interface static");
	}
}
interface X2{
	 public static void getData() {
		 
		 System.out.println("this is child interface static method");
	 }
}

class Y1 implements X1, X2{
	public static void printData() {
		X1.getData();
	}
}

public class Test3 {

	public static void main(String[] args) {
		Y1.printData();
	}

}

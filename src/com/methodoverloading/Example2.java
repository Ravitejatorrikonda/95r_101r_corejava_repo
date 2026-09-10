package com.methodoverloading;

public class Example2 {

//	public void print(int a, int b) {
//		System.out.println("int : " + (a + b));
//	}
	
	
//	public void print(long a, long b) {
//		System.out.println("long : "+(a+b));
//	}
	
	
	public void print(short a, short b) {
		System.out.println("short : "+(a+b));
	}
	

	public void print(Integer a, Integer b) {
		System.out.println("INteger : " + (a + b));
	}

	public static void main(String[] args) {
		
		
		
		new Example2().print(34, 43);
	}

}

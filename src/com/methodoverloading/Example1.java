package com.methodoverloading;

public class Example1 {
	
	public void print(short a, short b) {
		System.out.println("short : "+ (a+b));
	}
	
	public void print(int a, int b) {
		System.out.println("Int : "+( a+b));
	}
	
	public void print(double a, double b) {
		System.out.println("double  : "+ (a+b));
	}
	public void print(float a, float b) {
		System.out.println("float : "+(a+b));
	}
	

	public static void main(String[] args) {
//		
//		short s1=34;
//		int s2=43;
		
           new Example1().print(34.0f,43.0);
		
	}

}

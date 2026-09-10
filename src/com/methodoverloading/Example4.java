package com.methodoverloading;



class A{
	public void print(short a, short b) {
		System.out.println("parent class maethods....");
	}
}

class B extends A{
	public void print(int a, int b) {
		System.out.println("Child class maethods....");
	}
}

public class Example4 {

	public static void main(String[] args) {
		B b=new B();
//		short s1=34;
//		short s2=43;
		b.print(34,43);

	}

}

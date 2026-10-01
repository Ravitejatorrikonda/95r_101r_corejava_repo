package com.garbagecollectore;

public class Example1 {
	int a=10;

	public static void main(String[] args) {
		
		Example1 emp=new Example1();
		emp.a=20;
		System.out.println(emp.a);//20
		new Example1();
		emp=null;
		emp=new Example1();
		
		System.out.println(emp.a);//10
		
		

	}

}

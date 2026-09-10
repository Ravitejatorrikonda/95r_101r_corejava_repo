package com.methodoverloading;

public class Example3 {
	
	
	public void display(Example3 a) {
		System.out.println("Object..");
	}
	
	public void display(String str) {
		System.out.println("STring");
	}

	public static void main(String[] args) {
		Example3 obj=new Example3();
		String str=null;
		
		obj.display(str);
	}

}

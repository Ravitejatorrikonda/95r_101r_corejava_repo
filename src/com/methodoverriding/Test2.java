package com.methodoverriding;

class Parent {

	public  void getData(int a) {
		System.out.println("Parent");
	}	

}

class Child extends Parent {
	
	@Override
	public void getData(int a) {
		System.out.println("child");
	}
}

public class Test2 {

	public static void main(String[] args) {
		
		Parent p=new Child();
		p.getData(20);

	}

}

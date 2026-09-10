package com.interfaces.trickys;


interface Alpha{
	public default void print() {
		System.out.println("Alpha");
	}
	
}
interface Beta{
	public default void printer() {
		System.out.println("Beta");
	}
	
}

class Tester implements Alpha, Beta{
	
	public void print() {
		System.out.println("child class imp");
		
		Beta.super.printer();//A1.getData()
	}
	public void printer() {
		System.out.println("child class impli 2");
	}
	
}

public class Test6 {

	public static void main(String[] args) {
		
		Tester t=new Tester();
		t.print();
		t.printer();
       
	}

}

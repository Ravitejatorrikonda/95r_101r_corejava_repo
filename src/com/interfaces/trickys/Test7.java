package com.interfaces.trickys;


interface C1{
	public default void printer() {
		System.out.println("parent 1");
	}
	
}
interface D1{
	public default void printer() {
		System.out.println("parent 2");
	}
}

class E implements C1, D1{
	public void printer() {
		C1.super.printer();
		D1.super.printer();
		System.out.println("child");
	}
}

public class Test7 {

	public static void main(String[] args) {
        E e=new E();
        e.printer();
		
		
		
	}

}

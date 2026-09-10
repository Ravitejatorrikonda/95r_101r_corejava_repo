package com.interfaces.trickys;

public interface Example1 {
	default void printdata() {
		getData();
	}
	
//	void print() {
//		
//	}
	
	private void getData() {
		System.out.println("this is private method");
	}
	
	public static void main (String [] args) {
	
	}

}

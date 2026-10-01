package com.multithreading;


//class D implements Runnable{
//
//	@Override
//	public void run() {
//		System.out.println("Hello There..");
//		
//	}
//	
//}

public class Example4 {

	public static void main(String[] args) {
		System.out.println("Main method started");
//		Runnable run1=new D();
//		
		
		
//		Runnable run2=()-> System.out.println("Hello guys...");
				
			
		
		
		Thread th1=new Thread(()-> System.out.println("Hello guys..."));
		th1.start();
		
		
		
		
		System.out.println("main method ended..");
		

	}

}

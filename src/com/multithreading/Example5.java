package com.multithreading;

public class Example5 {

	public static void main(String[] args) throws InterruptedException {
              System.out.println("Main method started");
              
              Thread th1=new Thread(()->System.out.println("Hello"));
              Thread th2=new Thread(()->System.out.println("Hai"));
              
              th1.start();
              th2.start();
              
              th1.join();
              th2.join();
              System.out.println("Exist");
	}

}

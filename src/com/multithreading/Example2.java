package com.multithreading;

class B extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + " - " + i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
			}
		}
	}
}

public class Example2 {

	public static void main(String[] args) {
              System.out.println("main method");
              
              Thread th1=new B();
              Thread th2=new B();
              
              th1.start();
              th2.start();
              
              System.out.println("Exist");
	}

}

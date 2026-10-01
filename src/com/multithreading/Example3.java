package com.multithreading;

class C implements Runnable{

	@Override
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


public class Example3 {

	public static void main(String[] args) {
                 
		
		System.out.println("Main method");
		C obj1=new C();
		C obj2=new C();
		
		Thread th1=new Thread(obj1);
		Thread th2=new Thread(obj2);
		
		th1.start();
		th2.start();
		
		System.out.println("main Exist....");
		
		
	}

}

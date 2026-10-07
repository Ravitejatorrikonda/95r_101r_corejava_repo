package com.multithreading.synchronization;


class Printer2 {

	public synchronized static void print(int n, String name) {
		for (int i = 1; i <= n; i++) {
			System.out.println(name + "-" + i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}


//class User3 implements Runnable{
//
//	@Override
//	public void run() {
//            Printer2.print(5, "neha");		
//	}
//	
//}
//
//class User4 implements Runnable{
//
//	@Override
//	public void run() {
//              Printer2.print(5,"kaveri");		
//	}
//	
//}


public class Main3 {

	public static void main(String[] args) {
//		User3 us3=new User3();
//		User4 us4=new User4();
		Runnable run1=()->{
			Printer2.print(5, "Rasagna");
		};
		Runnable run2=()->{
			Printer2.print(5, "Ramya");
		};
		Thread th1=new Thread(run1);
		Thread th2=new Thread(run2);
		th1.start();
		th2.start();
		

	}

}

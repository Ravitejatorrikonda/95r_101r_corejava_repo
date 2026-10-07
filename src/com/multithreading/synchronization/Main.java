package com.multithreading.synchronization;

import java.security.PublicKey;

class Printer {

	public void print(int n, String name) {
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

//class User1 implements Runnable{
//	Printer printer;//new Printer();
//	
//	public User1(Printer printer) {
//		this.printer=printer;
//	}
//
//	@Override
//	public void run() {
//		
//		synchronized (printer) {
//			printer.print(5, "harish");
//		}
//	}
//	
//	
//	
//}
//
//
//class User2 implements Runnable{
//	Printer printer;
//
//	public User2(Printer printer) {
//		
//		this.printer = printer;
//	}
//
//	@Override
//	public void run() {
//		synchronized (printer) {
//			printer.print(5, "sankar");
//		}
//		
//	}
//	
//	
//	
//}

public class Main {

	public static void main(String[] args) {

		Printer printer = new Printer();

		Runnable run1 = () -> {
			synchronized (printer) {
				printer.print(5, "sudesh");
			}

		};

		Runnable run2 = () -> {
			synchronized (printer) {
				printer.print(5, "parmesh");
			}
		};

		Thread th1 = new Thread(run1);
		Thread th2 = new Thread(run2);

		th1.start();
		th2.start();

	}

}

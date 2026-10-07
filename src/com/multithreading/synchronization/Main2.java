package com.multithreading.synchronization;

class Printer1 {

	public synchronized void print(int n, String name) {
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

public class Main2 {

	public static void main(String[] args) {
		Printer1 printer1 = new Printer1();

		Runnable run1 = () -> {
			printer1.print(5, "satwik");
		};

		Runnable run2 = () -> {
			printer1.print(5, "manikanta");
		};
		
		
		Thread th1=new Thread(run1);
		Thread th2=new Thread(run2);
		th1.start();
		th2.start();
	}

}

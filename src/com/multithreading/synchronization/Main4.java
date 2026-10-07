package com.multithreading.synchronization;

class Producer implements Runnable {

	StringBuffer sb;

	public Producer() {
		this.sb = new StringBuffer();// null
	}

	@Override
	public void run() {
		try {

			synchronized (sb) {
				for (int i = 0; i <= 10; i++) {
					sb.append(i);
					System.out.println(sb);
					Thread.sleep(2000);
				}
				sb.notify();

			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}

class Consumer implements Runnable {
	Producer producer;//

	public Consumer(Producer producer) {
		this.producer = producer;
	}

	@Override
	public void run() {
		try {

			synchronized (producer.sb) {
				System.out.println(
						"This is consumer thread i am in waiting state until i get notification from producer");
				producer.sb.wait();
				System.out.println("i am getting a notification");
				System.out.println(producer.sb.toString());

			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}

public class Main4 {

	public static void main(String[] args) {
		Producer producer = new Producer();
		Consumer consumer = new Consumer(producer);

		Thread th1 = new Thread(producer);
		Thread th2 = new Thread(consumer);

		th2.start();
		th1.start();

	}

}

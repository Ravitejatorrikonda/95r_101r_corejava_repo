package com.multithreading;


class G{
	int count;
	
  synchronized void increment() {
		count++;
		System.out.println(Thread.currentThread().getName());
	}
	
	int getCount() {
		return count;
	}
	
}

public class Example6 {

	public static void main(String[] args) {
		
		System.out.println("Main method started..");
		G g=new G();
		
		Thread th1=new Thread(()->{
			for (int i = 1; i <= 1000; i++) {
				g.increment();
			}
		});
		
		
		Thread th2=new Thread(()->{
			for (int i = 1; i <= 1000; i++) {
				g.increment();
//				System.out.println(Thread.currentThread().getName());
			}
		});
		
		th1.start();
		th2.start();
		
//		th1.join();
//		th2.join();
		
		System.out.println(g.getCount());
		
		System.out.println("Exist");
		
		
		

	}

}

package com.functionalinterfaces;

import java.util.function.Consumer;



//class Demo implements Consumer<String>{
//	@Override
//	public void accept(String str) {
//		System.out.println(str);
//	}
//}



public class Example1 {

	public static void main(String[] args) {
		
//		Consumer<Integer> consumer2=new Consumer<Integer>() {
//			public void accept(Integer i) {
//				
//			}
//		};
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Consumer<String> consumer=new Consumer<String>() {
			
			@Override
			public void accept(String str) {
				System.out.println(str);
				
			}
		};
		
		consumer.accept("javascript is awesome..");
		
		
		
		
		
		
		

//		Consumer<String> consumer=new Demo();
//		consumer.accept("java is Awesome...");
//		
	}

}

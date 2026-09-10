package com.functionalinterfaces;

import java.util.function.Supplier;

public class Example6 {

	public static void main(String[] args) {
		
		
		
		
		Supplier<Employ> sup=new Supplier<Employ>() {
			
			@Override
			public Employ get() {
				
				return new Employ("rani");
			}
		};
		
		System.out.println(sup.get());
		

		
//		Supplier<String> sup=new Supplier<String>() {
//			
//			@Override
//			public String get() {
//				return "Hello There";
//			}
//		};
//		
//		System.out.println(sup.get());
		
		
	}

}

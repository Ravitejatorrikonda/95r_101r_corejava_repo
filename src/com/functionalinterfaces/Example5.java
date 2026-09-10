package com.functionalinterfaces;

import java.util.function.Function;
import java.util.function.Supplier;

public class Example5 {

	public static void main(String[] args) {
		
		
		Function<Integer, String> fun=new Function<Integer, String>() {
			
			@Override
			public String apply(Integer i) {
				// TODO Auto-generated method stub
				return "given integer : "+i;
			}
		};
		
		System.out.println(fun.apply(30));
		
		

//		Supplier<String> supplier=new Supplier<String>() {
//			
//			@Override
//			public String get() {
//				
//				return "hello guys";
//			}
//		};
//		
//		System.out.println(supplier.get());
		
	}

}

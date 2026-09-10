package com.functionalinterfaces;

import java.util.function.Function;

class X implements Function<String, Boolean> {
	public Boolean apply(String str) {
		return str.length() > 10;
	}
}

public class Example7 {

	public static void main(String[] args) {

		Function<String, Boolean> fun = new X();

		System.out.println(fun.apply("java is awesome and torcher"));

		Function<String, String> fun2 = new Function<String, String>() {

			@Override
			public String apply(String str) {

				return str.toUpperCase();
			}
		};

		System.out.println(fun2.apply("java is awesome and buety"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

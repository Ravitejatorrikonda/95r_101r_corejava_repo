package com.functionalinterfaces;

import java.util.function.Consumer;


class Employ{
	String name;

	public Employ(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employ [name=" + name + "]";
	}
	
	
}


public class Example2 {

	public static void main(String[] args) {

		Employ emp=new Employ("vijay");
		
		Consumer<Employ> consumer=new Consumer<Employ>() {
			
			@Override
			public void accept(Employ emp) {
				System.out.println(emp.name);
				
			}
		};
		
		consumer.accept(emp);
		
		
		
		
	}

}

package com.functionalinterfaces;

import java.util.function.Function;

class Employee{
	String name,desg;

	public Employee(String name, String desg) {
		super();
		this.name = name;
		this.desg = desg;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesg() {
		return desg;
	}

	public void setDesg(String desg) {
		this.desg = desg;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", desg=" + desg + "]";
	}
	
	
}

public class Example8 {

	public static void main(String[] args) {
		
		Employee emp=new Employee("raja", "SE");

		
		Function<Employee, String> fun=new Function<Employee, String>() {
			
			@Override
			public String apply(Employee emp) {
				
				return emp.getName();
			}
		};
		
		System.out.println(fun.apply(emp));
		
		
		
	}

}

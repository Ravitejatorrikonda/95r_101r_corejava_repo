package com.exception;

class InvalidAge extends Exception{
	
	public InvalidAge(String message) {
		super(message);
	}
}


public class Example6 {
	
	
	public void checkAge(int age)throws InvalidAge {
		if(age<=16) {
		throw new InvalidAge("invalid age");
		}
	}

	public static void main(String[] args) {
		try {
			new   Example6().checkAge(15);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		System.out.println("exicuted");
       
	}

}

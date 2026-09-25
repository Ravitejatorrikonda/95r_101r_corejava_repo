package com.exception;

class InvalidEngine extends Exception {
	public InvalidEngine(String msg) {
		super(msg);
	}
}

public class Example7 {
	public void checkEngine(int years) throws InvalidEngine {
		if (years >= 20) {
			throw new InvalidEngine("Not a valid Engine");
		} else {
			System.out.println("perfect condition");
		}
	}

	public static void main(String[] args) throws InvalidEngine {

		new Example7().checkEngine(25);
		System.out.println("hiii");
	}

}

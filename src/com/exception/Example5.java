package com.exception;

public class Example5 {

	public void isEven(int num) throws Exception {
		if (num < 0) {

			throw new ArithmeticException();

		} else if (num == 0) {
			throw new NullPointerException();
		} else {
			System.out.println("Even");
		}
	}

	public static void main(String[] args) {
		try {
			new Example5().isEven(-1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Exicuted");
	}

}

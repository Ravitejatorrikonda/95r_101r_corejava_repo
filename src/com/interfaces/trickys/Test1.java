package com.interfaces.trickys;

interface X {
	void printData();

}

interface Y {
	void printData();
}

class Z implements X, Y {

	@Override
	public void printData() {
		System.out.println("this is chld class implimenattion");

	}

}

public class Test1 {

	public static void main(String[] args) {
		Z z = new Z();
		z.printData();
	}

}

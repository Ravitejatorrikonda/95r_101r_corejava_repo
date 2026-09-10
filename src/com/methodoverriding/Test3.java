package com.methodoverriding;



class C{
	public void getData() {
		System.out.println("parent");
	}
}

class D extends C{
	@Override
	public  void getData() {
		System.out.println("child");
	}
}

public class Test3 {

	public static void main(String[] args) {
    C c=new D();
    c.getData();
    
	}

}

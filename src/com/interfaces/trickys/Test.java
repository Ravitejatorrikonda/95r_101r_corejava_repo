package com.interfaces.trickys;



interface A{
	String getData();//public abstract
}
interface B{
	boolean isEven();
}

class C implements A,B{

	@Override
	 public String getData() {
		
		return "this is child class implimentation";
	}

	@Override
	public boolean isEven() {
		return 2%10==0;
	}
	
}

public class Test {

	public static void main(String[] args) {
		
		C c=new C();
		//dynamic dispatch methods
		
		
		A a=c;
		B b=c;
		
		System.out.println(a.getData());
		System.out.println(b.isEven());

	}

}

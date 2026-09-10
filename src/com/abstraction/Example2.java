package com.abstraction;


abstract class Area{
	public  abstract void area();
}

class AreaCircle extends Area{
	int radius;
	public AreaCircle(int radius) {
		this.radius=radius;
	}

	@Override
	public void area() {
		System.out.println("Area of the Circle : "+ Math.PI*radius*radius);
	}
	
}

class AreaRectangle extends Area{
	int length;
	int breadth;
	public AreaRectangle(int length, int breadth) {
		this.length=length;
		this.breadth=breadth;
	}

	@Override
	public void area() {
		System.out.println("Area of the Rectangle : "+(length *breadth));
		
	}
	
}


public class Example2 {

	public static void main(String[] args) {
		
		Area a;
		a=new AreaCircle(20);
		a.area();
		System.out.println("========================");
		
		a=new AreaRectangle(20, 30);
		a.area();
		
		

	}

}

package com.anonnymous;


class Parent{
	public void getData() {
		System.out.println("doing Job....");
	}
	
}

//class child extends Parent{
//	@Override
//	public void getData() {
//		System.out.println("SF Job....");
//	}
//}



public class Example1 {

	public static void main(String[] args) {
		
		//anonymous extends Parent{}

		Parent p=new Parent() {
			@Override
			public void getData() {
				System.out.println("Sf Job..");
			}
		};
		
		//parent p=new Anonymous();
		
		p.getData();
		
		
	}

}

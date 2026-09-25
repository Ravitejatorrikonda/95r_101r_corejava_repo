package com.exception;

public class Example4 {
	
	public void isEven(int num)throws Exception {
		if(num<=0) {
		throw new Exception("not a valid number");
		}else {
			System.out.println("Even");
			
			
		}
	}
	

	public static void main(String[] args)throws Exception {
		         try {
		        	 new Example4().isEven(0);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
		         System.out.println("i am exicuted");
	}

}

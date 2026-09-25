package com.exception;

public class Example9 {
	
	public void getData()throws Exception {
		throw new Exception("this is an exception");
	}
	
	public int method1() {
		try {
			return 100;
		} finally {
             return 200;
		}
	}
	
	
	public void method2()throws RuntimeException {
		try {
			throw new RuntimeException("this is ryntime exception");
		} finally{
			System.out.println("this is runtime catch block");
		}
	}
	
	
	
	
	public void method3()throws Exception {
		try {
			try {
				throw new Exception("this is an eception");
			} catch (Exception e) {
				System.out.println("nested");
			}
		} catch (Exception e) {
			System.out.println("this is method3 catch block");
		}
	}
	

	public static void main(String[] args) {
		
		
//		new Example9().method3();
		
//		new Example9().method2();//
		
		
		
		System.out.println(new Example9().method1());//200
		
            try {
            	new Example9().getData();
				System.out.println("this is try block");
			} catch (Exception e) {
				
				System.out.println("this is catch block");//
			}finally {
				System.out.println("this is finally block..");//
			}
            
	}

}

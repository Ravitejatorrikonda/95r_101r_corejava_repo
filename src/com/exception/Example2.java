package com.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		try {
			System.out.println("Enter Size");
			int[] arr=new int[sc.nextInt()];
			System.out.println(arr[100]);//new arithmaticException("/by zero")
			
		} catch (NegativeArraySizeException | IndexOutOfBoundsException |InputMismatchException e) {
			
			e.printStackTrace();
		}
		System.out.println(" i am exicuted...");
		
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		try {
//			String str=null;
//			System.out.println(str.toUpperCase());
//			
//		} catch (NullPointerException e) {
//			System.out.println(e.getMessage());
//		}
//		


}

}
package com.exception;

import java.io.IOException;

public class Example3 {
	
	
	public void isEven(int num)throws Exception{
		if(num<=0) {
            throw new Exception("not a valid number");
		     
		
		}else{
			System.out.println((num%2==0?"Even":"Odd"));
		}
	}

	public static void main(String[] args)throws Exception{
		
	             new Example3().isEven(4);
		
		
	}

}

package com.lambda;


interface NumberChecker{
	boolean checkNumber(int i);
}

interface CharChecker{
	void checkChar(char ch);
}




public class Example2 {
	
	public static boolean isPrime(int num) {
		if(num<=1)return false;
		for(int i=2;i*i<num;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
		
		
	}

	public static void main(String[] args) {
                
		
		NumberChecker numch=i->isPrime(i);
		System.out.println(numch.checkNumber(3)?"prime":"! prime");
		
		
		CharChecker ch = chs->System.out.println(isPrime(chs)?"prime":"! Prime");
		ch.checkChar('A');
		
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
}

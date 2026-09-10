package com.methodoverriding;


class A{
	public void sleeping() {
		System.out.println("Parenmt sleeping at 10 pm");
	}
	
	public void eating() {
		System.out.println("parent eating idly....");
	}
	
}

class B extends A{
	
	public void sleeping() {
		System.out.println("Child SLeeping at 2 am");
	}
	
	public void eating() {
		System.out.println("child eating fastfood....");
	}
	
	
	
}




public class Test1 {

	public static void main(String[] args) {

		
		A a1=new A();
		
		
		a1.sleeping();
		a1.eating();
		
		System.out.println("------------------");
		
		
		/**
		 *Compilation Phase
		 *
		 * compiler will check the methods are presented in parent class or not
		 * 
		 * if parent does not have any methods compilker will throw CE
		 * if parent havve a same methods now the responsibulity will takecare by the interpreter
		 * 
		 * interpreter first check the which object i am going to create, so same class methods will 
		 * be going to exicute.this is why method overriding is a runtime ploymorphism
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		A a=new A();
		
		a.sleeping();
		a.eating();
		System.out.println("=======================");
		
		B b=new B();
		
		b.sleeping();
		b.eating();
		
		
		
		
	}

}

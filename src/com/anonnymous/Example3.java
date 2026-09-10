package com.anonnymous;



class Student{
	String name;

	public Student(String name) {
		
		this.name = name;
	}
	
}

@FunctionalInterface
interface StudentDetails{
	public abstract void getDetails(Student st);
	
}

public class Example3 {

	public static void main(String[] args) {

		Student student=new Student("sirisha");
		
		StudentDetails st=new StudentDetails() {
			@Override
			public void getDetails(Student stu) {
				System.out.println(stu.name);
			}
		};
		st.getDetails(student);
		
		
		
	}

}

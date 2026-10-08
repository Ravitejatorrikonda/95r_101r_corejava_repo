package com.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Example4 {

	public static void main(String[] args) throws IOException {
                 
		
		String location="C:\\Users\\ADMIN\\OneDrive\\Desktop\\tb.txt";
		
		FileInputStream fis=new FileInputStream(location);
//		System.out.println((char)fis.read());
		int i;
		while((i=fis.read()) != -1) {
			System.out.print((char)i);
		}
		
		
		
	}

}

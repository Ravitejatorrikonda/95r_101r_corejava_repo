package com.filehandling;

import java.io.FileOutputStream;
import java.io.IOException;

public class Example2 {

	public static void main(String[] args) throws IOException {
		String location="C:\\Users\\ADMIN\\OneDrive\\Desktop\\abc.txt";
		String str="\n Java is highlevel and harish";
		
		FileOutputStream fos=new FileOutputStream(location,true);
		byte[] bytes=str.getBytes();
		
		fos.write(bytes);
		
		System.out.println("data inserted....");

	}

}

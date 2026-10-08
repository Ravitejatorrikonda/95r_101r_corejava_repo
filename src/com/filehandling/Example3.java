package com.filehandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Example3 {
	public static void insertdata(String str, String location) throws IOException {

		FileOutputStream fos = new FileOutputStream(location);
		fos.write(str.getBytes());
		System.out.println("data Inserted...");
	}

	public static void main(String[] args) throws IOException {
		String str="Java is awesome...";
		String location = "C:\\Users\\ADMIN\\OneDrive\\Desktop\\tb.txt";
		File f = new File(location);
		
		if(f.exists()) {
			insertdata(str, location);
		}else {
			System.out.println("File not founded");
			if(f.createNewFile()) {
				insertdata(str, location);
			}
		}

	}

}

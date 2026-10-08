package com.filehandling;

import java.io.File;
import java.io.IOException;

public class Example1 {

	public static void main(String[] args) throws IOException {
            String location="C:\\Users\\ADMIN\\OneDrive\\Desktop\\abc.txt";
            File file=new File(location);
            
            if(file.exists()) {
            	System.out.println("File exist");
            }else {
            	System.out.println("File not found");
            	Boolean newFile=file.createNewFile();
            	if(newFile) {
            		System.out.println("File created");
            	}
            }
            
	}

}

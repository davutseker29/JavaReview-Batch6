package com.review11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
	
	public static void main(String[] args) throws IOException {
		
		String projectPath=System.getProperty("user.dir");
		
		String filePath=projectPath+"\\extra\\demo.properties";
		 
		System.out.println(filePath); 
		
		FileInputStream fis=new FileInputStream(filePath);
		
		Properties prop=new Properties();
		prop.load(fis);
		
		System.out.println(prop);
		
		//first way to get value from properties
		String firstName=(String) prop.get("FirstName");
		String lastName=(String) prop.get("LastName");
		String age=(String) prop.get("Age");
		
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(age);
		
		//second way to get value from properties
		System.out.println(prop.getProperty("FirstName"));
		System.out.println(prop.getProperty("LastName"));
		System.out.println(prop.getProperty("Age"));
		
		//add more key and value
		
		System.out.println(prop.setProperty("StudentID", "1234"));
		System.out.println(prop.setProperty("UserName", "dSeker"));
		
		//reassigning
		
		System.out.println(prop.setProperty("FirstName", "Omar"));
		System.out.println(prop.setProperty("Age", "29"));
		System.out.println(prop);
		
		//Lets write and save them back into the extra.properties
		
		FileOutputStream fos=new FileOutputStream(filePath);
		
		prop.store(fos, "added to java");
		
		
	}

}

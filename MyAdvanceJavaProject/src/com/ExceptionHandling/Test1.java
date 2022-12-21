package com.ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test1 
{

	public static void main(String args[])
	{
		try {
			FileInputStream fis=new FileInputStream("D:/mno.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

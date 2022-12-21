package com.ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MultipleCtachBox 
{

	public static void main(String args[])
	{
		try 
		{
			
			int a=10;
			int b=0;
			int c=a/b;
			
		}
		
		catch(ArithmeticException e1)
		{
			e1.printStackTrace();
			
			//prints excpetion name'
			//description
			//stack trace
			
			
			System.out.println("AAA");
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
			
			System.out.println("============");
			System.out.println(e);
			
			System.out.println("============");
			System.out.println(e.getMessage());
			
			
		}
	}
	
}

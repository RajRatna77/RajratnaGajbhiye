package com.inheritance_package;

public class MethodOverlodding 
{

	public void addition(int a,int b)
	{
		System.out.println("You Are Here To add Study Mathod Overloading");
		int c=a+b;
		
		System.out.println("Addition of Two Numbers="+c);
				
	}
	public void addition(int a,int b,int c)
	{
		int d=a+b+c;
		System.out.println("Addition of Three Numbers="+d);
	}
}

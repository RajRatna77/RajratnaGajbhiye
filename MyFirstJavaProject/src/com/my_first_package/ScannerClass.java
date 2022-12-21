package com.my_first_package;

import java.util.Scanner;

public class ScannerClass 

{

	public static void main(String args[])
	{
		
		Scanner s=new Scanner(System.in);//sysntax
		
		
		
		System.out.print("Enter Your First Number : ");
		
		int a=s.nextInt();
		
	//	String a=s.nextLine();
		System.out.print("Enter Your Second Number : ");
		
		int b=s.nextInt();
		
		
		char gender=s.next().charAt(0);
		
		System.out.println("What is your gender :" +gender);
		
		
		
	/*	String name=s.nextLine();
		
		System.out.println("What is your Name :" +name);*/
		
		System.out.println("Enter your EmailId: ");
		long email=s.nextLong();
		
		System.out.println( +email);
		
		
		
		float per=s.nextFloat();
		
		System.out.println("What is your Percentage :" +per);
		
		System.out.println("Your First Number is :" +a);
		System.out.println("Your Second Number is :" +b);
		
		int add=a+b;
		
		System.out.println("Addition of The Two Number Is :" +add);
		
		System.out.println("Your Gender Is : " +gender);
		
		//System.out.println("Your Name Is : " +name);
		
		System.out.println("Your Email Is : " +email);
		
		System.out.println("Your Email Is : " +per);
		
		
		
		
	}
}

package com.logical_programs;

import java.util.Scanner;

public class FactorialOfNumber 
{

	public static void main(String args[])
	{
		int no;
		
		Scanner s=new Scanner(System.in);
		
		System.out.println(" Heyy!!! Enter The Number You Wnat Calculate the Factorial");
		
		no=s.nextInt();
		
		System.out.println(" You Entered Number Is :-->"+no);
	
		int fact=1;
		
		for(int i=1;i<=no;i++)// a=6,i=5
		{
			
			fact=fact*i;
			
		}
		
		System.out.println("The Factorial of a number  is :-->"+fact);
	}
}

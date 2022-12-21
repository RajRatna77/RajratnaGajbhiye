package com.my_first_package;

public class ForLoopPaterns 

{

	public static void main(String args[])
	{
		System.out.println("First Pattern");
		
		for(int i=1; i<=6; i++)   //Iteration 1:
		{   
			for(int j=1; j<=i; j++)   
			{   
				System.out.print("* ");   
			}   
		
			System.out.println();   
		}
		
		System.out.println();
		
		
		System.out.println("Second Pattern");
		
		for(int i=0; i<=6; i++)   
		{   
			for(int j=0; j<=i; j++)   
			{   
				System.out.print("  ");   
			}   
		
			System.out.println(" * ");   
		}
		
		
		
		System.out.println("Third Pattern");
		
		for(int i=0; i<=6; i++)   
		{   
			for(int j=6; j>=i; j--)   
			{   
				System.out.print("* ");   
			}   
		
			System.out.println();  
			
			
			
			
			
			
		}
	}
}

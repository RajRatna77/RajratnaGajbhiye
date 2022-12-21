package com.my_first_package;

public class NestedIfStatement 

{

	public static void main(String args[])
	{
		
		int r=60;
		
		if(r<80)// Condition-True
		{
			
			System.out.println("Value is less Than 80");
			
			if(r<70) // Condtion=TRUE
			{
			
				System.out.println("Value is less Than 70");
				
			}
			
			if(r>30) // Condtion=TRUE
			{
			
				System.out.println("Value is Greater Than 30");
				
			}
		}
			
		else 
		{
		System.out.println("Value is INVALID");
		}
	}
	
}

package com.my_first_package;

public class NestedIfElseStatement 

{

	
	public static void main(String args[])
	
	{
		
		String un="RAJRATNA";
		String pw="123";
		
		if(un=="RAJRATN")// Condition-false
		{
			
			if(pw=="123") // Condition-true
			{
				
				System.out.println("User Shoud Be Able to Login Successfully");
			}
			
			else
			{
				System.out.println("Invalid Username OR Password");
			}
		}
		else
		{
			System.out.println("Enter Correct Username");
		}
	}
	
}

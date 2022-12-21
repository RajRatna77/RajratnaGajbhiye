package com.my_first_package;

public class LoopingStatement 
{
	int a=3;
	
	public static void main(String[]aa)
	{
		for(int i=1;i<=6;i++) //Rows
		{
			for(int j=6;j>=i;j--) // columns *
			{
				System.out.print(" * ");
			}
			
			System.out.println(" ");
		}
		
		
		
	}
}



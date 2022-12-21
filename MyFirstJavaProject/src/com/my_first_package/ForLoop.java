package com.my_first_package;

public class ForLoop 
{

	public static void main(String args[])
	{
		
		for(int i=1;i<6;i++)// rows i=4
		{
			
				for(int j=1;j<=i;j++)//columns i=3,j=4
				{
				
					if(j==1||i==j||i==5)
					{
						System.out.print(" *");
					}
					
					else 
					{
						System.out.print("  ");
					}
					
					
				}
				
				System.out.println();
		}
	}
}

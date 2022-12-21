package com.my_first_package;

public class FoorLoopPattern2 

{
	public static void main(String args[])
	{
			//Normal Pattern
			for(int i=0; i<=6; i++)   //Iteration 1:
			{   
				for(int j=0; j<6-i; j++)   
				{   
					   
					System.out.print(" ");  
				}   
			
				for(int k=1; k<=i; k++)   
				{   
					 
					System.out.print("*");
					
				}  
				
				System.out.println( );   
			}
			
			//2nd Type
			System.out.println( ); 
			
			for(int i=0; i<6; i++)   //Iteration 1:
			{   
				for(int j=1; j<=i; j++)   
				{   
					   
					System.out.print(" ");  
				}   
			
				for(int k=5; k>=i; k--)   
				{   
					 
					System.out.print("*");
					
				}  
				
				System.out.println( );   
			}
			
			
			
	
	}
}

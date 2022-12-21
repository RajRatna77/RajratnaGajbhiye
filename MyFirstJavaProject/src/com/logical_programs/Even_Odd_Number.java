package com.logical_programs;
import java.util.Scanner;

public class Even_Odd_Number 
{
	public void EvenOdd()
	{
		int a;
	
		Scanner s=new Scanner(System.in); 
		System.out.println("Enter The Number:");
		a=s.nextInt();
		System.out.println("The Entered Number IS="+a);
		
		
				if(a%2==0)
				{
					System.out.println("Number Is EVEN");
				}
				
				else 
				{
					
					System.out.println("The Entered Number IS :->ODD");
				}
				
			
	}
	
	public static void main(String args[])
	{
		
		Even_Odd_Number x= new Even_Odd_Number();
		
		x.EvenOdd();
	}
}

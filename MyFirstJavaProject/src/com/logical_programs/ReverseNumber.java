package com.logical_programs;
import java.util.Scanner;
public class ReverseNumber 

{

		public static void main(String args[])
		{
			
		Scanner s= new Scanner(System.in);
	
		System.out.print("Enter The Number That You Want To Reverse: ");
		
		
		
			int number=s.nextInt();
			
			System.out.println("Your Number Is = "+number);
			
			int remainder,reverse=0;
			
			while(number!=0)
			{
				remainder=number%10;
				reverse=reverse*10+remainder;
				number=number/10;
			}
			
			System.out.println("The Reverse of the Number is:->"+reverse);
		}	
}

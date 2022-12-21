package com.my_first_package;

import java.util.Scanner;

public class Operator_Addition 

{

	public static void main(String[] args) 
	{
		
		int No1,No2;
		   int Add;
		   
		Scanner x = new Scanner(System.in);		     
		     
		   //two variables to hold numbers
		   
		  			  
		   System.out.println("Enter First Numbers No1= " );
		  
		   No1 = x.nextInt();
		   
		  
		   System.out.println("Enter Second Number No2=" );
		  
		   No2 = x.nextInt();
		   
		 		  
		   Add = No1 + No2;//Addition
		   
		
		   
		   
		   System.out.println("Addition of The Number Is = " + Add);
		   
		  }
	
}

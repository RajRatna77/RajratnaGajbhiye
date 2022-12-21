package com.my_first_package;

import java.util.Scanner;

public class Operator_Multiplication 
{

	public static void main(String[] args) 
	{
		
		int No1, No2;
		   int Mul;
		   
		Scanner x = new Scanner(System.in);		     
		     
		   //two variables to hold numbers
		   
		  			  
		   System.out.println("Enter First Numbers No1= " );
		  
		   No1 = x.nextInt();
		   
		  
		   System.out.println("Enter Second Number No2=" );
		  
		   No2 = x.nextInt();
		   
		 		  
		   Mul= No1 * No2;//Multiplication
		   
		
		   		   
		   System.out.println("Subtraction of The Number Is = " + Mul);
		   
		  }
}

package com.my_first_package;

import java.util.Scanner;

public class Operator_Division 
{

	public static void main(String[] args) 
	{
		
		int No1, No2;
		int Div;
		   
		Scanner x = new Scanner(System.in);		     
		     
		   //two variables to hold numbers
		   
		  			  
		   System.out.println("Enter First Numbers No1= " );
		  
		   No1 = x.nextInt();
		   
		  
		   System.out.println("Enter Second Number No2=" );
		  
		   No2 = x.nextInt();
		   
		 		  
		   Div= No1/No2;//Subtraction
		   
		
		   		   
		   System.out.println("Division of The Two Number Is = " + Div);
		   
		  }
}

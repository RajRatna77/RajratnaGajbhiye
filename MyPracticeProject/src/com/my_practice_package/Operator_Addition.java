package com.my_practice_package;
import java.util.Scanner;

public class Operator_Addition 
{

	public static void main(String[] args) 
	{
		   Scanner x = new Scanner(System.in);		     
		     
		   //two variables to hold numbers
		   
		   int No1, No2;
		   int Add;
		  
		   No1 = x.nextInt();
		   
		   System.out.println("Enter First Numbers:" +No1);
		  
		   No2 = x.nextInt();
		   
		   System.out.println("Enter Second Numbers:" +No2);
		   
		   Add = No1 + No2;
		   
		   System.out.println("Addition of The Number Is = " + Add);
		   
		  }
	
}

package com.logical_programs;

import java.util.Scanner;

public class PalindronNumber 
{

	
	public static void main(String args[])
	{
		
	
	int no = 0;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter The Number B = " +no);
	no=s.nextInt();
	
	int originalno=no;
	int remainder;
	int reverse=0;
	
	
	while(no!=0)
	{
		remainder=no%10;
		no=no/10;
		reverse=(reverse*10)+remainder;
		
		
			
	}
	
	System.out.println("The reverse of Number is = " +reverse);
	System.out.println();
	
	if(originalno==reverse)
	{
		System.out.print("The Original Number-: \n"+originalno);
		System.out.println(" -: is PALINDROM NUMBER");
	}
	
	else
	{
		System.out.print("The Original Number -:"+originalno);
		System.out.println(" is Not PALINDROM NUMBER");
	}
}	
}

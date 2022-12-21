package com.logical_programs;

public class ArmstrongNumber 
{

	
	public static void main(String args[])
	{
		
		int a=370;
		int c=0,temp,remainder;
		temp=a;
		
		while(a>0)
		{

			remainder=a%10; //0 //7 //3
			a=a/10;        //37 //3 //0
			c=(remainder*remainder*remainder)+c; //0 //343 //27
		}
		
		if(temp==c)
		{
			System.out.println("It is an ARMSTRONG Number");
		}
		
		else
		{
			System.out.println("It is Not an ARMSTRONG Number");
		}
	}
}

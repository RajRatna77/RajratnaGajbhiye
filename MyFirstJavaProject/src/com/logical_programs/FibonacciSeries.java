package com.logical_programs;

public class FibonacciSeries 
{

	public static void main(String args[])
	{
		
		int no1=0,no2=1,fibo;
		System.out.println(+no1);
		System.out.println(+no2);
				
		
		for(int i=2;i<10;i++)
		{
			
			fibo=no1+no2;
			System.out.println( +fibo);
			no1=no2;
			no2=fibo;
		}
	}
}

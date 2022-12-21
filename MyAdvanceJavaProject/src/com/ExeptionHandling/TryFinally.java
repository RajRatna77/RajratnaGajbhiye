package com.ExeptionHandling;

public class TryFinally {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		try 
		{
			
			int a=10;
			int b=0;
			int c=a/b;
			
			System.out.println("TryBlock");
			
		}
		
		catch (Exception e)
		{
			
			e.printStackTrace();
		}
		
		
		finally
		{
			
			System.out.println("Finally Block");
		}
		
		
		System.out.println("11111");
		System.out.println("11111");
		System.out.println("11111");
		System.out.println("11111");
	}

}

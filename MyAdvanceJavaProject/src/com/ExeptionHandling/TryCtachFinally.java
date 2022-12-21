package com.ExeptionHandling;

public class TryCtachFinally 
{

	public static void main(String args[])
	{
		try 
		{
			
			int a=10;
			int b=0;
			int c=a/b;
			
		}
		
		catch(ArithmeticException e1)
		{
			e1.printStackTrace();
			
			//prints excpetion name'
			//description
			//stack trace
			
			
			System.out.println("AAA");
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
			
			
			
		}
		
		finally
		{
			System.out.println("This is finally Block");
		}
	}
}


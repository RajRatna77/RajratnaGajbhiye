package com.logical_programs;
import java.util.Scanner;
public class PrimeNumber 
{

	public static void main(String[] args) 
	{

		int num ;
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter The Number to check Whether it is PRIME or NOT");
	    num=s.nextInt();
		
		boolean flag = true;
	    for (int i = 2; i < num ; ++i) 
	    {
	    	
	      // condition for non-prime number
		      if (num % i == 0) 
		      {
		        flag= false;
		        break;
		    	  
		      }
		      
		      
	    }
	    
		   if (flag)
		    {
		      System.out.println(num + " is a prime number.");
		    }
	    
		   else
		    {
		    	System.out.println(num + " is not a prime number.");
		    }
		    
		      
	    
	  }
}

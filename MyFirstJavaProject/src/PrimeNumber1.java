import java.util.Scanner;

public class PrimeNumber1 
{

	public static void main(String args[])
	{
	int num ;
	Scanner s=new Scanner(System.in);
	
	System.out.println("Enter The Number to check Whether it is PRIME or NOT");
    num=s.nextInt();
	
	
    for (int i = 2; i < num ; ++i) 
    {
    	
      
	      if (num % i == 0) 
	      {
	    	  System.out.println(num + " is a prime number.");
	    	 
	      }
	      
	      else
		    {
		    	System.out.println(num + " is not a prime number.");
		    }
    }
    
	}
}

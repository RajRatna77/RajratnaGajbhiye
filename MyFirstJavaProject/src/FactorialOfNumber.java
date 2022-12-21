import java.util.Scanner;
public class FactorialOfNumber 
{

	public static void main(String args[])
	{
		int no;
		
		Scanner s=new Scanner(System.in);
		
		System.out.println(" Mitra Number Enter Kar");
		
		no=s.nextInt();
		
	
		int fact=1;
		
		for(int i=1;i<=no;i++)// a=6,i=5
		{
			
			fact=fact*i;
			
		}
		
		System.out.println("Factorial is "+fact);
	}
}

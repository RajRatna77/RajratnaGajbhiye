import java.util.Scanner;
public class Swapping 
{
	public static void main(String args[])
	{
	
		int temp;
		
		System .out.println("Enter Two Numbers to be swapped");
		
		Scanner s=new Scanner(System.in);
		
	
		
		int x=s.nextInt();
		System .out.println("First Number = "+x);
		
		int y=s.nextInt();
		
		
		System .out.println("Second Number = "+y);
		
		
		temp=x;
		x=y;
		y=temp;
		
		System .out.println("Two Numbers After swapping");
		
		System .out.println("First Number= "+x);
		System .out.println("Second Number= "+y);
		
		
		
		
	}
	
	
	
	}

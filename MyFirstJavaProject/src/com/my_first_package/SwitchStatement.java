package com.my_first_package;

public class SwitchStatement 

{

	public static void main(String args[])
	{
		
		int day=5;
		
		switch(day)
		{
		
		case 1: System.out.println("FIRST DAY: MONDAY");
		case 2: System.out.println("SECOND DAY: TUESDAY");
		case 3: System.out.println("THIRD DAY: WEDNESDAY");
		case 4: System.out.println("FOURTH DAY: THURSDAY");
		case 5: System.out.println("FIFTH DAY: FRIDAY");
		case 6: System.out.println("SIXTH DAY: SATURDAY");
		case 7: System.out.println("LAST DAY: SUNDAY");
		
		default: System.out.println("HEY THIS IS THE WRONG DAY THAT YOU HAVE ENTERED");
		
		}
	}
}

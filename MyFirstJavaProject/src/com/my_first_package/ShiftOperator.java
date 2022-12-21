package com.my_first_package;

public class ShiftOperator 

{

	public static void main(String args[])
	{
		int i =10;
		
		//<< ---Right shift operator ,which will shift value (10: 10100000)bye two places where two zeros will be added in final output
		
		System.out.println(i<<2);
		//output would be 40: which would give binary value as '101000' , as two zeros are added.
		
		System.out.println(i<<3);
		//output would be 80: which would give binary value as '1010000' , as three zeros are added.
		
		
		//<< ---Left shift operator ,which will right shift value (10: 1)by two places where one place  will be subtracted in final output
				System.out.println(i>>2);
				//output would be 2: which would give binary value as '10' 
				System.out.println(i>>3);
				
				//output would be 1: which would give binary value as '1'
				//System.out.println(i>>5);
	}
	
}

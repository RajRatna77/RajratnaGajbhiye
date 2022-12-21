package com.my_first_package;

public class LogicalAndBitwiseOpearors 

{

	public static void main(String args[])
	{
		
		int a=10;
		int b=5;
		int c =20;
		
		//Logical AND and Bitwise AND 
		
		System.out.println(a<b  &&  a<c); //Logical AND Operator is used : If first condition is false(0) then it will not check another condition and gives output
		System.out.println(a<b  &  a<c); //Bitwise AND Operator is used : it checks both condition and gives final output(10<5  & 10<20): Result -false(0) & True(1)
		System.out.println(a>b  &  a>c); //Bitwise AND Operator is used
		
		
		//Logical OR and Bitwise OR
		
		System.out.println(a<b ||  a<c); //Logical OR Operator is used : If first condition is TRUE(0) then it will not check another condition and gives output
		System.out.println(a<b |  a<c); //Bitwise OR Operator is used : it checks both condition and gives final output(10<5  & 10<20): Result -false(0) & True(1)
		System.out.println(a>b |  a>c); //Bitwise OR Operator is used
		
		//Bitwise Exclusive OR
		
		int x=7;
		int y=5;
		
		System.out.println(x^y);
		
	} 
}

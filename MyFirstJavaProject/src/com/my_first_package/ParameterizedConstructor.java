package com.my_first_package;

public class ParameterizedConstructor 

{

	String city; //Global Variable
	
			ParameterizedConstructor() // Zero-Argument Constructor or Non-Parameterized Constructor
			{
				city="AMBARNATH";
				System.out.println(city);
			}
			
			ParameterizedConstructor(int a) // Parameterized Constructor
			{
				
				System.out.println(a);
				
				
			}
			ParameterizedConstructor(String name,int b)
			{
				
				System.out.println(b);
				System.out.println(name);
				
			}
			ParameterizedConstructor(int k,int c)
			{
				
				System.out.println(k);
				System.out.println(c);
				
			}
	
	public static void main(String args[])
	{
		
		ParameterizedConstructor obj1=new ParameterizedConstructor();
		ParameterizedConstructor obj2=new ParameterizedConstructor(100);
		ParameterizedConstructor obj3=new ParameterizedConstructor("MUMBAI",1001);
		ParameterizedConstructor obj4=new ParameterizedConstructor(500,600);
		
	}
}

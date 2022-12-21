package com.my_first_package;

public class MyVariableClass 

{
	
	String city="Ambarnath"; //declaration of Global Variables
	static int f=20; //declaration of static variables: can be accessed by all methods
	
	public static void StaticVariable()
		{
			
			int age=77; //local variable : Can be Accessed only  within the class.
			System.out.println(age);
			System.out.println(f);
			
		}
	
	public void NonStaticVariable()
		{

			System.out.println(city); //Global Variables are also called as Non-Static variables and hence can only in non-static methods 
			System.out.println(f);
		}
	
	public static void main(String args[])
	
		{
			
			StaticVariable();
			
			MyVariableClass a=new MyVariableClass();
			a.NonStaticVariable();
		}

}

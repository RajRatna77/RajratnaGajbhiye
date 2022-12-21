package com.abstraction;

public abstract class ClassA 
{

	abstract void method1();//abstract method:Incompelete Method
	
	
	public void method2() //Non-Abstract method:Compelete Method
	{
		System.out.println("This IS Non-Abstract method:compelete Method");
	}
	
	public static void method3() //Non-Abstract and Static method:Compelete Method
	{
		System.out.println("This IS Non-Abstract and Static method:Compelete Method");
	}
	
	ClassA()
	{
		System.out.println("This Is Constructor of ClassA");
	}
	
	ClassA(int a)
	{
		a=10;
		System.out.println("The Value of a ="+a);
	}
}


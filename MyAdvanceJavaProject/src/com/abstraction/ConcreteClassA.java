package com.abstraction;

public class ConcreteClassA extends ClassA//Concrete Class for Abstract Class A
{
	public void method1()
	{
		System.out.println("This is mt  Abstract and compeleted Method");
	}
	
	public static void main(String argc[])
	{
		ConcreteClassA x=new ConcreteClassA();
		x.method1();
		x.method2();
		x.method3();
		//new ClassA(); So Constructors from abstract class cant be invoked 
		//in concrete class by creating an object of a concrete class. 
		
		
		
	}
	
}

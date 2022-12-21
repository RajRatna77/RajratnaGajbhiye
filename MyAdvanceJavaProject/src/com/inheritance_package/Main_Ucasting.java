package com.inheritance_package;

public class Main_Ucasting 

{

	public static void main(String args[])
	{
		
		Parent_UCast k=new Parent_UCast();
		k.money();// CALLING parent class methos
		k.MANUAL();
		
		
		Parent_UCast x=new Child_UCast();//Class Type Upcasting
		x.money();// calling child class method
		x.MANUAL();
		x.JAVA();
		System.out.println(x.a);
		
		
		
		
	}
}

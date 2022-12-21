package com.my_first_package;

public class HierarchialObjectClass 
{

	public static void main(String args[])
	{
		System.out.println("Hey!! You are in the Main Hierarchical Class");
		
		CowSubClass x=new CowSubClass();
		x.sound();
		x.humbarda();
		//x.bark();
		//x.Mew();
		
	}
}

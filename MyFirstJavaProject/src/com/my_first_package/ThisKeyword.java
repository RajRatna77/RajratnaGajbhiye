package com.my_first_package;

public class ThisKeyword 
{

	int rollno;
	String name;
	float fees;
	
	ThisKeyword(int rollno,String name,float fees)
	{
		
		this.rollno=rollno;
		this.name=name;
		this.fees=fees;
		
	}
	
	public void display()
	{
		System.out.println(rollno);
		System.out.println(name);
		System.out.println(fees);		
	}
	
	public static void main (String args[])
	{
		
		ThisKeyword obj1=new ThisKeyword(12,"RAJRATNA",100.5f);
		ThisKeyword obj2=new ThisKeyword(13,"RAJ",100.5f);
		ThisKeyword obj3=new ThisKeyword(14,"RATNA",100.5f);
		obj1.display();
		obj2.display();
		obj3.display();
		
	}
}

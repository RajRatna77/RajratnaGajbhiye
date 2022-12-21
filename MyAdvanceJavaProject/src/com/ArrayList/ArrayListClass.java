package com.ArrayList;

import java.util.ArrayList;

public class ArrayListClass 
{

	public static void main(String args[])
	{
		ArrayList l=new ArrayList();
		
		l.add(10);
		l.add(10);
		l.add("INDIA");
		l.add("A");
		l.add(20.20);
		l.add(null);
		l.add(null);
		
		System.out.println(l);
		System.out.println("Array List Size is : "+l.size());//Size always starts from 1
		
		System.out.println(l.get(2)); // to get specific index value
		
		l.set(2, "MUMBAI");//to update existing value
		
		System.out.println(l);
		
		l.remove(4);// to remove specific index value
		
		System.out.println(l);
		
		System.out.println(l.contains(10)); //to check whether the selected index value contains a value  or not 
		
		System.out.println(l.isEmpty()); // to check whether the Arraylist is Empty or not
		
		l.clear();
		
		System.out.println(l);
		
		
		
			
				
	}
}

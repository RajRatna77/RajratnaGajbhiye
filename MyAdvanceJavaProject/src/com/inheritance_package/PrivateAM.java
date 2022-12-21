package com.inheritance_package;

public class PrivateAM 

{

	private int a=40;
	private void msg()
	{
		System.out.println("Hey Its PRIVATE");
		
	}
	
	public static void main(String args[])
	{
		PrivateAM x=new PrivateAM ();
		x.msg();
		
	}
}


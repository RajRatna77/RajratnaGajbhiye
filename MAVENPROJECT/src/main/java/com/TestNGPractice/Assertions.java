package com.TestNGPractice;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions 
{

	@Test
	public void testcase1()
	{
		
		int a=10,b=20;
		int c=a+b;
		int e=25;
		System.out.println(".........1.......");
		System.out.println(".........2.......");
		
		Assert.assertEquals(c, e);
		
		System.out.println(".........3.......");
		System.out.println(".........4.......");
	}
	
	@Test
	public void testcase2()
	{
		
		SoftAssert soft=new SoftAssert();
		
		System.out.println("In Test Case 2");
		
		int a=10,b=20;
		int c=a+b;
		int e=25;
		System.out.println(".........1.......");
		System.out.println(".........2.......");
		
		soft.assertEquals(c, e);
		
		System.out.println(".........3.......");
		System.out.println(".........4.......");
		
		soft.assertAll();
	}
}


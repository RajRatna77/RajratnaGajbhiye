package com.DailyPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations 
{

	
	
	@BeforeTest
	  public void beforeTest() 
	  {
		  
		  
		  System.out.println("  @BeforeTest ");
	  }
	
	 @BeforeClass
	  public void beforeClass() 
	  {
		  System.out.println(" BeforeClass ");
	  }
	 
	 	  
	@BeforeSuite
	  public void beforeSuite() 
	  {
		  
		  System.out.println("  @BeforeSuite ");
	  }
	
	  @AfterMethod
	  public void afterMethod() 
	  {
		  System.out.println("  AftereMethod ");
	  }
	
	 
	
	  @AfterClass
	  public void afterClass() 
	  {
		  
		  System.out.println(" AfterClass ");
	  }
	
	  
	
	  @AfterTest
	  public void afterTest() 
	  {
		  
		  System.out.println("   @AfterTest ");
	  }
	
	  @BeforeMethod
	  public void beforeMethod() 
	  {
		 System.out.println("  BeforeMethod "); 
	  }
	  
	
	  @AfterSuite
	  public void afterSuite() 
	  {
		  
		  System.out.println("  @AfterSuite ");
	  }
	  
	  
		@Test
		  public void LoginPage() 
		  {
			  System.out.println("LoginPage");
		  }
		
		@Test
		public void SignInPage() 
		  {
			  System.out.println("SignInPage");
		  }
		
		@Test
		public void HomePage() 
		  {
			  System.out.println("HomePage");
		  }

}

package com.DailyPractice;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class Keywords 
{

	  
		@Test(dependsOnMethods="SignInPage",alwaysRun=true)
		  public void LoginPage() 
		  {
			  System.out.println("LoginPage");
		  }
		
		@Test//(dataProvider="Hello Pooja")
		public void SignInPage() 
		  {
			  System.out.println("SignInPage");
			 Assert.fail();
		  }
		
		@Test(priority=-1,description="Welcome To Home Page")
		public void HomePage() 
		  {
			  System.out.println("HomePage");
		  }
		
		@Test(priority=-2,invocationCount=3)
		public void Message() 
		  {
			  System.out.println("Message");
		  }

}

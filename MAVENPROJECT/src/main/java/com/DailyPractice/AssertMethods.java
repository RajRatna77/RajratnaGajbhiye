package com.DailyPractice;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertMethods 
{
	
	WebDriver driver;
	@Test(priority=-1)
	public void OpenBrowser()
	{
	
		WebDriverManager.chromedriver().setup();
		String url="https://majhinaukri.in/";
		driver.get(url);
	}
	
	@Test
	public void CloseBrowser()
	{
		
	}
	
	@Test
	public void TestTitle()
	{
		
	}
	
	@Test
	public void TestUrl()
	{
		
	}
	
	@Test
	public void TestData()
	{
		
	}
}

package com.ChromeBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextLocator 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "F:\\\\Software Testing Course\\\\Testing Software\\\\Selenium\\\\Browser Drivers\\\\chromedriver_win32\\\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      String url = "https://www.facebook.com";
	      
	      
	      driver.get(url);
	      // maximizing browser with maximize()
	      driver.manage().window().maximize();
	      driver.manage().deleteAllCookies();
	       //linkText Locator
	      
	      driver.findElement(By.linkText("Forgotten password?")).click();
	      
	      Thread.sleep(3000);
	      
	      driver.close();
		


	}

}

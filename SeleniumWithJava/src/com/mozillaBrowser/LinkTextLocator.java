package com.mozillaBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class LinkTextLocator 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\admin\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	      String url = "https://www.facebook.com";
	      
	      
	      driver.get(url);
	      // maximizing browser with maximize()
	      driver.manage().window().maximize();
	      driver.manage().deleteAllCookies();
	       //partialLinkText Locator
	      
	      driver.findElement(By.partialLinkText("Port")).click();
	      
	      Thread.sleep(3000);
	      
	      driver.close();
	      driver.quit();

	}

}

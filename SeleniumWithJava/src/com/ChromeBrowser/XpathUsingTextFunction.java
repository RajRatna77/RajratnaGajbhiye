package com.ChromeBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathUsingTextFunction 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Software TESTING\\Software\\Browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	      String url = "https://www.facebook.com/";
	      
	      
	      driver.get(url);
	      // maximizing browser with maximize()
	      driver.manage().window().maximize();
	      driver.manage().deleteAllCookies();
	      Thread.sleep(3000);
	      
	      //Locator:Relative Xpath by Attribute Name
	      //Syntax: //(tagname[@attribute name='attribute value'])
	      
	      driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
	      
	      
	       Thread.sleep(3000);
	       
	       driver.close();
	      
	}
}

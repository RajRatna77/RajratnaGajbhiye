package com.ChromeBrowser;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RLScroll 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "F:\\\\Software Testing Course\\\\Testing Software\\\\Selenium\\\\Browser Drivers\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	      String url = "file:///C:/Users/admin/Desktop/HTML/login%20page.html";
	      
	      driver.get(url);
	      // maximizing browser with maximize()
	      driver.manage().window().maximize();
	      driver.manage().deleteAllCookies();
	      Thread.sleep(3000);
	      
	      //Locator:Relative Xpath by Attribute Name
	      //Syntax: //(tagname[@attribute name='attribute value'])
	      
	      //JavaScriptExecutor
	      
	      JavascriptExecutor js= ((JavascriptExecutor)driver);
	     
	      Thread.sleep(3000);
	     //to scroll down
	      js.executeScript("scrollBy(0,1650)"); 
	      
	       Thread.sleep(3000);
	       
	       js.executeScript("scrollBy(0,-1650)"); 
	       
	       
	       
		      
	       Thread.sleep(3000);
		      
	       
	       js.executeScript("scrollBy(250,0)"); 
	       
	       Thread.sleep(3000);
	       
	       js.executeScript("scrollBy(-250,0)"); 
	       
	       Thread.sleep(3000);
	       
	       driver.close();
	      
	}
}

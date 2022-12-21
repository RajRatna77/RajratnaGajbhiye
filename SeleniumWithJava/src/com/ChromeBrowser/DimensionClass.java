package com.ChromeBrowser;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DimensionClass 
{

	public static void main(String[] args) throws InterruptedException 
	   {
	      System.setProperty("webdriver.chrome.driver", "F:\\\\Software Testing Course\\\\Testing Software\\\\Selenium\\\\Browser Drivers\\\\chromedriver_win32\\\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      String url = "https://www.tutorialspoint.com/index.htm";
	      
	      
	      driver.get(url);
	      // maximizing browser with maximize()
	      driver.manage().window().maximize();
	      driver.manage().deleteAllCookies();
	      
	      //Dimension Class(width,height)
	      Dimension d=new Dimension(700,500);
	      //setSize():sets browser size
	      driver.manage().window().setSize(d);
	      
	      //getSize(): gets available size of the browser.
	      Dimension size=driver.manage().window().getSize();
	      System.out.println("My Browser Window Size is"+size);
	      
	      Thread.sleep(3000);
	      
	      driver.close();
	      
	   }
	
}

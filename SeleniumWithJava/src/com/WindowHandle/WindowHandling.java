package com.WindowHandle;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Software TESTING\\Selenium Project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	      String parent = "https://phptravels.com/demo"; //Parent Window ID
	      
	      driver.get(parent);
	      // maximizing browser with maximize()
	      driver.manage().window().maximize();
	      driver.manage().deleteAllCookies();
	      Thread.sleep(3000);
	      
	      //Navigate to parent parent window
	      
	      driver.findElement(By.xpath("//*[@id='loginSignup']")).click();
	      
	      // get all open window id
	      
	    Set<String>  w= driver.getWindowHandles();//Child Window ID 
	    
	    int count=w.size();
	    
	    System.out.println("Total Window count :"+count);
	    
	    System.out.println("Window Title is : "+driver.getTitle());
	       
	       driver.close();
	      
	}
}

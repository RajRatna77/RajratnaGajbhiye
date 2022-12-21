package com.ClickMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class RightClickMethod 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Software TESTING\\Software\\Browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	      String url = "https://jqueryui.com/droppable/";
	      
	      driver.get(url);
	      // maximizing browser with maximize()
	      driver.manage().window().maximize();
	      driver.manage().deleteAllCookies();
	      Thread.sleep(3000);
	   
	      Actions a= new Actions(driver);
	     WebElement rc= driver.findElement(By.linkText("Draggable"));
	     
	     a.contextClick(rc).perform();
	      
	      Thread.sleep(3000);
	      
	     // Select s=new Select(rc);
	      
	    // s.selectByVisibleText("inspect");
	      
	      driver.close();
	      
	}
	
}

	


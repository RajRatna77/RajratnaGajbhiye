package com.ChromeBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class IDLocator {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "F:\\\\Software Testing Course\\\\Testing Software\\\\Selenium\\\\Browser Drivers\\\\chromedriver_win32\\\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      String url = "https://www.facebook.com/login/";
	      
	      
	      driver.get(url);
	      // maximizing browser with maximize()
	      driver.manage().window().maximize();
	      driver.manage().deleteAllCookies();
	       //Name Locator
	      
	      driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
	   
	     Thread.sleep(3000);
	      
	      driver.findElement(By.id("pass")).sendKeys("123456");
		   
	      Thread.sleep(3000);
	      
	      driver.findElement(By.tagName("button")).click();
	      
	      Thread.sleep(3000);
	      
	     driver.close();

	}

}

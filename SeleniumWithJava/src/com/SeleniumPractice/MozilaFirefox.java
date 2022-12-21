package com.SeleniumPractice;

  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
 
public class MozilaFirefox 
{

	public static void main(String[] args) throws InterruptedException 
	{
        // declaration and instantiation of objects/variables
    	System.setProperty("webdriver.gecko.driver","C:\\Users\\admin\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		//Maximize Browser Size
				String url1="https://www.youtube.com/";
				String url2="https://mail.google.com/mail/u/0/?tab=rm&ogbl#inbox";
				 driver.manage().window().maximize();
				 
				 //delete all cookies: So Opened URL will not keep any value in the history
				 
				 driver.manage().deleteAllCookies();
				 
				 //to Open the Particular URL
				 driver.get(url1);
				 Thread.sleep(2000);
				 
				driver.get(url2);
				Thread.sleep(3000);
				driver.close();// to close single window
				 
				 //to close all windows associated with the browser
				 
				 driver.quit();
    }

}

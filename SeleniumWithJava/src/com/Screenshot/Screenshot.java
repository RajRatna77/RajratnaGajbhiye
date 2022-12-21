package com.Screenshot;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;

public class Screenshot 
{

	public static void main(String[] args) throws InterruptedException, IOException 
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
	      
	      //To Take Screenshot
	      
	     // TakesScreenshot ts=((TakesScreenshot)driver);
	      //File source= ts.getScreenshotAs(OutputType.FILE);
	      
	     File source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	     
	     String path ="C:\\Users\\admin\\Desktop\\Practice\\Screenshot for Selenium\\MWPG1.png";
	     
	     File destination=new File(path);
	     
	     FileHandler.copy(source,destination);
	     
	     Thread.sleep(3000);
	     
	     JavascriptExecutor js=((JavascriptExecutor)driver);
	     
	     js.executeScript("scrollBy(0, 2000)");
	     
	     
	     File source1= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	     
	     String path1 ="C:\\Users\\admin\\Desktop\\Practice\\Screenshot for Selenium\\MWPG2.png";
	     
	     File destination1=new File(path1);
	     
	     FileHandler.copy(source1,destination1);
	     
	     
	     
	     
	     driver.close();
	}
}

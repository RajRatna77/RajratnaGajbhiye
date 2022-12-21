package com.ChromeBrowser;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PointClass 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "F:\\\\Software Testing Course\\\\Testing Software\\\\Selenium\\\\Browser Drivers\\\\chromedriver_win32\\\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      String url = "https://www.tutorialspoint.com/index.htm";
	      
	      
	      driver.get(url);
	      // maximizing browser with maximize()
	      driver.manage().window().maximize();
	      driver.manage().deleteAllCookies();
	      
	      //Point Class(x,y):- with Co-ordinates
	     Point p=new Point(300,400);
	      //setSize():sets browser size
	      driver.manage().window().setPosition(p); //fixing the position
	      
	      //getSize(): gets available size of the browser.
	      Point size=driver.manage().window().getPosition();
	      System.out.println("My Browser Window Size is"+size);
	      
	      Thread.sleep(3000);
	      
	      Point p1=new Point(50,100);
	      //setSize():sets browser size
	      driver.manage().window().setPosition(p1);
	      Thread.sleep(3000);
	      
	      Point p2=new Point(50,50);
	      //setSize():sets browser size
	      driver.manage().window().setPosition(p2);
	      Thread.sleep(3000);
	      
	      driver.close();

	}

}

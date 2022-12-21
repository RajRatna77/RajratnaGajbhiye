package com.JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SrollUpDown 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "F:\\\\Software Testing Course\\\\Testing Software\\\\Selenium\\\\Browser Drivers\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	      String url = "https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_4qsiujpf5j_e&adgrpid=60456322738&hvpone=&hvptwo=&hvadid=486393568006&hvpos=&hvnetw=g&hvrand=6874520322787681689&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9301468&hvtargid=kwd-360364908477&hydadcr=14451_2154369&gclid=Cj0KCQiA4OybBhCzARIsAIcfn9ntFaXTkEtpyvI11GIMXn0qLS63_gDKmr_-gT370y6uxSx0uLyrF0gaAoJOEALw_wcB";
	      
	      
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
	       
	       
	       js.executeScript("scrollBy(250,0)"); 
		      
	       Thread.sleep(3000);
		      
	       Thread.sleep(3000);
	       
	       driver.close();
	      
	}
}


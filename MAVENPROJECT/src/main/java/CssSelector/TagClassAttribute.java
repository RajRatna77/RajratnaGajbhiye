package CssSelector;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TagClassAttribute 
{

	public static void main(String[] args) throws InterruptedException 
	{
		//System.setProperty("webdriver.chrome.driver", "D:\\Software TESTING\\Selenium Project\\chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		String url="https://demo.guru99.com/test/facebook.html";
		
		driver.get(url);
		
		driver.findElement(By.cssSelector("input.inputtext[tabindex='1']")).sendKeys("abc1323@gmail.com");

		Thread.sleep(2000);
		
		
		
	}
}

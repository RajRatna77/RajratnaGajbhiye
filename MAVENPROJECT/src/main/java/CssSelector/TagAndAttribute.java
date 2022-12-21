package CssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TagAndAttribute 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		//System.setProperty("webdriver.chrome.driver", "D:\\Software TESTING\\Selenium Project\\chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		String url="https://demo.guru99.com/test/newtours/register.php";
		driver.get(url);
		
		driver.findElement(By.cssSelector("input[name='lastName']")).sendKeys("password");
		
		Thread.sleep(3000);
	}
}

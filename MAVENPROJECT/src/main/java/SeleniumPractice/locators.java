package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class locators 
{

	public static void main(String args[]) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		String url="https://www.zomato.com/";
		
		driver.get(url);
	
		
		driver.manage().window().maximize();
		//driver.findElement(By.tagName("input")).sendKeys("Ambarnath",Keys.ENTER);
		//Thread.sleep(3000);
		
		//String url2="https://www.rediff.com/";
		//driver.get(url2);
		
		//driver.findElement(By.name("srchword")).sendKeys("Ambarnath");
		//Thread.sleep(3000);
		
		//driver.findElement(By.id("srchquery_tbox")).sendKeys("Ambarnath",Keys.ENTER);
		//Thread.sleep(3000);
		
		//driver.findElement(By.className("tabs")).click();
		
		//Thread.sleep(3000);
		
		driver.findElement(By.linkText("Explore the city’s top nightlife outlets")).click();
		
		Thread.sleep(3000);
		
		//driver.navigate().back();
		//Thread.sleep(3000);
		
		//driver.findElement(By.partialLinkText("nightlife outlets"));
		
		
	
		
		
		
		//driver.close();
	}
}

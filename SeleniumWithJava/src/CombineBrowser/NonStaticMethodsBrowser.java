package CombineBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NonStaticMethodsBrowser 
{

	public void Selenium()
	{
		System.out.println("Lets Test Automation for Browser");
		
	}
	
	public void chrome()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Software Testing Course\\Testing Software\\Selenium\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
		//upcasting
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.close();
	}
	
	public void firefox()
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\admin\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.close();
		
	}
	public static void main(String args[]) throws InterruptedException
	{
		
		NonStaticMethodsBrowser d=new NonStaticMethodsBrowser();
		d.chrome();
		
		Thread.sleep(3000);
		
		d.firefox();
		Thread.sleep(3000);
	}
}

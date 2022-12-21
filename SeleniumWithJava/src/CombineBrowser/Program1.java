package CombineBrowser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Program1 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "F:\\Software Testing Course\\Testing Software\\Selenium\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
		//upcasting
		WebDriver driver= new ChromeDriver();
		
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

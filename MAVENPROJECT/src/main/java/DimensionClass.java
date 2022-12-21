import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DimensionClass 
{

	public static void main(String args[]) throws InterruptedException
	{
		//System.setProperty("webdriver.chrome.driver","D:\\\\\\\\Software TESTING\\\\\\\\Software\\\\\\\\Browser\\\\\\\\chromedriver.exe");
		//String url="https://www.naukri.com/mnjuser/homepage";
		//driver.get(url);
		WebDriverManager.chromedriver().setup();
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		WebDriver driver1=new EdgeDriver();
		String url="https://www.naukri.com/mnjuser/homepage";
		driver.get(url);
		driver1.get(url);
		Dimension d=new Dimension(-300,200);
				
		driver.manage().window().setSize(d);
		driver1.manage().window().setSize(d);
		Thread.sleep(3000);
		Dimension size=driver.manage().window().getSize();
		
		System.out.println(size);
		driver.quit();
		driver1.quit();
		
	}
}


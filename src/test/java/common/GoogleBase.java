package common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleBase {
	public WebDriver driver;
	String browser="chrome";
	
	
	
	public void launchBrowser() {
		if (browser=="chrome")

		{
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		}
		else if (browser=="firefox")
		{
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
			
		}
		else if(browser=="safari") {
			WebDriverManager.operadriver().setup();
			driver = new OperaDriver();
		}
		else {
			System.out.println("Wrong Browser");
		}
	    driver.get("https://www.google.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
public void closeBrowser()
{
	driver.close();
}
public void closeAllBrowser() 
{
	driver.quit();
}
}

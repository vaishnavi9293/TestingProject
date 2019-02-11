package Helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class BrowserPickUp {
  static WebDriver driver;
  
  public static WebDriver StartBrowser(String webBrowserName, String appUrl)
  {
	if(webBrowserName.equalsIgnoreCase("Chrome"))  
	{
	    String chromepath="E:\\vaishnavi\\chromedriver.exe"  ;
	    System.setProperty("webdriver.chrome.driver", chromepath);
	    driver = new ChromeDriver();
	}
	else if(webBrowserName.equalsIgnoreCase("firefox"))
	{
		driver =new FirefoxDriver();
	}
	
	driver.get(appUrl);
	driver.manage().window().maximize();
	return driver;

  }
  
}

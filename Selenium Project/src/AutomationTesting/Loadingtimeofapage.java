package AutomationTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loadingtimeofapage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String path = "E:\\vaishnavi\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);		
		String url ="https://www.facebook.com/";
		
		
		WebDriver driver = new ChromeDriver();
		
		long starttime = System.currentTimeMillis();
		driver.get(url);
		long endtime = System.currentTimeMillis();
		
		long totaltime = endtime-starttime;
		System.out.println("total loading time of a page is"+" "+totaltime);
		
		driver.quit();
		
		

	}

}

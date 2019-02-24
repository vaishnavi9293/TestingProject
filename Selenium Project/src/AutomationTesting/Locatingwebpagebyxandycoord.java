package AutomationTesting;

import java.awt.AWTException;
import java.awt.Color;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Locatingwebpagebyxandycoord {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub

		String Url = "https://www.google.com/";
		String path = "E:\\vaishnavi\\chromedriver.exe";

	    System.setProperty("webdriver.chrome.driver", path);
	    WebDriver driver = new ChromeDriver();
	    
	    driver.get(Url);
	    Thread.sleep(3000);
	    driver.manage().window().maximize();
	    Thread.sleep(3000);

	    
	    WebElement element = driver.findElement(By.xpath("//input[@title='Search']"));
	    Thread.sleep(3000);
	    
	    
	    Point point = element.getLocation();
	    Thread.sleep(3000);

	    int x= point.getX();
	    Thread.sleep(3000);

	    int y = point.getY();
	    Thread.sleep(3000);
	    
	    Robot rb = new Robot();
	    Thread.sleep(3000);

	    
	    Color color = rb.getPixelColor(x, y);
	    
	    System.out.println(color);

	    
 
	    Actions action = new Actions(driver);
	    Thread.sleep(3000);

	    action.moveToElement(element, x, y);
	    Thread.sleep(3000);

	    action.sendKeys("Hello Google");
	    Thread.sleep(3000);

	    action.build().perform();
	    
	}

}

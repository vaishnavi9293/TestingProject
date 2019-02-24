package AutomationTesting;

import org.apache.commons.exec.Executor;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class loginposttestcase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String path = "E:\\vaishnavi\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		System.out.println("Facebook login logout Project is successfully launched");
		
		//login into the facebook with valid email and password credentials
		driver.findElement(By.xpath("//input[@type='email' and @name='email']")).sendKeys("7013179304");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password' and @name='pass']")).sendKeys("Password@1989");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@value='Log In' and @type='submit']")).click();
		
		
		Thread.sleep(3000);
		//after login if we able to see Home label in home page then facebook is successfully loggedin
		WebElement loginconfirm = driver.findElement(By.xpath("//a[contains(text(),'Home')]"));
		String loginconfirmation = loginconfirm.getText();
		
		if(loginconfirmation.contains("Home"))
		{
			System.out.println("Login Testcase is passed and facebook is logged in with given credentials");
		}
		else
		{
			System.out.println("TestCase Failed");
		}
		
		Thread.sleep(3000);
		
		//after login we will see black screen click on it so that facebook homepage will appear
				driver.findElement(By.xpath("//div[@class='_3ixn']")).click();
				
				
				Thread.sleep(5000);
		
		//after login into facebook we will seeing compose post link ,click it
		driver.findElement(By.xpath("//a[@class='_4-h7 _5qtn']")).click();
		Thread.sleep(3000);
		//after clicking it enter the text to be posted on the wall
		//driver.findElement(By.xpath("//div[@class='_1mwp navigationFocus _395 _1mwq _4c_p _5bu_ _3t-3 _34nd _21mu _5yk1' and @role='presentation']")).click();
		Thread.sleep(1000);
		
		//I used this actions because 59 and 69th line is not working to insert the data into compose post box(i entered this lines from net as it said that some times in Chrome Unable to focus element exception arises and sendkeys will not work. if we insert this action it will work
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("//div[@class='_1mwp navigationFocus _395 _1mwq _4c_p _5bu_ _3t-3 _34nd _21mu _5yk1' and @role='presentation']")));
		actions.click();
		actions.sendKeys("Hello Friends");
		actions.build().perform();

		//driver.findElement(By.xpath("//div[@class='_1mwp navigationFocus _395 _1mwq _4c_p _5bu_ _3t-3 _34nd _21mu _5yk1' and @role='presentation']")).sendKeys("Hello Friends");
		Thread.sleep(1500);
		//span[@data-text='true' and contains(text(),'Hello')]
		WebElement enteredpostmsg = driver.findElement(By.xpath("//span[@data-text='true' and contains(text(),'Hello')]"));
		String enteredpostmessage = enteredpostmsg.getText();
		Thread.sleep(3000);

		//click the post button
		driver.findElement(By.xpath("//button[@data-testid='react-composer-post-button' and @type='submit']")).click();
		Thread.sleep(3000);
		//after msg is posted on wall check that message on wall with the entered message on compose post if both are same then msg is posted successfully
		WebElement postmsgsuccess = driver.findElement(By.xpath("//div[@data-ad-preview='message']"));
		String postmessagesuccess = postmsgsuccess.getText();
		
		Thread.sleep(3000);
		
		if(postmessagesuccess.contains(enteredpostmessage))
		{
			System.out.println("TestCase is Passed and Message is posted on the wall successfully");
		}
		else
		{
			System.out.println("TestCase is failed");
		}
		
		

	}

}

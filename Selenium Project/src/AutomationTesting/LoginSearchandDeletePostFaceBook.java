package AutomationTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSearchandDeletePostFaceBook {

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
		
		Thread.sleep(3000);

		//after login we will see black screen click on it so that facebook homepage will appear
		driver.findElement(By.xpath("//div[@class='_3ixn']")).click();
		
		if(loginconfirmation.contains("Home"))
		{
			System.out.println("Login Testcase is passed and facebook is logged in with given credentials");
		}
		else
		{
			System.out.println("TestCase Failed");
		}
		
		
		
		
		Thread.sleep(3000);
		//after home page is opened enter the input to search in search bar
		driver.findElement(By.xpath("//input[@placeholder='Search' and @data-testid='search_input' ]")).sendKeys("Hello Friends");
        Thread.sleep(3000);
        //after entering the input to search press the search button
        driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _4w98 _4jy3 _517h _51sy _4w97' or @aria-label='Search' ]")).click();
        Thread.sleep(3000);
        
		//click the post button beside all inorder to filter the posts
		driver.findElement(By.xpath("//li[@data-edge='keywords_blended_posts' or class='_5vwz _5vwy _45hc _1hqh']"));
		Thread.sleep(3000);
       //in posts click the radio button 'you' which tells the posts done by you
        driver.findElement(By.xpath("(//a[@class='_4f3b' and @role='radio'])[2]")).click();
        Thread.sleep(3000);
        
        /*driver.findElement(By.xpath("//input[@placeholder='Search' and @aria-label='Search']")).sendKeys("Hello Friends");
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _4w98 _4jy3 _517h _51sy _4w97' or @aria-label='Search' ]")).click();
        Thread.sleep(3000);*/
        //capture the posts matching your search and searching element is equal to the element displayed then search is successful
       List <WebElement> searchpsts = driver.findElements(By.xpath("//div[@data-ad-preview='message']"));
	   int count = searchpsts.size();
		
		Thread.sleep(3000);
		
		if(count>0) {
			
		
			Thread.sleep(3000);

			System.out.println("Search TestCase Passed and Search for a Post is Done");
			Thread.sleep(3000);
			//going to ...button beside the searched post and clicking on it
			driver.findElement(By.xpath("//a[@data-testid='post_chevron_button']")).click();
			Thread.sleep(3000);
			//In ... button select the delete button
			driver.findElement(By.xpath("//a[@data-feed-option-name='FeedDeleteOption']")).click();
			Thread.sleep(3000);
			//after selecting delete button select delete forever button so that the post is deleted permanently
			driver.findElement(By.xpath("//button[@class='_42ft _4jy0 layerConfirm uiOverlayButton _4jy3 _4jy1 selected _51sy']")).click();
			System.out.println("TestCase Passed and searched Post is deleted");
		}
		else
		{
			System.out.println("TestCase Failed");
		}
	}

}

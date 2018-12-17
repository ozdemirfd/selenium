import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_6 {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "../chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get(" https://login.salesforce.com/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		driver.findElement(By.cssSelector("#username")).sendKeys("Mike");
		driver.findElement(By.cssSelector("#password")).sendKeys("abc1234");
		driver.findElement(By.cssSelector("#Login")).click();
		
		
		driver.get("https://www.bestbuy.com/signin");
		driver.findElement(By.cssSelector("*[name='ciaSignOn'] input#fld-e")).sendKeys(" mike@mike.com");
		driver.findElement(By.cssSelector(".relative-wrap input")).sendKeys("abc123");
		driver.findElement(By.cssSelector("button span:nth-child(1)")).click();
		
		driver.close();
	}

}

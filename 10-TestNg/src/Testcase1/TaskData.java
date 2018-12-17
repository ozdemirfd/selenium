package Testcase1;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class TaskData {
	   public static   WebDriver driver;  
    	//WebDriver driver = null;
	
	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "../chromedriver");
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://www.newtours.demoaut.com/");
	}
	@AfterTest
	public void afterTest() {
	driver.close();
	}
	
	
	
	@Test(dataProvider="getData1")
	public void loginTest1(String username,String password) {	
		driver.findElement(By.name("userName")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
	    driver.findElement(By.name("login")).click();
		

//		WebElement we = driver.findElement(By.name("passCount"));
//		Assert.assertTrue(we.isDisplayed(), "Not displaying");
	    
	    Assert.assertTrue(isElementPresent("passCount"));
		
		driver.findElement(By.xpath("//*[text()='Home']")).click();
		
	}
	
	@DataProvider
	public Object[][] getData1() {
		
		Object[][] data=new Object[2][2];
		

		data[0][0]="tutorial";
		data[0][1]="tutorial";
		
		data[1][0]="Mike";
		data[1][1]="Smith";
		
		return data;
	}
	
public boolean isElementPresent(String string) {
		
		if(driver.findElement(By.name(string)).isDisplayed()) {
			return true;
		}else {
			return false;
		}
}
}



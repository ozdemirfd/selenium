package com.prestashop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PositiveTest {

	 WebDriver driver;  
	@BeforeTest
	public void navigate() {
		System.setProperty("webdriver.chrome.driver", "../chromedriver");
		
		driver=new ChromeDriver();
		driver.get("http://automationpractice.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
		
	}
	
	
//	@AfterTest
//	public void afterTest() {
//	driver.close();
//	}
	
	@Test(priority=1)
	public void login() {
		driver.findElement(By.cssSelector(".header_user_info>a")).click();
		driver.findElement(By.id("email_create")).sendKeys("asapiwr@gmail.com");
		driver.findElement(By.cssSelector("#SubmitCreate>span")).click();
	}
	@Test(priority=2)
	public void register() {
		driver.findElement(By.id("customer_firstname")).sendKeys("Feride");
		driver.findElement(By.id("customer_lastname")).sendKeys("Ozdemir");
		driver.findElement(By.id("passwd")).sendKeys("123456");
		driver.findElement(By.id("address1")).sendKeys("13425 ranch Road");
		driver.findElement(By.id("city")).sendKeys("Austin");
		Select s=new Select(driver.findElement(By.id("id_state")));
		s.selectByValue("1");
		driver.findElement(By.id("postcode")).sendKeys("78717");
		driver.findElement(By.id("phone_mobile")).sendKeys("1342556789");
		driver.findElement(By.id("alias")).sendKeys("620 ranch road");
		driver.findElement(By.id("submitAccount")).click();
	}
	
	@Test(priority=3)
	public void signout() {

		driver.findElement(By.cssSelector(".logout")).click();
	}
	@Test(priority=4)
	public void logAgain() {
		  driver.findElement(By.id("email")).sendKeys("asapiwr@gmail.com");
		  driver.findElement(By.id("passwd")).sendKeys("123456");
		  driver.findElement(By.id("SubmitLogin")).click();
	
	}
	
	@Test(priority=5)
	public void verify() {
		String name=  driver.findElement(By.cssSelector("#header>div:nth-child(2)>div>div div:nth-child(1)>a")).getText();
		Assert.assertEquals(name, "Feride Ozdemir");
		
	}
	
}

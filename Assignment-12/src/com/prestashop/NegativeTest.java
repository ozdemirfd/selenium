package com.prestashop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NegativeTest {

	 WebDriver driver;  
	@BeforeTest
	public void navigate() {
		System.setProperty("webdriver.chrome.driver", "../chromedriver");
		driver=new ChromeDriver();
		driver.get("http://automationpractice.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
		
	}
	
	@BeforeMethod
	public void eachTest() {
		driver.findElement(By.cssSelector(".header_user_info>a")).click();
	}
	
	@AfterTest
	public void afterTest() {
	driver.close();
	}
	
	
	
	
	  @Test
	  public void wrongCredentialsTest() {
		  driver.findElement(By.id("email")).sendKeys("fd@gmail.com");
		  driver.findElement(By.id("passwd")).sendKeys("12345");
		  driver.findElement(By.id("SubmitLogin")).click();
	       WebElement loginError = driver.findElement(By.cssSelector(".alert.alert-danger li"));
	    	Assert.assertTrue(loginError.isDisplayed());
		  
	  
}
	@Test
	public void invalidEmailTest() {
		
			  driver.findElement(By.id("email")).sendKeys("fd@com");
			  driver.findElement(By.id("passwd")).sendKeys("1234");
			  driver.findElement(By.id("SubmitLogin")).click();
		       WebElement loginError = driver.findElement(By.cssSelector(".alert.alert-danger li"));
		    	Assert.assertTrue(loginError.isDisplayed());
	}
	  
	@Test
	public void blankEmail() {
		
			  driver.findElement(By.id("email")).sendKeys(Keys.TAB);
			  driver.findElement(By.id("passwd")).sendKeys("1234");
			  driver.findElement(By.id("SubmitLogin")).click();
		       WebElement loginError = driver.findElement(By.cssSelector(".alert.alert-danger li"));
		    	Assert.assertTrue(loginError.isDisplayed());
	}
	
	public void blankPassword() {
		
		  driver.findElement(By.id("email")).sendKeys("fd@com");
		  driver.findElement(By.id("passwd")).sendKeys(Keys.TAB);
		  driver.findElement(By.id("SubmitLogin")).click();
	       WebElement loginError = driver.findElement(By.cssSelector(".alert.alert-danger li"));
	    	Assert.assertTrue(loginError.isDisplayed());
}
	  
	  
}

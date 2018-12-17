package PomDesign;

import org.testng.annotations.Test;

import Pages.WebOrderLoginPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


import io.github.bonigarcia.wdm.WebDriverManager;

public class WebOrderLoginTest {
	WebDriver driver=null;
	WebOrderLoginPage loginPage;
	@BeforeTest
	public void open() {
		
    	WebDriverManager.chromedriver().setup();
		driver	=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
	}
	
	@AfterTest
	public void closeUp() {
		driver.quit();
	}
	
//	@Test
//	public void login() {
//	
//		driver.findElement(By.name("ctl00$MainContent$username")).sendKeys("Mike");
//		driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("1234");
//		driver.findElement(By.name("ctl00$MainContent$login_button")).click();
//		
//	}
	
	@Test
	public void loginUsingPom() {
		 loginPage=new  WebOrderLoginPage(driver);
		 loginPage.username.sendKeys("Tester");
		 loginPage.password.sendKeys("test");
		 loginPage.loginButton.click();
	}
	@Test
	public void negativeCase() {
		 loginPage=new  WebOrderLoginPage(driver);
		 loginPage.username.sendKeys("qwer");
		 loginPage.password.sendKeys("cvbn");
		 loginPage.loginButton.click();
		//String text= loginPage.invalidText.getText();
		// Assert.assertEquals(text, "Invalid Login or Password.");
		Assert.assertTrue(loginPage.invalidLoginMessage.isDisplayed());
	}
	

	

}

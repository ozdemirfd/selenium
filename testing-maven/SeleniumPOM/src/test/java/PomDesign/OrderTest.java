package PomDesign;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pages.AllOrdersPage;
import Pages.OrderPage;
import Pages.ViewOrdersPage;
import Pages.WebOrderLoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OrderTest {
	
    WebDriver driver=null;
	OrderPage order;
	WebOrderLoginPage loginPage;
	AllOrdersPage allorder;
	ViewOrdersPage vieworder;
	Properties prop;
	FileInputStream ip;
	@Test
	public void order() throws IOException{
		
    	WebDriverManager.chromedriver().setup();
		driver	=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
		loginPage=new  WebOrderLoginPage(driver);
		 loginPage.username.sendKeys("Tester");
		 loginPage.password.sendKeys("test");
		 loginPage.loginButton.click();
	
		 allorder=new AllOrdersPage(driver);
		 allorder.allOrder.get(2).click();
		 
		 order=new OrderPage(driver);
		 
		 order.dropdown(2);
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 order.quantity.sendKeys("4");
		 order.price.sendKeys("123");
		 order.discount.sendKeys("5");
		 order.calculate.click();
		 
		 prop=new Properties();
		 ip = new FileInputStream("/Users/fd/selenium/testing-maven/SeleniumPOM/src/test/resources/order.properties");
		 prop.load(ip);
		 String name=prop.getProperty("name");
		 order.name.sendKeys(name);
		 String street=prop.getProperty("street");
		 order.street.sendKeys(street);
		 String city=prop.getProperty("city");
		 order.city.sendKeys(city);
		 String state=prop.getProperty("state");
		 order.state.sendKeys(state);
		 String zip=prop.getProperty("zip");
		 order.zip.sendKeys(zip);
		 order.card.get(0).click();
		 String cardNumber=prop.getProperty("cardNumber");
		 order.cardNumber.sendKeys(cardNumber);
		 String date=prop.getProperty("date");
		 order.date.sendKeys(date);
	 order.process.click(); 
		 allorder.allOrder.get(0).click();
	 
		
		    vieworder=new  ViewOrdersPage(driver); 
			Assert.assertEquals(name, vieworder.columnNumber.get(1).getText());
			Assert.assertEquals(street, vieworder.columnNumber.get(5).getText());
			Assert.assertEquals(city, vieworder.columnNumber.get(6).getText());
			Assert.assertEquals(state, vieworder.columnNumber.get(7).getText());
			Assert.assertEquals(zip, vieworder.columnNumber.get(8).getText());
			Assert.assertEquals(cardNumber, vieworder.columnNumber.get(10).getText());
			Assert.assertEquals(date, vieworder.columnNumber.get(11).getText());
		 
		 driver.quit();
		
		
	}
	
	
	
	
	
}

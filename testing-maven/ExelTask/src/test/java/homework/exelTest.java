package homework;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class exelTest {
	
	WebDriver driver;
	String path="/Users/fd/Desktop/exelTask.xlsx";
    xls_reader data=new xls_reader(path);	
	
	@BeforeTest
	public void beforeEach() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
	}
	
	
	@Test
	public void sendData() {
		
	
	    
	    int numberRow=data.getRowCount("data");
	    
	    for(int x=2;x<=numberRow;x++) {
	    	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    	String name=data.getCellData("data", "Title", x);
	    	driver.findElement(By.name("q")).sendKeys(name);
	    	driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	    	String result=driver.findElement(By.id("resultStats")).getText();
	    	result=result.replace("About","");
	    	result=result.replace(" results","");
	    	data.setCellData("data", "Result", x,result);
	    	driver.navigate().back();
	    }
	    
	}
	
	@AfterTest
	public void close() {
		driver.quit();
	}
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}

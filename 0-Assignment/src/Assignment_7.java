import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment_7 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "../chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get(" http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
	//	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	   driver.findElement(By.cssSelector("#post-body-7708391096228750161 button")).click();
	   WebDriverWait wait=new WebDriverWait(driver,6);
	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));
	   String text= driver.findElement(By.xpath("//p[text()='WebDriver']")).getText();
	   if(text.equals("WebDriver")) {
		   System.out.println(text);  
	   }
	   
	   
	   driver.close();
	}

}

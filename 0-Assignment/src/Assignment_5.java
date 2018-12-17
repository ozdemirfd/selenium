import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "../chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.way2automation.com/angularjs-protractor/registeration/#/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("angular");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("password");
		driver.findElement(By.xpath("//*[@id='formly_1_input_username_0']")).sendKeys("angular");
		driver.findElement(By.xpath("//*[@class='form-actions']/button")).click();
		
		
		
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.xpath("//*[@name='loginform']/child::div/child::div[2]/input")).sendKeys("Mike");
		driver.findElement(By.xpath("//*[@id='fill_metric']/preceding-sibling::div/child::div[4]/input")).sendKeys("123");
		driver.findElement(By.xpath("//*[@name='proceed']")).click();
		
		driver.close();
	}

}

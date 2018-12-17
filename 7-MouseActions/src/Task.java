import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "../chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.johnlewis.com/");
		
		Actions ac=new Actions(driver);
		ac.moveToElement(driver.findElement(By.cssSelector(".primary-link-list-list--b3ea2>li:nth-child(1)>a"))).build().perform();
		
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[text()='Christmas Lights']")).click();
		
		driver.close();
	}

}

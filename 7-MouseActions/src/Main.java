import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Main {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "../chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.americangolf.co.uk/");
		
		Actions ac=new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath("//*[@id=\"header-navigation\"]/div[1]/ul/li[3]/a"))).build().perform();
		
	
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"CLUBS_1\"]/ul/li[3]/ul/li/a/span")).click();
		
		driver.close();
		

	}

}

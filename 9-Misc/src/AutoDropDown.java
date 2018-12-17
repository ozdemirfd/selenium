import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "../chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http:www.google.com/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.name("q")).sendKeys("hello");
		List<WebElement> list=driver.findElements(By.cssSelector("[role='listbox']>li"));
		System.out.println(list.size());
		list.get(3).click();
		
		driver.close();
		
	}

}

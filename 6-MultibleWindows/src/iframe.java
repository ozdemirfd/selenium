import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "../chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/guru99home/");
		
		int total= driver.findElements(By.tagName("iframe")).size();
		driver.switchTo().frame("a077aa5e");
		driver.findElement(By.xpath("/html/body/a")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.id("philadelphia-field-email")).sendKeys("user");
		
//		Set<String> winIds=driver.getWindowHandles();
//		Iterator<String> it=winIds.iterator();
	//	driver.switchTo().defaultContent();
//	    String main=it.next();
//	    String first=it.next();
//		driver.switchTo().window(first).close();
		
		
	}

}
//import java.util.*;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class iframe {
//
//	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver","../chromedriver");
//		ChromeDriver driver = new ChromeDriver();
//		
//		driver.navigate().to("http://demo.guru99.com/test/guru99home/");
//		driver.manage().window().maximize();
//		
//		int total=driver.findElements(By.tagName("iframe")).size();
//		System.out.println(total);
//		
//		driver.switchTo().frame("a077aa5e");
//		driver.findElement(By.xpath("/html/body/a")).click();
//		
//		Set<String> winIds=driver.getWindowHandles();
//		Iterator<String> it=winIds.iterator();
//		driver.switchTo().defaultContent();
//		driver.switchTo().window(it.next());
//		
//		
//		driver.findElement(By.id("philadelphia-field-email")).sendKeys("Mike");
//	}
//
//}
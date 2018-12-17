import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task7 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "../chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.etsy.com/");
		driver.manage().window().maximize();
		
		List<WebElement> links= driver.findElements(By.tagName("a"));
		
//		for( int i=0;i<links.size();i++) {
//			WebElement link= links.get(i);
//			if (link.getText().equals("Clothing & Shoes")) {
//				link.click();
//			}
//			
//		};
		
		for(WebElement x :links) {
			if(x.getText().equals("Clothing & Shoes")) {
				x.click();
				break;
			}
		
			
		}	 driver.close();
        driver.quit();
		
          
	}

}

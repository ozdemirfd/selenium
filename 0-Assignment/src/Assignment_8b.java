import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_8b {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "../chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		String[] intArray={ "honda","toyota","ford","tesla","bmw" };
		
		for(int x=0;x<intArray.length;x++) {
			driver.findElement(By.name("q")).sendKeys(intArray[x]);
			driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
			
			String result=driver.findElement(By.id("resultStats")).getText();
			driver.navigate().back();
			String res=result.replace("About","");
			int index=res.indexOf("(");
			String remain=res.substring(index);
			String Remaining=res.replace(remain,"");
			
			System.out.println(intArray[x] + Remaining + " found");
			
			
		}
		driver.close();
	}

}

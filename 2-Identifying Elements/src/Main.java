import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "../chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		// id locator
		
		driver.findElement(By.id("login1")).sendKeys("Mike");
		
		// name
		driver.findElement(By.name("passwd")).sendKeys("1234");
		
		// linkText
		//driver.findElement(By.linkText("Forgot Password?")).click();
		
		//partialLinkText
		 driver.findElement(By.partialLinkText("new account")).click();
		
		 
		 
		
		

	}

}

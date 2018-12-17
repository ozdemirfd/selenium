import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "../chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get(" https://www.website.com/sign-in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("Mike");
		driver.findElement(By.id("password")).sendKeys("1234");
		driver.findElement(By.id("signin-submit2")).click();
		driver.close();

	}

}

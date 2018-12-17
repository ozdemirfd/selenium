import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_8 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "../chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.way2automation.com/angularjs-protractor/registeration/#/login");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("angular");
		String name=driver.findElement(By.id("username")).getAttribute("value");
		System.out.println(name);
		
		driver.findElement(By.id("password")).sendKeys("password");
		String password=driver.findElement(By.id("password")).getAttribute("value");
		System.out.println(password);
		
		driver.findElement(By.id("formly_1_input_username_0")).sendKeys("angular");
		String confirm=driver.findElement(By.id("formly_1_input_username_0")).getAttribute("value");
		System.out.println(confirm);
		
		String login=driver.findElement(By.cssSelector(".btn.btn-danger")).getText();
		System.out.println(login);
		
		driver.findElement(By.cssSelector(".btn.btn-danger")).click();
		
		String verify=driver.findElement(By.cssSelector(".ng-scope>p:nth-child(2)")).getText();
		
		if(verify.equals("You're logged in!!")) {
			System.out.println(verify);
		}
		
		driver.findElement(By.linkText("Logout")).click();
		
		
		driver.close();
	}

}

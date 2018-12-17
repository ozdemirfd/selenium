import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task6 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "../chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://rediff.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.cssSelector("#signin_info>a:nth-child(1)")).click();
		driver.findElement(By.cssSelector("[title='Already a user? Sign in']")).click();
		driver.findElement(By.cssSelector("[name='loginform'] div #login1")).sendKeys("Mike");
		driver.findElement(By.cssSelector(".f14.margTop10.form-label + div>input")).sendKeys("1234");
		driver.findElement(By.cssSelector("[name='proceed']")).click();
		driver.close();
	}

}

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "../chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		
		String text=driver.findElement(By.cssSelector(".floatL.bold")).getText();
		System.out.println(text);
		
		driver.findElement(By.id("login1")).sendKeys("Mike");
		String input=driver.findElement(By.id("login1")).getAttribute("value");
		System.out.println(input);
		
		String gotext=driver.findElement(By.name("proceed")).getAttribute("value");
		System.out.println(gotext);
		
		String signtext=driver.findElement(By.xpath("//*[text()='Secured Login']")).getText();//
		System.out.println(signtext);
		
		driver.close();
	}

}

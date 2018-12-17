import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "../chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[text()='Terms']")).click();
		Set <String> winId= driver.getWindowHandles();

		System.out.println(winId.size());
    	Iterator<String> it = winId.iterator();
		
		String mainWindow = it.next();
		String firstWindow = it.next();
		
		System.out.println(mainWindow);
		driver.switchTo().window(firstWindow);
		
		driver.close();
		driver.quit();
	}

}

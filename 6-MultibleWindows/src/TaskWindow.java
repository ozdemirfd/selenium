import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "../chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-switch-windows/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("button1")).click();
		
		//1st get all windows
		Set <String> winId= driver.getWindowHandles();

		//all set items and iterate
    	Iterator<String> it = winId.iterator();
		
		String mainWindow = it.next();
		String firstWindow = it.next();
		
		
		driver.switchTo().window(firstWindow);
		String Titlefirst= driver.getTitle();
		System.out.println(Titlefirst);
		
		driver.switchTo().window(mainWindow);
		String maintitle= driver.getTitle();
		System.out.println(maintitle);
		
		driver.close();
		driver.quit();

	}

}

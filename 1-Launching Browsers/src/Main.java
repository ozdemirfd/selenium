import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "../chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		System.setProperty("webdriver.gecko.driver","../geckodriver");
		FirefoxDriver driver2=new FirefoxDriver();
		driver2.get("https://www.bestbuy.com/");
		 driver2.close();// close the browser page whatever focus on right now
	     driver2.quit();// close all the instances
		

	}

}


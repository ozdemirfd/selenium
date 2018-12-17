import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicBrowser {

	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver", "../chromedriver");
//		System.setProperty("webdriver.gecko.driver","../geckodriver");
//	WebDriver driver=new ChromeDriver();
//	driver=new FirefoxDriver();
//	driver.get("https://www.amazon.com/");
	
		
//		String browser = "Firefox";
//		WebDriver driver=null;// right now there is no place for looking like ChromeDrivr
//		
//		if(browser.equals("Chrome")) {
//			System.setProperty("webdriver.chrome.driver", "/Users/JavaScript/Selenium/chromedriver");
//			driver = new ChromeDriver();
//		}else if(browser.equals("Firefox")) {
//			System.setProperty("webdriver.gecko.driver", "/Users/JavaScript/Selenium/geckodriver");
//			driver = new FirefoxDriver();
//		}
//		
//		driver.get("https://www.amazon.com/");
		
		String browser = "Firefox";
		WebDriver driver=null;
		
		if(browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/JavaScript/Selenium/chromedriver");
			driver = new ChromeDriver();
		}else if(browser.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "/Users/JavaScript/Selenium/geckodriver");
			driver = new FirefoxDriver();
		}
		
		driver.get("https://www.amazon.com/");
		driver.close();
		//selenium




		
		
	}

}

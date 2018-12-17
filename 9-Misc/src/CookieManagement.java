import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookieManagement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "../chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.cnn.com/");
		
		Set<Cookie> ck = driver.manage().getCookies();
		for(Cookie cook: ck) {
			System.out.println(cook.getName() + "|" + cook.getValue() );
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().deleteCookieNamed("_cb_svref");
	}

}

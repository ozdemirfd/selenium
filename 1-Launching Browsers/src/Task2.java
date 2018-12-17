import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "../chromedriver");
		ChromeDriver driver=new ChromeDriver();
	

		//get
		driver.get("https://www.dice.com/");
		driver.get("https://www.indeed.com/");
		
		
		driver.navigate().back();

		String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		driver.navigate().forward();
		
		String title2 = driver.getTitle();
		System.out.println(title2);
		
		String url2 = driver.getCurrentUrl();
		System.out.println(url2);
		
		driver.close();
		driver.quit();

	}

}

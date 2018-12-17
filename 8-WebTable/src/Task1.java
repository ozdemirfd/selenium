import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

			public static void main(String[] args) {
				System.setProperty("webdriver.chrome.driver", "../chromedriver");
				ChromeDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("http://testingpool.com/data-types-in-java/");
				
					int rows = driver.findElements(By.cssSelector(".su-table>table>tbody>tr")).size();
					System.out.println(rows);
					
					int column= driver.findElements(By.cssSelector(".su-table>table>tbody>tr:nth-child(1)>td")).size();
					System.out.println(column);
					
					
					String bytname= driver.findElement(By.cssSelector(".su-table>table>tbody>tr:nth-child(2)>td:nth-child(3)")).getText();
					System.out.println(bytname);
					
					String fl= driver.findElement(By.cssSelector(".su-table>table>tbody>tr:nth-child(6)>td:nth-child(1)")).getText();
					System.out.println(fl);
					driver.quit();

		

	}

}

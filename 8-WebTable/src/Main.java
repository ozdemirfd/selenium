import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "../chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers/bse.daily.groupall");
		
		List<WebElement> names = driver.findElements(By.cssSelector(".dataTable>tbody>tr>td:nth-child(1)"));
		System.out.println(names.size());
		
		List<WebElement> price = driver.findElements(By.xpath("//*[@class='dataTable']/tbody/tr/td[4]"));
		System.out.println(price.size());
		
		String companyName = "Jyoti";
		
		for(int x=0;x< names.size();x++) {
			if(names.get(x).getText().equals(companyName)) {
				
				System.out.println(price.get(x).getText());	
				break;
			
			}
			
		}
		
		int rows=driver.findElements(By.cssSelector(".dataTable>tbody>tr:nth-child(1)>td")).size(); 
		System.out.println(rows);
		
driver.quit();
	}

}

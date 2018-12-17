import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {

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

//package WebTables;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import java.util.List;
//
//public class task1 {
//    public static void main(String[] args) {
//        System.setProperty("webdriver.chrome.driver","C:/Users/kbaialiev/Desktop/JavaScript/Selenium/jar/chromedriver.exe");
//        WebDriver driver=new ChromeDriver();

//        driver.get("http://testingpool.com/data-types-in-java/");
//        driver.manage().window().maximize();

//        List<WebElement> rows=driver.findElements(By.cssSelector("div.pf-content > div.su-table > table > tbody tr"));
//        List<WebElement> columns=driver.findElements(By.cssSelector("div.pf-content > div.su-table > table > tbody > tr:nth-child(1) > td"));
//        System.out.println(rows.size());
//        System.out.println(columns.size());

//        WebElement byte100=driver.findElement(By.cssSelector("div.su-table > table > tbody > tr:nth-child(2) > td:nth-child(3)"));
//        WebElement fl=driver.findElement(By.cssSelector("div.su-table > table > tbody > tr:nth-child(6) > td:nth-child(1)"));

//        System.out.println(byte100.getText());
//        System.out.println(fl.getText());
//    }
//}
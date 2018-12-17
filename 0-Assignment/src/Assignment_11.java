import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_11 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "../chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ussoccer.com/results-statistics");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		int row=driver.findElements(By.cssSelector("table>tbody>tr")).size(); 
		List<WebElement> data= driver.findElements(By.cssSelector("table>tbody>tr"));
		
		for(int x=0;x<row;x++) {
			System.out.println(data.get(x).getText());
		}
		
	
		
		
       driver.close();
	}

}

//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import java.util.List;
//
//public class Assignment_11 {
//    public static void main(String[] args) {
//        System.setProperty("webdriver.chrome.driver","../chromedriver");
//        WebDriver driver=new ChromeDriver();
//        driver.get("https://www.ussoccer.com/results-statistics");
//        driver.manage().window().maximize();
//        List<WebElement> header=driver.findElements(By.cssSelector("tbody > tr.table-header>th"));
//        for(WebElement l:header){
//            System.out.print(l.getText()+"        ");
//        }
//        int size=driver.findElements(By.xpath("//*[@id='content-wrap']/div[3]/div/table/tbody/tr")).size();
//        for(int i=2; i<=size; i++){
//            List<WebElement> contentList=driver.findElements(By.xpath("//*[@id='content-wrap']/div[3]/div/table/tbody/tr["+i+"]/td"));
//            System.out.println("\n");
//            for(WebElement c:contentList){
//                System.out.print(c.getText()+"  ");
//            }
//        }
//
//
//        driver.close();
//        driver.quit();
//
//    }
//}
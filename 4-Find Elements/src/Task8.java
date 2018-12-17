import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task8 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "../chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://abcnews.go.com/");
		driver.manage().window().maximize();
		
		
				WebElement box = driver.findElement(By.cssSelector("#leadoff>article:nth-child(2)>ul"));
				
			
				List<WebElement> links = box.findElements(By.tagName("li"));
				
				for(int i =0;i<links.size();i++) {
					links.get(i).click();
					driver.navigate().back();
					box = driver.findElement(By.cssSelector("#leadoff>article:nth-child(2)>ul"));
					links = box.findElements(By.tagName("li"));
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

//public class Task8 {
//	
//	
//	
//    public static void main(String[] args) {
//    	
//        System.setProperty("webdriver.chrome.driver","../chromedriver");
//        WebDriver driver=new ChromeDriver();
//        driver.get("https://abcnews.go.com");
//        driver.manage().window().maximize();
//        
//        List<WebElement> links =driver.findElements(By.cssSelector("#leadoff>article:nth-child(2)>ul li a"));
//        
//        for(int i=0; i<links.size(); i++){
//        	
//            links =driver.findElements(By.cssSelector("#leadoff>article:nth-child(2)>ul li a"));
//            System.out.println(links.get(i).getAttribute("href"));
//            links.get(i).click();
//            driver.navigate().back();
//            
//            
//            
//            
//            
//        }
//    }
//    
//    
//    
//    
//    
//}



//import java.util.List;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class Task8 {
//
//	public static void main(String[] args) {
//		
//		System.setProperty("webdriver.chrome.driver", "../chromedriver");
//		ChromeDriver driver = new ChromeDriver();
//		driver.get("https://abcnews.go.com/");
//		driver.manage().window().maximize();
//		
//		WebElement box = driver.findElement(By.cssSelector("#leadoff>.headlines.inbox.single.row-item>ul"));
//		List<WebElement> links = box.findElements(By.tagName("li"));
//		
//		for (int i=0; i<links.size(); i++) {
//			links.get(i).click();
//			driver.navigate().back();
//			box = driver.findElement(By.cssSelector("#leadoff>.headlines.inbox.single.row-item>ul"));
//			links = box.findElements(By.tagName("li"));
//			
//		
//		}
//
//	}
//
//}

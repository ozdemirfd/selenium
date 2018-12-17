import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertClass {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "../chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.id("login1")).sendKeys("user");
		driver.findElement(By.name("proceed")).click();
		
		Alert al=driver.switchTo().alert();
		System.out.println(al.getText());
		
		al.accept();
//		driver.switchTo().defaultContent();
//		
//		
//	  driver.close();
		


	}

}

//   import org.openqa.selenium.By;
//   import org.openqa.selenium.WebDriver;
//   import org.openqa.selenium.chrome.ChromeDriver;
//
//       public class Alert {
//       public static void main(String[] args) {
//           System.setProperty("webdriver.chrome.driver","../chromedriver");
//           WebDriver driver=new ChromeDriver();
//           driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
//           driver.manage().window().maximize();
//           driver.findElement(By.id("login1")).sendKeys("mike");
//           driver.findElement(By.name("proceed")).click();
//           
//           driver.switchTo().alert().accept();
//
//
//
//       }
//   }
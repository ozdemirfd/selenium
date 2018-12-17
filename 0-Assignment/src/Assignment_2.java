import java.util.Arrays;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "../chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://shop.honda.com/");
		driver.manage().window().maximize();
		
		String hondaTitle= driver.getTitle();
		System.out.println(hondaTitle);
		
		driver.get("https://www.ferrari.com/en-US");
		String ferrariTitle= driver.getTitle();
		System.out.println(ferrariTitle);
		
		String[] honda=hondaTitle.split(" ");
		String[]ferrari=ferrariTitle.split(" ");
		
		
		System.out.println(hondaTitle.substring(0,8)+ " " + ferrariTitle.substring(9, 16));
		
		System.out.println(honda[0] +" "+ honda [1]+ " " +ferrari[1]);
		
		driver.close();
		driver.quit();

	}

}

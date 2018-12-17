import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_10 {

    public static    WebDriver driver=null;
	
	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.chrome.driver", "../chromedriver");
		driver = new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		
		rowNumber("112.95");
		rowNumber("1,102.60");
		rowNumber("+ 9.96");
	
	}
		public static void rowNumber(String data) {
			
			int row=driver.findElements(By.cssSelector("#leftcontainer>table>tbody>tr")).size();
			System.out.println(row);
			List <WebElement> rowData1=driver.findElements(By.cssSelector("#leftcontainer>table>tbody>tr>td:nth-child(3)"));
			List <WebElement> rowData2=driver.findElements(By.cssSelector("#leftcontainer>table>tbody>tr>td:nth-child(4)"));
			List <WebElement> rowData3=driver.findElements(By.cssSelector("#leftcontainer>table>tbody>tr>td:nth-child(5)"));
			boolean s=false;
			int x;
			int count=0;
			for( x=0;x<row;x++) {
				driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
				if(rowData1.get(x).getText().equals(data) || rowData2.get(x).getText().equals(data) || rowData3.get(x).getText().equals(data)) {
					count=x+1;
					 s=true;
					 
					// System.out.println("Your data is 1: "+ data +" in line "+ x+1);
				}
			}
				
				if(s==true){
					System.out.println("Your data is "+ data +" in line "+ count);
				}else {
				
				System.out.println(-1);
			}
	
	}
	
}	
		
		
		
		 
	 



//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import java.util.List;
//
//public class Assignment10WebTable {
//    public static void main(String[] args) {
//
//        System.out.println(getRowNumWithCellData(14.27));
//        System.out.println(getRowNumWithCellData(14.284));
//        System.out.println(getRowNumWithCellData(6.50));
//
//    }
//
//    public static int getRowNumWithCellData(double value){
//        System.setProperty("webdriver.chrome.driver","C:/Users/kbaialiev/Desktop/JavaScript/Selenium/jar/chromedriver.exe");
//        WebDriver driver=new ChromeDriver();
//        driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
//        driver.manage().window().maximize();
//        driver.findElement(By.linkText("All")).click();
//        List<WebElement> myArray=driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr/td[4]"));
//        String str=Double.toString(value);
//        for(int i=0; i<15; i++){
//            System.out.println(myArray.get(i).getText());
//            String str2=myArray.get(i).getText();
//            if(str2.equals(str)){
//            return i+1;}
//        }
//        return -1;
//    }
//}
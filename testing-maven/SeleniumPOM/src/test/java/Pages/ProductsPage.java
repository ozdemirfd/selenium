
package Pages;

import org.openqa.selenium.WebElement;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {
	
	public ProductsPage (WebDriver driver) {
		
		PageFactory.initElements(driver,this);
		
	}
	@FindBy (css=".ProductsTable tr>td:nth-child(1)")
	public List<WebElement> productName;
	
	@FindBy (css=".ProductsTable tr")
	public List<WebElement> productRow;
		
	}
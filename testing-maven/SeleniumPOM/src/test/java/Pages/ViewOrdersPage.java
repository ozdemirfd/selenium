package Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewOrdersPage {
	
	public ViewOrdersPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(css=".SampleTable>tbody>tr:nth-child(2)>td")
	public List<WebElement> columnNumber;
	
	@FindBy(css=".SampleTable>tbody>tr")
	public List<WebElement> rowNumber;
	
}

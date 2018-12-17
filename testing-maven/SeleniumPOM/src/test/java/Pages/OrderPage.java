package Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class OrderPage {
	
	public OrderPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="ctl00_MainContent_fmwOrder_ddlProduct")
	public WebElement productSelect;
	
	public void dropdown(int index) {
		Select s = new Select(productSelect);
		s.selectByIndex(index);
	}
	
	@FindBy(id="ctl00_MainContent_fmwOrder_txtQuantity")
	public WebElement quantity;
	
	@FindBy(id="ctl00_MainContent_fmwOrder_txtUnitPrice")
	public WebElement price;
	
	
	@FindBy(id="ctl00_MainContent_fmwOrder_txtDiscount")
	public WebElement discount;
	
	
	@FindBy(css="li>.btn_dark")
	public WebElement calculate;
	
	
	@FindBy(id="ctl00_MainContent_fmwOrder_txtName")
	public WebElement name;
	
	
	@FindBy(id="ctl00_MainContent_fmwOrder_TextBox2")
	public WebElement street;
	
	
	@FindBy(id="ctl00_MainContent_fmwOrder_TextBox3")
	public WebElement city;
	
	
	@FindBy(id="ctl00_MainContent_fmwOrder_TextBox4")
	public WebElement state;
	
	
	@FindBy(id="ctl00_MainContent_fmwOrder_TextBox5")
	public WebElement zip;
	
	@FindBy(css=".RadioList tr>td")
	public List<WebElement> card;
	
	
	@FindBy(id="ctl00_MainContent_fmwOrder_TextBox6")
	public WebElement cardNumber;
	
	
	@FindBy(id="ctl00_MainContent_fmwOrder_TextBox1")
	public WebElement date;
	
	
	@FindBy(id="ctl00_MainContent_fmwOrder_InsertButton")
	public WebElement process;
	
	
	
}

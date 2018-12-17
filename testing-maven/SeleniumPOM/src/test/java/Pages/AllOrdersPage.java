package Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllOrdersPage {

	public AllOrdersPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	
	
   @FindBy(css="td>h1")
	public WebElement WebOrder;

   @FindBy(css=".login_info")
    public WebElement WelcomeMsg;
   
   @FindBy (css=".content>h2")
   public WebElement ListOfOrder;
   
   @FindBy (css="td>ul>li")
     public List<WebElement> allOrder;
   
   
   @FindBy(id="ctl00_logout")
   public WebElement logoutLink;
  
   public void logout() {
	   logoutLink.click();
   }
	
}
package TestCase3;


import org.testng.SkipException;
import org.testng.annotations.Test;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


public class AppSkip {

	
	@BeforeSuite
	public void beforeSuit() {
		System.out.println("--Before suit");
	}
	

	@AfterSuite
	public void afterSuit() {
		System.out.println("--After suit");
	}
	@Test(priority=1) // annotation
	
	public void LoginTest() {
		//selenium code
		
		System.out.println("Login");
	}
	
	@Test(priority=2)
	public void PasswordChange() {
		System.out.println("Changing password");
		throw new SkipException("reason");
	}

	@Test(priority=3,enabled=false)
	public void Logout() {
		System.out.println("Logout");
		
	
}
}

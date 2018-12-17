package TestCase3;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAfterMethod {
	@BeforeMethod
	public void beforeTest() {
		System.out.println("before executing test cases");
	}
	
	@AfterMethod
	public void afterTest() {
		System.out.println("after executing test cases");
	}

	@Test(priority=1) // annotation
	
	public void LoginTest() {
		//selenium code
		
		System.out.println("Login");
	}
	
	@Test(priority=2)
	public void PasswordChange() {
		System.out.println("Changing password");
		
	}

	@Test(priority=3)
	public void Logout() {
		System.out.println("Logout");
		
	
}
}
package TestCase3;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeAfterSuit {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("===Before Suite===");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("===After Suite===");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Executing All Test Cases");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("---Before Method (before each test case)---");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("After Executing All Test Cases");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("---After Method (after each test case)---");
	}
	@Test(priority=1) //Similar to "it" in protractor
	public void LoginTest() {
		//selenium code
		System.out.println("Login");
	}
	@Test(priority=2)
	public void PasswordChange() {
		System.out.println("Changing Password");
	}
	@Test(priority=3)
	public void LogoutTest() {
		System.out.println("Logout");
	}
}
package TestCase2;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Task {
	
	@Test (priority =1)
	public void Register() {
		System.out.println("Register successfully completed");
	}
	@Test (priority =2, dependsOnMethods = {"Register"})
	public void Search() {
		System.out.println("Search successfully completed");
	}
	@Test (priority =3, dependsOnMethods = {"Search"})
	public void Buy() {
		System.out.println("Buy successfully completed");
	}
	@Test (priority =4, dependsOnMethods = {"Buy"})
	public void Pay() {
		System.out.println("Pay successfully completed");
	}
	
	@BeforeMethod
	public void login () {
		System.out.println("login");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("Logout");
	}
	
	
	

}

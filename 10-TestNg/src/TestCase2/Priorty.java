package TestCase2;
import org.testng.annotations.Test;

public class Priorty {

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

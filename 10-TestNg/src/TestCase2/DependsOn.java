package TestCase2;
import org.testng.annotations.Test;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class DependsOn {

	
	@Test(priority=1) // annotation
	public void LoginTest() {
		//selenium code
		System.out.println("Login");
	}
	
	@Test(priority=2,dependsOnMethods= {"LoginTest"})
	public void PasswordChange() {
		System.out.println("Changing password");
		throw new SkipException("reason");
	}

	@Test(priority=3,dependsOnMethods= {"PasswordChange"})
	public void Logout() {
		System.out.println("Logout");
		
		
}

	@Test(priority=4) // annotation
	
	public void LoginTest2() {
		//selenium code
		System.out.println("Login2");
	}
}
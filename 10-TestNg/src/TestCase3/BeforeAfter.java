package TestCase3;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

	public class BeforeAfter {
		
		@BeforeTest
		public void beforeTest() {
			System.out.println("before executing test cases");
		}
		
		@AfterTest
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

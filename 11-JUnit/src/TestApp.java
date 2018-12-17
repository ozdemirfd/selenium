import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class TestApp {
	//@Ignore
	@Test
	public void testLogin() {
		System.out.println("testing login");
	}
	
	@Test
	public void testRegister() {
		System.out.println("testing register");
	}
	
	@Before
	public void open() {
		System.out.println("opening browser");
		
	}
	

	@After
	public void close() {
		System.out.println("closing browser");
		
	}
	@BeforeClass
	public static void init() {
		System.out.println("initializing test environment");
	}
	
	@AfterClass
	public static void out() {
		System.out.println("closing test environment");
	}
}

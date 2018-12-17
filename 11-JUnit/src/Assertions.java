import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

public class Assertions {
	
	@Rule
	public ErrorCollector errCol= new ErrorCollector();
	@Test
	public void testApp() {
//		System.out.println("A");
//		Assert.assertEquals("hello","hello123");
//		Assert.assertTrue(30>100);
//		System.out.println("B");
		
		
		System.out.println("A");
		try {
			Assert.assertEquals("hello","hello123");
		} catch (Throwable e) {
			errCol.addError(e);
			System.out.println("Error");
		}
		System.out.println("B");
		
		try {
			Assert.assertTrue("Link not present",false);
			
		}catch(Throwable t) {
			errCol.addError(t);
		}
	}

}

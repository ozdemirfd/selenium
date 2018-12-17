package TestCase3;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion {

	SoftAssert sa=new SoftAssert();
	
	@Test
	public void registerTest() {
//		String expectedTitle="yahoo";
//		String actualTitle="yahoo1";
//		
//		System.out.println("a");
//	    Assert.assertEquals(actualTitle, expectedTitle); // if there is critical things and you have to stop in this assert.you use this method,
	   
	//    but you dont want to stop here ,you need to go ahead ,you use SOFTASSERT class.
	    
	    
	//    System.out.println("b"); //it didnt print b,
		
		
	//	Assert.assertTrue(2>11,"error");
		
		////////////////////////////////////////////
		
		
		String expectedTitle="yahoo";
		String actualTitle="yahoo1";
		System.out.println("a");
		sa.assertEquals(actualTitle, expectedTitle);
		 System.out.println("b");
		sa.assertEquals("a", "c");
		sa.assertAll();
		
		
		
		
	}
	
	
}
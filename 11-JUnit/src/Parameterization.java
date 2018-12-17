	import org.junit.Test;
	import org.junit.runner.RunWith;
	import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

	@RunWith(Parameterized.class)
	public class Parameterization {

	public String bankName;
	public int accountNumber;

	
	
	public Parameterization(String bankName, int accountNumber) {
	
	this.bankName = bankName;
	this.accountNumber = accountNumber;
}
	
	@Parameters
	public static Object[][] getData(){
		Object data[][] = new Object[2][2];
		
		data[0][0]="Citibank";
		data[0][1]=2222;
		
		
		data[1][0]="Suntrun";
		data[1][1]=5555;
		
		
		return data;

		
	}

   @Test
	public void checkBalance() {
		System.out.println("Execution the test with " + bankName +"  -------  "+ accountNumber);
	}
	
	
	

	
}

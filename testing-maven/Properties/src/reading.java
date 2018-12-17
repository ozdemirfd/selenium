
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class reading {

	public static void main(String[] args) throws IOException{
		
		// Create an instance of class
		Properties prop = new Properties();
		
		//Provide the path of the file to constructor of the class
		FileInputStream ip = new FileInputStream("/Users/fd/selenium/testing-maven/Properties/employe.properties");

	prop.load(ip);

	String name=prop.getProperty("name");
	System.out.println(name);
	
	

	String age=prop.getProperty("age");
	System.out.println(age);
	
}
}
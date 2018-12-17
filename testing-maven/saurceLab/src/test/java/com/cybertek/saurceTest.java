package com.cybertek;

import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class saurceTest {
	
	public static final String USERNAME = "ozdemirfd";
    public static final String ACCESS_KEY = "d58b8ec6-0c00-46c0-b2f6-3a1f3d12f5dd";
    public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";

    @Test
    public void login() throws MalformedURLException {
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability("platform", "Windows 7");
		caps.setCapability("version", "56.0");
    	
    	RemoteWebDriver driver=new RemoteWebDriver(new URL(URL),caps);
		driver.get("https://www.cnn.com");
		
		driver.quit();
    }
}

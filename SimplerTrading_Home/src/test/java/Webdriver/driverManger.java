package Webdriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.android.AndroidDriver;

public class driverManger {
	
	private static final Logger LOGGER = LogManager.getLogger(driverManger.class);
	
	private static AndroidDriver driver;
	
	@BeforeTest
	public static AndroidDriver launchdriver() throws MalformedURLException, InterruptedException {
		
		 DesiredCapabilities caps= new DesiredCapabilities();
		 
		 try {
			 
			    LOGGER.info("driver start !!");
			    caps.setCapability("platformName", "Android");
			    caps.setCapability("platformVersion", "12.0");
			    caps.setCapability("udid", "a1025483");
			    caps.setCapability("deviceName", "Sharath");
			    caps.setCapability("appPackage", "com.bellesoft.stprotradingroom");
			    caps.setCapability("appActivity", "com.bellesoft.stprotradingroom.MainActivity");	
				
				LOGGER.info("driver running !!");
			    URL url = new URL("http://0.0.0.0:4723/wd/hub");
			    driver= new AndroidDriver(url,caps);
			    System.out.println("driver manager");
			    Thread.sleep(10000);
				
			}catch (Exception e) {
		       
				e.printStackTrace();
			}
		return driver;
	}
	
	 public static AndroidDriver getDriver() {
			return driver;
		}
}

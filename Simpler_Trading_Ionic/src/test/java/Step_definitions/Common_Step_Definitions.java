package Step_definitions;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import Webdriver.driverManger;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.Before;
import utilities.commonUtils;



public class Common_Step_Definitions  {
	
	private static final Logger LOGGER = LogManager.getLogger(Common_Step_Definitions.class);
	
	public static AppiumDriver driver;
	
	
	@Before
	public void beforeScenario() {
		
		try {
			LOGGER.info("before Scenarios");
			commonUtils CommonUtils = new commonUtils();
			CommonUtils.loadProperties();
			
			if(driver == null) {
				LOGGER.info("Launch driver");
				driverManger.launchdriver();	
				CommonUtils.initWebElements();
			}
			 
		}catch (Exception e) {
	       
			e.printStackTrace();
		}
	}
	
}

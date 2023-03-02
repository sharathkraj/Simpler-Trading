package utilities;

import java.util.Properties;

import org.openqa.selenium.support.PageFactory;

import Constants.constants;
import PageObject.AlertPage;
import PageObject.ClassPage;
import PageObject.LoginPage;
import PageObject.MenuPage;
import PageObject.TradingRO;
import Webdriver.driverManger;




public class commonUtils {
	
	
	public  void loadProperties() {

		
		Properties properties = new Properties();
		try {
			
			properties.load(getClass().getResourceAsStream("/config.properties"));
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		constants.UserName = properties.getProperty("UserName");
		constants.PassWord =  properties.getProperty("PassWord");
	}
	
	public void initWebElements() {
		PageFactory.initElements(driverManger.getDriver(), LoginPage.getInstance());
		PageFactory.initElements(driverManger.getDriver(), TradingRO.getInstance());
		PageFactory.initElements(driverManger.getDriver(), ClassPage.getInstance());
		PageFactory.initElements(driverManger.getDriver(), AlertPage.getInstance());
		PageFactory.initElements(driverManger.getDriver(), MenuPage.getInstance());
		
	}
}

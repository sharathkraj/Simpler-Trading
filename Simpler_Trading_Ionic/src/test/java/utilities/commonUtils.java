package utilities;

import java.util.Properties;

import org.openqa.selenium.support.PageFactory;

import PageObject.AlertPage;
import PageObject.ClassPage;
import PageObject.HomePage;
import PageObject.LoginPage;
import PageObject.MenuPage;
import PageObject.TradingPage;
import Webdriver.driverManger;




public class commonUtils {
	
	
	public  void loadProperties() {

		
		Properties properties = new Properties();
		try {
			
//			properties.load(getClass().getResourceAsStream("/config.properties"));
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void initWebElements() {
		System.out.println("Elements Initializes");
		PageFactory.initElements(driverManger.getDriver(),LoginPage.class);
		PageFactory.initElements(driverManger.getDriver(),HomePage.class);
		PageFactory.initElements(driverManger.getDriver(),AlertPage.class);
		PageFactory.initElements(driverManger.getDriver(),TradingPage.class);
		PageFactory.initElements(driverManger.getDriver(),ClassPage.class);
		PageFactory.initElements(driverManger.getDriver(),MenuPage.class);
		
	}
}

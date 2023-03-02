package Step_definitions;

import java.net.MalformedURLException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import Constants.constants;
import PageObject.AlertPage;
import PageObject.ClassPage;
import PageObject.LoginPage;
import PageObject.MenuPage;
import PageObject.TradingRO;
import Webdriver.driverManger;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Step_definitions_Login extends driverManger {
	
	private static final Logger LOGGER = LogManager.getLogger(Step_definitions_Login.class);
	
	@Given("Users can launch the Application via valid Credentials")
	public void users_can_launch_the_application_via_valid_credentials() throws MalformedURLException, InterruptedException {
		
		LoginPage.getInstance().enterUserName(constants.UserName);
		LoginPage.getInstance().enterPassWord(constants.PassWord);
		LoginPage.getInstance().ClickLogin();
		
		System.out.println("Login Sucessfully");
		LOGGER.info("Login Sucessfully");
			
		System.out.println("Enter the Homepage Sucessfully");
		LOGGER.info("Enter the Homepage Sucessfully");
		
		LoginPage.getInstance().Feed();
		LoginPage.getInstance().ClickNextVideo();
		LoginPage.getInstance().ClickBack();
		LoginPage.getInstance().ClickBooMark();
		LoginPage.getInstance().enterVideoFilter();
		LoginPage.getInstance().ClickDisable();
		LoginPage.getInstance().ClickEnable();
		LoginPage.getInstance().Searching();
			 
	}
		
	@Then("User can able to Enter the TradingRooms")
	public void user_can_able_to_enter_the_trading_rooms() {
		
		System.out.println("Enter the Tradingroom Sucessfully");
		LOGGER.info("Enter the Tradingroom Sucessfully");
		
		TradingRO.getInstance().enterTradingroom();
		TradingRO.getInstance().clickOptions();
		TradingRO.getInstance().enterRoom();
		TradingRO.getInstance().ClickAlertbutton();
		TradingRO.getInstance().ClickChatButton();
		TradingRO.getInstance().ClickUserButton();
		TradingRO.getInstance().ClickFilesButton();
		TradingRO.getInstance().ViewFiles();
		TradingRO.getInstance().ClickDownloadButton();
		TradingRO.getInstance().ClickScheduleButton();
		TradingRO.getInstance().ClickNextSchedule();
		TradingRO.getInstance().ClickSettingButton();
		TradingRO.getInstance().ClickPushButton();
		TradingRO.getInstance().ClickExitButton();
		System.out.println("exit the Tradingroom Sucessfully");
		LOGGER.info("exit the Tradingroom Sucessfully");

	
		
	}
	@Then("User can able to Enter the Classes")
	public void user_can_able_to_enter_the_classes() {
		ClassPage.getInstance().enterClassRoom();
		ClassPage.getInstance().clickClassRoom();
		ClassPage.getInstance().enterRoom();
		ClassPage.getInstance().ClickAlertbutton();
		ClassPage.getInstance().ClickChatButton();
		ClassPage.getInstance().ClickUserButton();
		ClassPage.getInstance().ClickFilesButton();
		ClassPage.getInstance().ViewFiles();
		ClassPage.getInstance().ClickDownloadButton();
		ClassPage.getInstance().ClickScheduleButton();
		ClassPage.getInstance().ClickNextSchedule();
		ClassPage.getInstance().ClickSettingButton();
		ClassPage.getInstance().ClickPushButton();
		ClassPage.getInstance().ClickExitButton();
	}
	@Then("User can able to Enter the Alerts")
	public void user_can_able_to_enter_the_alerts() {
	    AlertPage.getInstance().ClickAlert();
	    AlertPage.getInstance().ClickFilter();
	    AlertPage.getInstance().DeSelectall();
	    AlertPage.getInstance().SelectAll();
	    AlertPage.getInstance().ClickApply();
	    AlertPage.getInstance().ClickDetails();
	    AlertPage.getInstance().ClickBoomark();
	    AlertPage.getInstance().ClickBack();
	    AlertPage.getInstance().ClickSearch("trade");
	}
	@Then("User can able to Enter the Menu and Logout the Applications")
	public void user_can_able_to_enter_the_menu_and_logout_the_applications() {
	   
		MenuPage.getInstance().ClickMenubutton();
		MenuPage.getInstance().ClickPrivacy();
		MenuPage.getInstance().ClickHelp();
		MenuPage.getInstance().ClikAccount();
		MenuPage.getInstance().ClickPush();
		MenuPage.getInstance().ClickLogout();
		MenuPage.getInstance().ClickConfirm();
		
	}

}

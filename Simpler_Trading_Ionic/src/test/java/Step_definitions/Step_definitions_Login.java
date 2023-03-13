package Step_definitions;

import java.net.MalformedURLException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import PageObject.AlertPage;
import PageObject.ClassPage;
import PageObject.LoginPage;
import PageObject.MenuPage;
import Touch_actions.Swipes;
import Touch_actions.tap_click;
import Webdriver.driverManger;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Step_definitions_Login extends driverManger {
	
	private static final Logger LOGGER = LogManager.getLogger(Step_definitions_Login.class);
	
	@Given("Users can launch the Application via valid Credentials")
	public void users_can_launch_the_application_via_valid_credentials() throws MalformedURLException, InterruptedException {
		
		LoginPage.USERNAME.sendKeys("roomtest1@simplertrading.com");
		LoginPage.PASSWORD.sendKeys("4IW6i8vINHxWD@1upABBOqxG");
		LoginPage.LOGIN_BUTTON.click();
		
		System.out.println("Login Sucessfully");
		LOGGER.info("Login Sucessfully");
			
		System.out.println("Enter the Homepage Sucessfully");
		LOGGER.info("Enter the Homepage Sucessfully");
		
		Thread.sleep(1000);
//		System.out.println(" 1 ");		
		LoginPage.Videofilter.click();
		
		Thread.sleep(1000);
//		System.out.println(" 2 ");
		LoginPage.DeSelectAll.click();
		
		Thread.sleep(1000);
//		System.out.println(" 3 ");
		LoginPage.enable.click();
		
		Thread.sleep(1000);
//		System.out.println(" 4 ");
		LoginPage.apply.click();
		
		Thread.sleep(1000);
//		System.out.println(" 5 ");
		LoginPage.Videofilter1.click();
		
		Thread.sleep(1000);
//		System.out.println(" 6 ");
		LoginPage.SelectAll.click();
		
		Thread.sleep(1000);
//		System.out.println(" 7 ");
		LoginPage.apply1.click();
		
		Thread.sleep(10000);
//		System.out.println(" 8 ");
		LoginPage.bookMark.click();
		
		Thread.sleep(1000);
//		System.out.println(" 9 ");
		LoginPage.Videofilter2.click();
		
		Thread.sleep(1000);
		Swipes.swipetoclick(getDriver());
		
		Thread.sleep(1000);
//		System.out.println(" 10 ");
		tap_click.showBookmark(getDriver());
		
		
		Thread.sleep(1000);
//		System.out.println(" 11 ");
		LoginPage.ShowBookMark.click();
		
		Thread.sleep(1000);
//		System.out.println(" 12 ");
		LoginPage. removeBookMark.click();
		
		Thread.sleep(1000);
//		System.out.println(" 13 ");
		LoginPage.Videofilter3.click();
		
		Thread.sleep(1000);
		Swipes.swipetoclick(getDriver());
		
		Thread.sleep(1000);
//		System.out.println(" 14 ");
		tap_click.showBookmark(getDriver());
		
		Thread.sleep(1000);
//		System.out.println(" 15 ");
		LoginPage.HomeSearch.sendKeys("lot");
		
		
		Thread.sleep(1000);
//		System.out.println(" 16 ");
		LoginPage.HomeFeed.click();
		
//		Thread.sleep(1000);
//		System.out.println(" 17 ");
//		LoginPage.VideoPlay.click();
//		
//		Thread.sleep(1000);
//		System.out.println(" 18 ");
//		LoginPage.VideoPause.click();
		
		Thread.sleep(1000);
//		System.out.println(" 19 ");
		tap_click.nextVideo(getDriver());
		
		Thread.sleep(1000);
//		System.out.println(" 20 ");
		tap_click.nextVideo(getDriver());
		
		Thread.sleep(1000);
//		System.out.println(" 21 ");
		tap_click.back(getDriver());
		
		System.out.println("Home Page completed Sucessfully");
		LOGGER.info("Home Page completed Sucessfully");
			 
	}
		
	@Then("User can able to Enter the Alert and TradingRooms")
	public void user_can_able_to_enter_the_alert_and_trading_rooms() throws InterruptedException {
		
		System.out.println("Enter the Alert Sucessfully");
		LOGGER.info("Enter the Alert Sucessfully");
		
		Thread.sleep(1000);
		System.out.println(" 1 ");	
		tap_click.alerttab(getDriver());
		
		Thread.sleep(1000);
		System.out.println(" 2 ");
		AlertPage.AlertFilter.click();
		
		Thread.sleep(1000);
		System.out.println(" 3 ");
		AlertPage.DeSelect.click();
		
		Thread.sleep(1000);
		System.out.println(" 4 ");
		AlertPage.Apply.click();
		
		Thread.sleep(1000);
		System.out.println(" 5 ");
		AlertPage.AlertFilter.click();
		
		Thread.sleep(1000);
		System.out.println(" 6 ");
		AlertPage.oneAlertenable.click();
		
		Thread.sleep(1000);
		System.out.println(" 7 ");
		AlertPage.Apply1.click();
		
		Thread.sleep(1000);
		System.out.println(" 8 ");
		AlertPage.AlertFilter.click();
		
		Thread.sleep(1000);
		System.out.println(" 9 ");
		AlertPage.ChooseAll.click();
		
		Thread.sleep(1000);
		System.out.println(" 10 ");
		AlertPage.Apply1.click();
		
		Thread.sleep(1000);
		System.out.println(" 11 ");
		AlertPage.details.click();
		
				
		Thread.sleep(1000);
		System.out.println(" 12 ");
		AlertPage.bookMark.click();
		
		Thread.sleep(1000);
		System.out.println(" 13 ");
		AlertPage.back.click();
		
		Thread.sleep(1000);
		System.out.println(" 14 ");
		AlertPage.AlertFilter.click();
		
		Thread.sleep(1000);
		System.out.println(" 15 ");
		Swipes.swipetoclick(getDriver());
		
		
		Thread.sleep(1000);
		System.out.println(" 16 ");
		tap_click.back(getDriver());
		
		
		Thread.sleep(1000);
		System.out.println(" 17 ");
		AlertPage.details.click();
		
				
		Thread.sleep(1000);
		System.out.println(" 18 ");
		AlertPage.bookMark1.click();
		
		Thread.sleep(1000);
		System.out.println(" 19 ");
		AlertPage.back.click();
		
		Thread.sleep(1000);
		System.out.println(" 20 ");
		AlertPage.AlertFilter.click();
		
		Thread.sleep(1000);
		System.out.println(" 21 ");
		Swipes.swipetoclick(getDriver());
		
		Thread.sleep(1000);
		System.out.println(" 22 ");
		tap_click.back(getDriver());
		
		
		Thread.sleep(1000);
		System.out.println(" 23 ");
		AlertPage.Search.sendKeys("Trading");
		
		Thread.sleep(1000);
		System.out.println(" 24 ");
		AlertPage.details.click();
		
		Thread.sleep(1000);
		System.out.println(" 25 ");
		AlertPage.back.click();
		
		Thread.sleep(1000);
		System.out.println(" 26 ");
		AlertPage.Search.clear();
		 
		System.out.println("exit the Alert Sucessfully");
		LOGGER.info("exit the Alert Sucessfully");
		 
		 
		System.out.println("Enter the Tradingroom Sucessfully");
		LOGGER.info("enter the Tradingroom Sucessfully");
		
		Thread.sleep(1000);
		System.out.println(" 27 ");
		AlertPage.TradingRoomentry.click();
		
		Thread.sleep(1000);
		System.out.println(" 28 ");
		tap_click.options(getDriver());
		
		Thread.sleep(1000);
		System.out.println(" 29 ");
		AlertPage.RoomEntering.click();
		
		Thread.sleep(1000);
		System.out.println(" 30 ");
		AlertPage.ALERT_BUTTON.click();
		
		Thread.sleep(1000);
		System.out.println(" 31 ");
//		AlertPage.Alert_search.click();
		tap_click.alert_search(getDriver());
		
//		Thread.sleep(1000);
//		System.out.println(" 32 ");
//		AlertPage.search_Alert.sendKeys("sam");
		
		
		
		Thread.sleep(1000);
		System.out.println(" 33 ");
		AlertPage.CHAT_BUTTON.click();
		
		Thread.sleep(1000);
		System.out.println(" 34 ");
		AlertPage.USERS_BUTTON.click();
		
//		Thread.sleep(10000);
//		System.out.println(" 35 ");
//		AlertPage.User_Search.click();
//		
//		Thread.sleep(1000);
//		System.out.println(" 36 ");
//		AlertPage.User_Search1.sendKeys("woo");
//		
//		Thread.sleep(1000);
//		System.out.println(" 37 ");
//		AlertPage.User_Click.click();
//		
//		Thread.sleep(1000);
//		System.out.println(" 38 ");
//		AlertPage.User_Close.click();
//		
//		Thread.sleep(1000);
//		System.out.println(" 39 ");
//		AlertPage.User_Search1.clear();
		
		Thread.sleep(1000);
		System.out.println(" 40 ");
		AlertPage.FILES_BUTTON.click();
//		
//		Thread.sleep(10000);
//		System.out.println(" 41 ");
//		AlertPage.ViewFiles.click();
//		
//		Thread.sleep(10000);
//		System.out.println(" 42 ");
//		AlertPage.DOWNLOAD_BUTTON.click();
		
		Thread.sleep(1000);
		System.out.println(" 43 ");
		AlertPage.SCHEDULE_BUTTON.click();
		
		Thread.sleep(1000);
		System.out.println(" 44 ");
		AlertPage.NextSchedule.click();
		
		Thread.sleep(1000);
		System.out.println(" 45 ");
		AlertPage.SettingsButton.click();
		
		Thread.sleep(1000);
		System.out.println(" 46 ");
		AlertPage.pushNotification.click();
		
		Thread.sleep(1000);
		System.out.println(" 47 ");
		AlertPage.Disable.click();
		
		Thread.sleep(1000);
		System.out.println(" 48 ");
		AlertPage.Back.click();
		
		Thread.sleep(1000);
		System.out.println(" 49 ");
		AlertPage.confirm.click();
		
		System.out.println("exit the Tradingroom Sucessfully");
		LOGGER.info("exit the Tradingroom Sucessfully");
	
		
	}
	@Then("User can able to Enter the Classes and Menu")
	public void user_can_able_to_enter_the_classes_and_menu() throws InterruptedException {
		
		System.out.println("Enter the Classes Sucessfully");
		LOGGER.info("enter the Classes Sucessfully");
		
		
		Thread.sleep(1000);
		System.out.println(" 43 ");
		ClassPage.ClassesEntry.click();
		
		Thread.sleep(1000);
		System.out.println(" 44 ");
		ClassPage.internalUseOnly.click();
		
		Thread.sleep(1000);
		System.out.println(" 45 ");
		ClassPage.RoomEntering.click();
		
		Thread.sleep(1000);
		System.out.println(" 46 ");
		ClassPage.ALERT_BUTTON.click();
		
		Thread.sleep(1000);
		System.out.println(" 47 ");
		ClassPage.Alert_search.click();
		
		Thread.sleep(1000);
		System.out.println(" 48 ");
		ClassPage.search_Alert.click();
		
		Thread.sleep(1000);
		System.out.println(" 49 ");
		ClassPage.CHAT_BUTTON.click();
		
		Thread.sleep(1000);
		System.out.println(" 50 ");
		ClassPage.USERS_BUTTON.click();
		
		Thread.sleep(1000);
		System.out.println(" 51 ");
		ClassPage.FILES_BUTTON.click();
//		ClassPage.ViewFiles.click();
//		ClassPage.DOWNLOAD_BUTTON.click();
		
		Thread.sleep(1000);
		System.out.println(" 52 ");
		ClassPage.SCHEDULE_BUTTON.click();
		
//		ClassPage. NextSchedule.click();
		
		Thread.sleep(1000);
		System.out.println(" 53 ");
		ClassPage.SettingsButton.click();
		
		Thread.sleep(1000);
		System.out.println(" 54 ");
		ClassPage.pushNotification_enable.click();
		
		Thread.sleep(1000);
		System.out.println(" 55 ");
		ClassPage.Disable.click();
		
		System.out.println("Exit the Classes Sucessfully");
		LOGGER.info("Exit the Classes Sucessfully");
		
		
		System.out.println("Enter the Menu Sucessfully");
		LOGGER.info("enter the Menu Sucessfully");
		
		Thread.sleep(1000);
		System.out.println(" 56 ");
		ClassPage.MenuClick.click();
		
		Thread.sleep(1000);
		System.out.println(" 57 ");
		ClassPage.Privacy.click();
		
		Thread.sleep(1000);
		System.out.println(" 58 ");
		ClassPage.Help.click();
		
		Thread.sleep(1000);
		System.out.println(" 59 ");
		ClassPage.Account.click();
		
		Thread.sleep(1000);
		System.out.println(" 60 ");
		ClassPage.PushNotificatiosn.click();
		
		Thread.sleep(1000);
		System.out.println(" 61 ");
		ClassPage.DisableNotifications.click();
		
		Thread.sleep(1000);
		System.out.println(" 62 ");
		ClassPage.EnableNotifications.click();
		
		Thread.sleep(1000);
		System.out.println(" 63 ");
		ClassPage.BackMenu.click();
		
		System.out.println("Exit the Menu Sucessfully");
		LOGGER.info("Exit the Menu Sucessfully");
		
		
	}
	
	
	@Then("User can able to Enter the Logout the Applications")
	public void user_can_able_to_enter_the_logout_the_applications() throws InterruptedException {
	   
		
		Thread.sleep(1000);
		System.out.println(" 64 ");
		MenuPage.LOGOUT_BUTTON.click();
		
		Thread.sleep(1000);
		System.out.println(" 65 ");
		MenuPage.CONFIRM_BUTTON.click();
		
		System.out.println("Logout Sucessfully");
		LOGGER.info("Logout Sucessfully");
		
	}

}

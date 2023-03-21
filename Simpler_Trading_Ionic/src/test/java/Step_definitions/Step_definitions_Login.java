package Step_definitions;

import java.io.File;
import java.io.IOException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import PageObject.AlertPage;
import PageObject.ClassPage;
import PageObject.HomePage;
import PageObject.LoginPage;
import PageObject.MenuPage;
import PageObject.TradingPage;
import Touch_actions.Swipes;
import Touch_actions.tap_click;
import Webdriver.driverManger;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Step_definitions_Login extends driverManger {
	
	private static final Logger LOGGER = LogManager.getLogger(Step_definitions_Login.class);
	
	@Given("Users can launch the Application via valid Credentials and HomeTab")
	public void users_can_launch_the_application_via_valid_credentials_and_home_tab() throws IOException, InterruptedException {
		try {
			
			LoginPage.USERNAME.sendKeys("roomtest1@simplertrading.com");
			LoginPage.PASSWORD.sendKeys("4IW6i8vINHxWD@1upABBOqxG");
			LoginPage.LOGIN_BUTTON.click();
			
			System.out.println("Login Sucessfully");
			LOGGER.info("Login Sucessfully");
				
			System.out.println("Enter the Homepage Sucessfully");
			LOGGER.info("Enter the Homepage Sucessfully");
			
			}catch (Exception e) {
				e.printStackTrace();
				Thread.sleep(1000);
				System.out.println("Error in LogIn ");
				LOGGER.info(" Error in LogIn ");
				File File = ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
				File source= new File("C:\\Users\\fbdev\\OneDrive\\Desktop\\simpler\\ErrorInLogin.jpg");
				FileHandler.copy(File, source);
			}
			
			
			try {
				
			Thread.sleep(1000);
//			System.out.println(" 1 ");		
			HomePage.Videofilter.click();
			
			Thread.sleep(1000);
//			System.out.println(" 2 ");
			HomePage.DeSelectAll.click();
			
			Thread.sleep(1000);
//			System.out.println(" 3 ");
			HomePage.enable.click();
			
			Thread.sleep(1000);
//			System.out.println(" 4 ");
			HomePage.apply.click();
			
			// infinity Scroll
			Thread.sleep(1000);
//			System.out.println(" 5 ");
			Swipes.swipeUp(3,getDriver());
			
			// Refreshing
			Thread.sleep(1000);
//			System.out.println(" 6 ");
			Swipes.swipeDown(3,getDriver());
			
			Thread.sleep(1000);
//			System.out.println(" 7 ");
			HomePage.Videofilter1.click();
			
			Thread.sleep(1000);
//			System.out.println(" 8 ");
			HomePage.SelectAll.click();
			
			Thread.sleep(1000);
//			System.out.println(" 9 ");
			HomePage.apply1.click();
			

			// infinity Scroll
			Thread.sleep(1000);
//			System.out.println(" 10 ");
			Swipes.swipeUp(2,getDriver());
			
			Thread.sleep(10000);
//			System.out.println(" 11 ");
			HomePage.bookMark.click();
			
			//  screenshot
			Thread.sleep(1000);
			File File1 = ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
			File source1= new File("C:\\Users\\fbdev\\OneDrive\\Desktop\\simpler\\bookmark.jpg");
			FileHandler.copy(File1, source1);
			
			Thread.sleep(1000);
//			System.out.println(" 12 ");
			HomePage.Videofilter2.click();
			
			Thread.sleep(1000);
//			System.out.println(" 13 ");
			Swipes.swipetoclick(getDriver());
			
			Thread.sleep(1000);
//			System.out.println(" 14 ");
			tap_click.showBookmark(getDriver());
			
			Thread.sleep(1000);
//			System.out.println(" 15 ");
			HomePage.ShowBookMark.click();
			
			Thread.sleep(1000);
//			System.out.println(" 16 ");
			HomePage.removeBookMark.click();
			
			//screenshot
			Thread.sleep(1000);
			File File2 = ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
			File source2= new File("C:\\Users\\fbdev\\OneDrive\\Desktop\\simpler\\removebookmark.jpg");
			FileHandler.copy(File2, source2);
			
			Thread.sleep(1000);
//			System.out.println(" 17 ");
			HomePage.Videofilter3.click();
			
			Thread.sleep(1000);
//			System.out.println(" 18 ");
			Swipes.swipetoclick(getDriver());
			
			Thread.sleep(1000);
//			System.out.println(" 19 ");
			tap_click.showBookmark(getDriver());
			
			Thread.sleep(1000);
//			System.out.println(" 20 ");		
			HomePage.HomeSearch.click();
			
			Thread.sleep(1000);
//			System.out.println(" 21 ");		
			HomePage.HomeSearch.sendKeys("Futures"); // needs to verify
			
			Thread.sleep(1000);
			File File3 = ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
			File source3= new File("C:\\Users\\fbdev\\OneDrive\\Desktop\\simpler\\Homesearch.jpg");
			FileHandler.copy(File3, source3);
			
			Thread.sleep(1000);
//			System.out.println(" 22 ");		
			HomePage.HomeSearch.clear();
			
					
			Thread.sleep(1000);
//			System.out.println(" 23 ");
			HomePage.HomeFeed.click();
			
//			Thread.sleep(1000);  // need to work it
//			System.out.println(" 24 ");
//			HomePage.VideoPlay.click();

//			Thread.sleep(1000);
//			System.out.println(" 25 ");
//			HomePage.VideoPause.click();
				
			Thread.sleep(1000);
//			System.out.println(" 26 ");
			tap_click.nextVideo(getDriver());
				
			Thread.sleep(1000);
//			System.out.println(" 27 ");
			tap_click.nextVideo(getDriver());
			
			
			Thread.sleep(1000);
//			System.out.println(" 28 ");
			tap_click.back(getDriver());
			
			
			System.out.println("Home Page completed Sucessfully");
			LOGGER.info("Home Page completed Sucessfully");
			
			} catch (Exception e) {
			e.printStackTrace();
			Thread.sleep(1000);
			System.out.println("Error in Home ");
			LOGGER.info("Error in Home ");
			File File4 = ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
			File source4= new File("C:\\Users\\fbdev\\OneDrive\\Desktop\\simpler\\ErrorInHomePage.jpg");
			FileHandler.copy(File4, source4);
			}	

	}
	
	
	@Then("Users can able to process the AlertTab")
	public void users_can_able_to_process_the_alert_tab() throws InterruptedException, IOException {
		
		try {
			
			System.out.println("Enter the Alert Sucessfully");
			LOGGER.info("Enter the Alert Sucessfully");
			
			Thread.sleep(1000);
//			System.out.println(" 29 ");	
			tap_click.alerttab(getDriver());
			
			
			Thread.sleep(1000);
//			System.out.println(" 30 ");		
			AlertPage.AlertSearch.click();
			
			Thread.sleep(1000);
//			System.out.println(" 31 ");		
			AlertPage.AlertSearch.sendKeys("kody");
			
			Thread.sleep(1000);
			File File5 = ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
			File source5= new File("C:\\Users\\fbdev\\OneDrive\\Desktop\\simpler\\Alertsearch.jpg");
			FileHandler.copy(File5, source5);
			
			Thread.sleep(1000);
//			System.out.println(" 32 ");		
			AlertPage.AlertSearch.clear();
			
			Thread.sleep(1000);
//			System.out.println(" 33 ");
			AlertPage.AlertFilter.click();
			
			Thread.sleep(1000);
//			System.out.println(" 34 ");
			AlertPage.DeSelect.click();
			
			Thread.sleep(1000);
//			System.out.println(" 35 ");
			AlertPage.Apply.click();
			
			Thread.sleep(1000);
//			System.out.println(" 36 ");
			AlertPage.AlertFilter.click();
			
			Thread.sleep(1000);
//			System.out.println(" 37 ");
			AlertPage.oneAlertenable.click();
			
			Thread.sleep(1000);
//			System.out.println(" 38 ");
			AlertPage.Apply1.click();
			
			// infinity Scroll
			Thread.sleep(1000);
//			System.out.println(" 39 ");
			Swipes.swipeUp(3,getDriver());
					
			Thread.sleep(1000);
//			System.out.println(" 40 ");
			AlertPage.AlertFilter.click();
			
			Thread.sleep(1000);
//			System.out.println(" 41 ");
			AlertPage.ChooseAll.click();
			
			Thread.sleep(1000);
//			System.out.println(" 42 ");
			AlertPage.Apply1.click();
			
			// Refreshing
			Thread.sleep(1000);
//			System.out.println(" 43 ");
			Swipes.swipeDown(1, getDriver());
			
			Thread.sleep(10000);
//			System.out.println(" 44 ");
			AlertPage.details.click();
			
					
			Thread.sleep(1000);
//			System.out.println(" 45 ");
			AlertPage.bookMark.click();
			
			Thread.sleep(1000);
			File File6 = ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
			File source6= new File("C:\\Users\\fbdev\\OneDrive\\Desktop\\simpler\\bookmark_alert.jpg");
			FileHandler.copy(File6, source6);
			
			Thread.sleep(1000);
//			System.out.println(" 46 ");
			AlertPage.back.click();
			
			Thread.sleep(1000);
//			System.out.println(" 47 ");
			AlertPage.AlertFilter.click();
			
			Thread.sleep(1000);
//			System.out.println(" 48 ");
			Swipes.swipetoclick(getDriver());
			
			
			Thread.sleep(1000);
//			System.out.println(" 49 ");
			tap_click.back(getDriver());
			
			
			Thread.sleep(10000);
//			System.out.println(" 50 ");
			AlertPage.details.click();
			
					
			Thread.sleep(10000);
//			System.out.println(" 51 ");
			AlertPage.bookMark1.click();
			
			
			Thread.sleep(1000);
			File File7 = ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
			File source7= new File("C:\\Users\\fbdev\\OneDrive\\Desktop\\simpler\\removebookmar_alert.jpg");
			FileHandler.copy(File7, source7);
			
			
			Thread.sleep(1000);
//			System.out.println(" 52 ");
			AlertPage.back.click();
			
			
			Thread.sleep(1000);
//			System.out.println(" 53 ");
			AlertPage.AlertFilter.click();
			
			
			Thread.sleep(1000);
//			System.out.println(" 54 ");
			Swipes.swipetoclick(getDriver());
			
			
			Thread.sleep(1000);
//			System.out.println(" 55 ");
			tap_click.back(getDriver());
			
			
			
			Thread.sleep(1000);
			File File8 = ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
			File source8= new File("C:\\Users\\fbdev\\OneDrive\\Desktop\\simpler\\Alertsearch.jpg");
			FileHandler.copy(File8, source8);
			
			
			Thread.sleep(1000);
//			System.out.println(" 56 ");
			AlertPage.details.click();
			
			
			Thread.sleep(1000);
//			System.out.println(" 57 ");
			AlertPage.back.click();
			
			
			Thread.sleep(1000);
			File File9 = ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
			File source9= new File("C:\\Users\\fbdev\\OneDrive\\Desktop\\simpler\\Alertsearch1.jpg");
			FileHandler.copy(File9, source9);
			 
			
			// infinity Scroll
			Thread.sleep(1000);
//			System.out.println(" 58 ");
			Swipes.swipeUp(7, getDriver());
			
			
			System.out.println("exit the Alert Sucessfully");
			LOGGER.info("exit the Alert Sucessfully");
		}
		catch (Exception e) {
			e.printStackTrace();
			Thread.sleep(1000);
			System.out.println("Error in AlertTab ");
			LOGGER.info("Error in AlertTab ");
			File File10 = ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
			File source10= new File("C:\\Users\\fbdev\\OneDrive\\Desktop\\simpler\\ErrorIn_AlertTab.jpg");
			FileHandler.copy(File10, source10);
		}
 
	}
	@Then("Users can able to process the TradingRoom")
	public void users_can_able_to_process_the_trading_room() throws InterruptedException, IOException {
		
		try {
			
		System.out.println("Enter the Tradingroom Sucessfully");
		LOGGER.info("enter the Tradingroom Sucessfully");
		
		
		Thread.sleep(1000);
		System.out.println(" 59 ");
		TradingPage.TradingRoomentry.click();
		
		
		Thread.sleep(1000);
		System.out.println(" 60 ");
		tap_click.options(getDriver());
		
		
		Thread.sleep(1000);
		System.out.println(" 61 ");
		TradingPage.RoomEntering.click();
		
		
		Thread.sleep(1000);
		System.out.println(" 62 ");
		TradingPage.ALERT_BUTTON.click();
		
		
		Thread.sleep(1000);
		System.out.println(" 63 ");
//		TradingPage.Alert_search.click();
		tap_click.alert_search(getDriver());
		
		
		Thread.sleep(1000);
		System.out.println(" 64 ");
		TradingPage.search_Alert.sendKeys("Trendy");
		
		Thread.sleep(1000);
		File File11 = ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
		File source11= new File("C:\\Users\\fbdev\\OneDrive\\Desktop\\simpler\\Trading_search.jpg");
		FileHandler.copy(File11, source11);
		
		Thread.sleep(1000);
		System.out.println(" 65 ");
		TradingPage.Alerts_click.click();
		
		Thread.sleep(1000);
		System.out.println(" 66 ");
		tap_click.alert_copy(getDriver());
		
		Thread.sleep(1000);
		System.out.println(" 67 ");
		tap_click.alert_back(getDriver());
		
		
		Thread.sleep(1000);
		System.out.println(" 68 ");
		TradingPage.CHAT_BUTTON.click();
		
		
		Thread.sleep(1000);
		System.out.println(" 69 ");
		TradingPage.USERS_BUTTON.click();
		
		
		Thread.sleep(10000);
		System.out.println(" 70 ");
//		TradingPage.User_Search.click();
		tap_click.user_Search(getDriver());

		
		Thread.sleep(10000);
		System.out.println(" 71 ");
		TradingPage.User_Search1.sendKeys("Mandy");
		
		
		Thread.sleep(1000);
		File File12 = ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
		File source12= new File("C:\\Users\\fbdev\\OneDrive\\Desktop\\simpler\\Trading_Usersearch.jpg");
		FileHandler.copy(File12, source12);

		Thread.sleep(1000);
		System.out.println(" 72 ");
		TradingPage.User_Profile.click();
		
		Thread.sleep(1000);
		System.out.println(" 73 ");
		TradingPage.User_ProfileClose.click();
		
	
		Thread.sleep(1000);
		System.out.println(" 74 ");
		TradingPage.User_Search1.clear();
		
		
		Thread.sleep(1000);
		System.out.println(" 75 ");
		TradingPage.FILES_BUTTON.click();

		
//		Thread.sleep(10000);
		System.out.println(" 76 ");
//		TradingPage.ViewFiles.click();

		
//		Thread.sleep(10000);
		System.out.println(" 77 ");
//		TradingPage.DOWNLOAD_BUTTON.click();
		
		
		Thread.sleep(1000);
		System.out.println(" 78 ");
		TradingPage.SCHEDULE_BUTTON.click();
		
		File File13 = ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
		File source13= new File("C:\\Users\\fbdev\\OneDrive\\Desktop\\simpler\\Trading_Schedule.jpg");
		FileHandler.copy(File13, source13);
		
		
		Thread.sleep(1000);
		System.out.println(" 79 ");
		TradingPage.NextSchedule.click();
		
		File File14 = ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
		File source14= new File("C:\\Users\\fbdev\\OneDrive\\Desktop\\simpler\\Trading_Schedule1.jpg");
		FileHandler.copy(File14, source14);
		
		
		Thread.sleep(1000);
		System.out.println(" 80 ");
		TradingPage.SettingsButton.click();
		
		
		Thread.sleep(1000);
		System.out.println(" 81 ");
//		AlertPage.pushNotification.click();
		tap_click.pushn_enable(getDriver());
		
		
		Thread.sleep(1000);
		System.out.println(" 82 ");
//		AlertPage.Disable.click();
		tap_click.push_enable(getDriver());
		
		
		Thread.sleep(1000);
		System.out.println(" 83 ");
//		AlertPage.Disable.click();
		tap_click.push_enable(getDriver());
		
		
		Thread.sleep(1000);
		System.out.println(" 84 ");
		TradingPage.Back.click();
		
		
		Thread.sleep(1000);
		System.out.println(" 85 ");
		TradingPage.confirm.click();
		
		
		System.out.println("exit the Tradingroom Sucessfully");
		LOGGER.info("exit the Tradingroom Sucessfully");
		
		}
		catch (Exception e) {
			e.printStackTrace();
			Thread.sleep(1000);
			System.out.println("Error in Tradingroom ");
			LOGGER.info("Error in Tradingroom ");
			File File15 = ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
			File source15= new File("C:\\Users\\fbdev\\OneDrive\\Desktop\\simpler\\ErrorIn_Trading.jpg");
			FileHandler.copy(File15, source15);
		}
	}
	
	
	@Then("Users can able to process the ClassesTab")
	public void users_can_able_to_process_the_classes_tab() throws InterruptedException, IOException {
		try {
			
			System.out.println("Enter the Classes Sucessfully");
			LOGGER.info("enter the Classes Sucessfully");
			
			
			Thread.sleep(1000);
			System.out.println(" 86 ");
			ClassPage.ClassesEntry.click();
			
			
			Thread.sleep(1000);
			System.out.println(" 87 ");
			ClassPage.internalUseOnly.click();
			
			
			Thread.sleep(1000);
			System.out.println(" 88 ");
			ClassPage.RoomEntering.click();
			
			
			Thread.sleep(1000);
			System.out.println(" 89 ");
			ClassPage.ALERT_BUTTON.click();
			
			
			Thread.sleep(10000);
			System.out.println(" 90 ");
			ClassPage.Class_search.click();


			Thread.sleep(10000);
			System.out.println(" 91 ");
			ClassPage.Class_searchclick.sendKeys("jiiva");
			
			
			Thread.sleep(1000);
			File File16 = ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
			File source16= new File("C:\\Users\\fbdev\\OneDrive\\Desktop\\simpler\\Alert_Alertsearch.jpg");
			FileHandler.copy(File16, source16);
			
			Thread.sleep(1000);
			System.out.println(" 92 ");
			ClassPage.Class_Profile.click();
			
			
			Thread.sleep(1000);
			System.out.println(" 66 ");
			tap_click.alert_copy(getDriver());
			
			
			
			Thread.sleep(1000);
			System.out.println(" 93 ");
//			ClassPage.Class_ProfileClose.click();
			tap_click.Alert_back(getDriver());
			
		
			Thread.sleep(1000);
			System.out.println(" 94 ");
			ClassPage.Class_searchclick.clear();
			
			
			Thread.sleep(1000);
			System.out.println(" 95 ");
			ClassPage.CHAT_BUTTON.click();
			
			
			Thread.sleep(1000);
			System.out.println(" 96 ");
			ClassPage.USERS_BUTTON.click();
			
			
			Thread.sleep(1000);
			System.out.println(" 97 ");
			ClassPage.FILES_BUTTON.click();
			
			Thread.sleep(1000);
//			System.out.println(" 98 ");
//			ClassPage.ViewFiles.click();
			
			Thread.sleep(1000);
			System.out.println(" 99 ");
//			ClassPage.DOWNLOAD_BUTTON.click();
			
			
			Thread.sleep(1000);
			System.out.println(" 100 ");
			ClassPage.SCHEDULE_BUTTON.click();
			
			
			Thread.sleep(1000);
			System.out.println(" 101 ");
//			ClassPage. NextSchedule.click();
			
			
			Thread.sleep(1000);
			System.out.println(" 102 ");
			ClassPage.SettingsButton.click();
			
			
			Thread.sleep(1000);
			System.out.println(" 103 ");
//			ClassPage.pushNotification.click();
			tap_click.pushn_enable(getDriver());
			
			
			Thread.sleep(1000);
			System.out.println(" 104 ");
//			ClassPage.Disable.click();
			tap_click.push_enable(getDriver());
			
			
			Thread.sleep(1000);
			System.out.println(" 105 ");
//			ClassPage.Disable.click();
			tap_click.push_enable(getDriver());
			
			
			Thread.sleep(1000);
			System.out.println(" 106 ");
			TradingPage.Back.click();
			
			
			Thread.sleep(1000);
			System.out.println(" 107 ");
			TradingPage.confirm.click();
			
			
			System.out.println("Exit the Classes Sucessfully");
			LOGGER.info("Exit the Classes Sucessfully");

	}catch (Exception e) {
		e.printStackTrace();
		Thread.sleep(1000);
		System.out.println("Error in ClassTab ");
		LOGGER.info("Error in ClassTab ");
		File File15 = ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
		File source15= new File("C:\\Users\\fbdev\\OneDrive\\Desktop\\simpler\\ErrorIn_ClassTab.jpg");
		FileHandler.copy(File15, source15);
	}
	}
		
		
	@Then("User can able to process the MenuPage and Logout the Applications")
	public void user_can_able_to_process_the_menu_page_and_logout_the_applications() throws InterruptedException, IOException {
		
		try {
		System.out.println("Enter the Menu Sucessfully");
		LOGGER.info("enter the Menu Sucessfully");
		
		Thread.sleep(1000);
		System.out.println(" 108 ");
		ClassPage.MenuClick.click();
		
		
//		Thread.sleep(1000);
//		System.out.println(" 109 ");
//		ClassPage.Privacy.click();

		
//		Thread.sleep(1000);
//		System.out.println(" 110 ");
//		ClassPage.Help.click();

		
//		Thread.sleep(1000);
//		System.out.println(" 111 ");
//		ClassPage.Account.click();
		
		
		Thread.sleep(1000);
		System.out.println(" 112 ");
		ClassPage.PushNotificatiosn.click();
		
		
		Thread.sleep(1000);
		System.out.println(" 113 ");
		ClassPage.DisableNotifications.click();
		
		Thread.sleep(1000);
		File File16 = ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
		File source16= new File("C:\\Users\\fbdev\\OneDrive\\Desktop\\simpler\\Menu_DisNotification.jpg");
		FileHandler.copy(File16, source16);
		
		
		Thread.sleep(1000);
		System.out.println(" 114 ");
		ClassPage.EnableNotifications.click();
		
		Thread.sleep(1000);
		File File17 = ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
		File source17= new File("C:\\Users\\fbdev\\OneDrive\\Desktop\\simpler\\Menu_EnaNotification.jpg");
		FileHandler.copy(File17, source17);
		
		
		Thread.sleep(1000);
		System.out.println(" 115 ");
		ClassPage.BackMenu.click();
		
		
		System.out.println("Exit the Menu Sucessfully");
		LOGGER.info("Exit the Menu Sucessfully");
		
		} catch (Exception e) {
			e.printStackTrace();
			Thread.sleep(1000);
			System.out.println("Error in ALert or Menu ");
			LOGGER.info("Error in Alert or Menu ");
			File File18 = ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
			File source18= new File("C:\\Users\\fbdev\\OneDrive\\Desktop\\simpler\\ErrorIn_menu.jpg");
			FileHandler.copy(File18, source18);
			}
		
		try {
			Thread.sleep(1000);
			System.out.println(" 116 ");
			MenuPage.LOGOUT_BUTTON.click();
			
			
			Thread.sleep(1000);
			System.out.println(" 117 ");
			MenuPage.CONFIRM_BUTTON.click();
			
			System.out.println("Logout Sucessfully");
			LOGGER.info("Logout Sucessfully");
			
		}catch (Exception e) {
				e.printStackTrace();
				Thread.sleep(1000);
				System.out.println("Error in Logout ");
				LOGGER.info("Error in Logout ");
				File File19 = ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
				File source19= new File("C:\\Users\\fbdev\\OneDrive\\Desktop\\simpler\\ErrorIn_Logout.jpg");
				FileHandler.copy(File19, source19);
			}
		
	}

}


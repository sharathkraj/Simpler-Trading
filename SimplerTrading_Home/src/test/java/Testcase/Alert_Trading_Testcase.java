package Testcase;

import java.io.File;
import java.io.IOException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import PageObject.AlertPage;
import PageObject.LoginPage;
import PageObject.TradingRO;
import Scroll.Swipes;
import Scroll.tap_click;
import Webdriver.driverManger;

public class Alert_Trading_Testcase extends driverManger {
	
	
private static final Logger LOGGER = LogManager.getLogger(AlertPage.class);

	
	@Test
	public void Alert_Trading() throws InterruptedException, IOException {
		
		LoginPage.USERNAME.sendKeys("roomtest1@simplertrading.com");
		LoginPage.PASSWORD.sendKeys("4IW6i8vINHxWD@1upABBOqxG");
		LoginPage.LOGIN_BUTTON.click();
		
		
		
		System.out.println("Login Sucessfully");
		LOGGER.info("Login Sucessfully");
		
		
		
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

try {
	
	System.out.println("Enter the Tradingroom Sucessfully");
	LOGGER.info("enter the Tradingroom Sucessfully");
	
	
	Thread.sleep(1000);
	System.out.println(" 59 ");
	TradingRO.TradingRoomentry.click();
	
	
	Thread.sleep(1000);
	System.out.println(" 60 ");
	tap_click.options(getDriver());
	
	
	Thread.sleep(1000);
	System.out.println(" 61 ");
	TradingRO.RoomEntering.click();
	
	
	Thread.sleep(1000);
	System.out.println(" 62 ");
	TradingRO.ALERT_BUTTON.click();
	
	
	Thread.sleep(1000);
	System.out.println(" 63 ");
//	TradingPage.Alert_search.click();
	tap_click.alert_search(getDriver());
	
	
	Thread.sleep(1000);
	System.out.println(" 64 ");
	TradingRO.search_Alert.sendKeys("Trendy");
	
	Thread.sleep(1000);
	File File11 = ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
	File source11= new File("C:\\Users\\fbdev\\OneDrive\\Desktop\\simpler\\Trading_search.jpg");
	FileHandler.copy(File11, source11);
	
	Thread.sleep(1000);
	System.out.println(" 65 ");
	TradingRO.Alerts_click.click();
	
	Thread.sleep(1000);
	System.out.println(" 66 ");
	tap_click.alert_copy(getDriver());
	
	Thread.sleep(1000);
	System.out.println(" 67 ");
	tap_click.alert_back(getDriver());
	
	
	Thread.sleep(1000);
	System.out.println(" 68 ");
	TradingRO.CHAT_BUTTON.click();
	
	
	Thread.sleep(1000);
	System.out.println(" 69 ");
	TradingRO.USERS_BUTTON.click();
	
	
	Thread.sleep(10000);
	System.out.println(" 70 ");
//	TradingPage.User_Search.click();
	tap_click.user_Search(getDriver());

	
	Thread.sleep(10000);
	System.out.println(" 71 ");
	TradingRO.User_Search1.sendKeys("Mandy");
	
	
	Thread.sleep(1000);
	File File12 = ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
	File source12= new File("C:\\Users\\fbdev\\OneDrive\\Desktop\\simpler\\Trading_Usersearch.jpg");
	FileHandler.copy(File12, source12);

	Thread.sleep(1000);
	System.out.println(" 72 ");
	TradingRO.User_Profile.click();
	
	Thread.sleep(1000);
	System.out.println(" 73 ");
	TradingRO.User_ProfileClose.click();
	

	Thread.sleep(1000);
	System.out.println(" 74 ");
	TradingRO.User_Search1.clear();
	
	
	Thread.sleep(1000);
	System.out.println(" 75 ");
	TradingRO.FILES_BUTTON.click();

	
//	Thread.sleep(10000);
	System.out.println(" 76 ");
//	TradingPage.ViewFiles.click();

	
//	Thread.sleep(10000);
	System.out.println(" 77 ");
//	TradingPage.DOWNLOAD_BUTTON.click();
	
	
	Thread.sleep(1000);
	System.out.println(" 78 ");
	TradingRO.SCHEDULE_BUTTON.click();
	
	File File13 = ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
	File source13= new File("C:\\Users\\fbdev\\OneDrive\\Desktop\\simpler\\Trading_Schedule.jpg");
	FileHandler.copy(File13, source13);
	
	
	Thread.sleep(1000);
	System.out.println(" 79 ");
	TradingRO.NextSchedule.click();
	
	File File14 = ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
	File source14= new File("C:\\Users\\fbdev\\OneDrive\\Desktop\\simpler\\Trading_Schedule1.jpg");
	FileHandler.copy(File14, source14);
	
	
	Thread.sleep(1000);
	System.out.println(" 80 ");
	TradingRO.SettingsButton.click();
	
	
	Thread.sleep(1000);
	System.out.println(" 81 ");
//	AlertPage.pushNotification.click();
	tap_click.pushn_enable(getDriver());
	
	
	Thread.sleep(1000);
	System.out.println(" 82 ");
//	AlertPage.Disable.click();
	tap_click.push_enable(getDriver());
	
	
	Thread.sleep(1000);
	System.out.println(" 83 ");
//	AlertPage.Disable.click();
	tap_click.push_enable(getDriver());
	
	
	Thread.sleep(1000);
	System.out.println(" 84 ");
	TradingRO.Back.click();
	
	
	Thread.sleep(1000);
	System.out.println(" 85 ");
	TradingRO.confirm.click();
	
	
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
	
}


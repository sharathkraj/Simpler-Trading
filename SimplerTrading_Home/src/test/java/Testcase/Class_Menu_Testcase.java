package Testcase;

import java.io.File;
import java.io.IOException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import PageObject.ClassPage;
import PageObject.LoginPage;
import PageObject.MenuPage;
import PageObject.TradingRO;
import Scroll.tap_click;
import Webdriver.driverManger;

public class Class_Menu_Testcase extends driverManger {
	
private static final Logger LOGGER = LogManager.getLogger(ClassPage.class);
	
	@Test
	public void Class_Menu() throws InterruptedException, IOException {
		
		LoginPage.USERNAME.sendKeys("roomtest1@simplertrading.com");
		LoginPage.PASSWORD.sendKeys("4IW6i8vINHxWD@1upABBOqxG");
		LoginPage.LOGIN_BUTTON.click();
		
		
		
		System.out.println("Login Sucessfully");
		LOGGER.info("Login Sucessfully");
		
		
		
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
			TradingRO.Back.click();
			
			
			Thread.sleep(1000);
			System.out.println(" 107 ");
			TradingRO.confirm.click();
			
			
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

try {
	System.out.println("Enter the Menu Sucessfully");
	LOGGER.info("enter the Menu Sucessfully");
	
	Thread.sleep(1000);
	System.out.println(" 108 ");
	MenuPage.MenuClick.click();
	
	
//	Thread.sleep(1000);
//	System.out.println(" 109 ");
//	MenuPage.Privacy.click();

	
//	Thread.sleep(1000);
//	System.out.println(" 110 ");
//	MenuPage.Help.click();

	
//	Thread.sleep(1000);
//	System.out.println(" 111 ");
//	MenuPage.Account.click();
	
	
	Thread.sleep(1000);
	System.out.println(" 112 ");
	MenuPage.PushNotificatiosn.click();
	
	
	Thread.sleep(1000);
	System.out.println(" 113 ");
	MenuPage.DisableNotifications.click();
	
	Thread.sleep(1000);
	File File16 = ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
	File source16= new File("C:\\Users\\fbdev\\OneDrive\\Desktop\\simpler\\Menu_DisNotification.jpg");
	FileHandler.copy(File16, source16);
	
	
	Thread.sleep(1000);
	System.out.println(" 114 ");
	MenuPage.EnableNotifications.click();
	
	Thread.sleep(1000);
	File File17 = ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
	File source17= new File("C:\\Users\\fbdev\\OneDrive\\Desktop\\simpler\\Menu_EnaNotification.jpg");
	FileHandler.copy(File17, source17);
	
	
	Thread.sleep(1000);
	System.out.println(" 115 ");
	MenuPage.BackMenu.click();
	
	
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

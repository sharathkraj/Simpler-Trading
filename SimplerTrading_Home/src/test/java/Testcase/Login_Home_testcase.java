package Testcase;

import java.io.File;
import java.io.IOException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import PageObject.HomePage;
import PageObject.LoginPage;
import Scroll.Swipes;
import Scroll.tap_click;
import Webdriver.driverManger;
import screenShot.screen_shot;

public class Login_Home_testcase extends driverManger {
	
	
	private static final Logger LOGGER = LogManager.getLogger(LoginPage.class);
	
	@Test
	public void Login_Home() throws InterruptedException, IOException {
		
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
}

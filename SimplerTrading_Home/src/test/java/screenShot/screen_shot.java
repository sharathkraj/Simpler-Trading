package screenShot;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import Webdriver.driverManger;

public class screen_shot extends driverManger {
	
	@Test
	public void screen_shots() throws IOException, AWTException {
//		WebDriver driver;
		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\fbdev\\Downloads\\chromedriver_win32\\chromedriver.exe");
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--remote-allow-origins=*");
//		 driver = new ChromeDriver(options);
//		
		 getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	     
	     //take a screenshot
	     TakesScreenshot screenshot = (TakesScreenshot)getDriver();
	     File soureFile=screenshot.getScreenshotAs(OutputType.FILE);
	     File destinationFile=new File("C:\\Users\\fbdev\\OneDrive\\Desktop\\sample123423342.png");
	     FileHandler.copy(soureFile, destinationFile);

	}

}

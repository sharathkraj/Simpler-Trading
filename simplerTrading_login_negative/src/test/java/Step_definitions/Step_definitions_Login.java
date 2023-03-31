package Step_definitions;

import java.io.File;
import java.io.IOException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.asserts.SoftAssert;

import PageObject.LoginPage;
import Webdriver.driverManger;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Step_definitions_Login extends driverManger {
	
	private static final Logger LOGGER = LogManager.getLogger(Step_definitions_Login.class);
	
	@Given("Users enter invalid {string} and  invalid {string}")
	public void users_enters_invalid_and_invalid(String userName, String PassWord ) throws InterruptedException, IOException {
		
		try {
			System.out.println("Entering the Login Page...");
			LoginPage.USERNAME.sendKeys(userName);
			LoginPage.PASSWORD.sendKeys(PassWord);
			LoginPage.LOGIN_BUTTON.click();
			
//			String s = "Login Error";
//			 Thread.sleep(10000);
//		     WebElement loginError = getDriver().findElement(By.xpath("//android.widget.TextView[@text='Login Error')]"));
//		     System.out.println("Enter the Valid input...");
//		     SoftAssert soft = new SoftAssert();
//		     soft.assertEquals( s, loginError);
		     
		     
			Thread.sleep(1000);
			File File = ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
			File source= new File("C:\\Users\\fbdev\\OneDrive\\Desktop\\simpler\\Simp\\Login.jpg");
			FileHandler.copy(File, source);
		
			System.out.println("Login Sucessfully");
			LOGGER.info("Login Sucessfully");
			
			}catch (Exception e) {
				e.printStackTrace();
				Thread.sleep(10000);
				System.out.println("Error in LogIn ");
				LOGGER.info(" Error in LogIn ");
				File File = ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
				File source= new File("C:\\Users\\fbdev\\OneDrive\\Desktop\\simpler\\Simp\\ErrorInLogin.jpg");
				FileHandler.copy(File, source);
			}
	}
	@Then("Users can able to Logout the Applications")
	public void users_can_able_to_logout_the_applications() throws InterruptedException, IOException {
		try {
			
			System.out.println("Entering the Logout Page Sucessfully");
			LOGGER.info("Entering the Logout Page Sucessfully");
			
			Thread.sleep(1000);
			System.out.println(" 1 ");
			LoginPage.MenuClick.click();
			
			Thread.sleep(1000);
			System.out.println(" 8 ");
			LoginPage.LOGOUT_BUTTON.click();
			
			
			Thread.sleep(1000);
			System.out.println(" 118 ");
			LoginPage.CONFIRM_BUTTON.click();
			
			System.out.println("Logout Sucessfully");
			LOGGER.info("Logout Sucessfully");
					
			
			} catch (Exception e) {
				e.printStackTrace();
				Thread.sleep(1000);
				System.out.println("Error in Menu Page");
				LOGGER.info("Error in Menu page ");
				File File = ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
				File source = new File("C:\\Users\\fbdev\\OneDrive\\Desktop\\simpler\\ErrorIn_menu.jpg");
				FileHandler.copy(File , source);
				}
		
	
}
}
package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
//	private static LoginPage LoginInstance;
//	
//	private  LoginPage() {
//		
//	}
//	
//	public static LoginPage getInstance() {
//		
//		if(LoginInstance== null) {
//			LoginInstance = new LoginPage();
//		}
//		return LoginInstance;
//	}
	
	
	// Login and Home pages //
	 @FindBy(xpath = "//android.widget.EditText[@password='false']")
	 public static  WebElement USERNAME;
		
	 @FindBy(xpath = "//android.widget.EditText[@password='true']")
	 public static  WebElement PASSWORD;
	    

	 @FindBy(xpath ="//android.widget.Button[@text='LOG IN']")
	 public static  WebElement LOGIN_BUTTON;
	   
}





//	 public void enterUserName(String UserName) {
//		   
//		   USERNAME.sendKeys(UserName);
//	   }
//	   
//	 public void enterPassWord(String PassWord) {
//		   
//		   PASSWORD.sendKeys(PassWord);
//	   }
//	 
//	 public void ClickLogin() {
//		   
//		   LOGIN_BUTTON.click();
//	 }
	
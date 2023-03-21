package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	
	// Login and Home pages //
	 @FindBy(xpath = "//android.widget.EditText[@password='false']")
	 public static  WebElement USERNAME;
		
	 @FindBy(xpath = "//android.widget.EditText[@password='true']")
	 public static  WebElement PASSWORD;
	    

	 @FindBy(xpath ="//android.widget.Button[@text='LOG IN']")
	 public static  WebElement LOGIN_BUTTON;
		 

}


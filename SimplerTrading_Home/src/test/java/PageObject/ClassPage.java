package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ClassPage {
	
	

	@FindBy(xpath = "//android.widget.Image[@text='school outline']")
	public static  WebElement ClassesEntry;
	   
	@FindBy(xpath = "//android.view.View[@bounds='[281,680][990,863]']")
	public static  WebElement internalUseOnly;
	   
	@FindBy(xpath = "//android.widget.Button[@text='ENTER ROOM']")
	public static  WebElement RoomEntering;
	
	
	@FindBy(xpath ="//android.widget.EditText[@checkable='false']")
	public static WebElement Class_search;
	
	@FindBy(xpath ="//android.widget.Button[@text='search sharp']")
	public static WebElement Class_searchclick;
	
	
	 
	  
	@FindBy(xpath = "//android.widget.Image[@bounds='[202,2258][267,2331]']")
	public static  WebElement ALERT_BUTTON;

	
	@FindBy(xpath = "//android.widget.Image[@text='search sharp']")
	public static  WebElement Alert_search;
	
	@FindBy(xpath = "//android.widget.EditText[@bounds='[168,157][916,278]']")
	public static  WebElement search_Alert;
	
	
	@FindBy(xpath = "//android.widget.Image[@text='search sharp']")
	public static  WebElement Class_Profile;
	
	@FindBy(xpath = "//android.widget.EditText[@bounds='[168,157][916,278]']")
	public static  WebElement Class_ProfileClose;
	
	
	
	@FindBy(xpath = "//android.widget.Image[@bounds='[337,2258][405,2331]']")
	public static  WebElement CHAT_BUTTON;
	 
	@FindBy(xpath = "//android.widget.Image[@bounds='[475,2258][540,2331]']")
	public static  WebElement USERS_BUTTON;
	 
	@FindBy(xpath = "//android.view.View[@bounds='[573,2230][711,2332]']")
	public static  WebElement FILES_BUTTON;
	 
	 
//	@FindBy(xpath = "//android.widget.TextView[@text='RH-auto-webinar-welcome-mat-REPLAY.jpg']")
//	public static  WebElement ViewFiles;
//	 
//	@FindBy(xpath = "//android.widget.Image[@bounds='[919,455][990,525]']")
//	public static  WebElement DOWNLOAD_BUTTON;
	 
	@FindBy(xpath = "//android.view.View[@bounds='[708,2230][905,2332]']")
	public static  WebElement SCHEDULE_BUTTON;
	 
	 
	@FindBy(xpath = "//android.widget.Image[@bounds='[953,2258][1029,2331]']")
	public static  WebElement SettingsButton;
	 
	@FindBy(xpath = "//android.widget.TextView[@bounds='[855,514][914,573]']")
	public static  WebElement pushNotification_enable;
	 
	@FindBy(xpath = "//android.view.Viewn[@bounds='[818,748][990,857]']")
	public static  WebElement Disable;
	 
	@FindBy(xpath = "//android.widget.Button[@bounds='[14,171][149,264]']")
	public static  WebElement Back;
	
	@FindBy(xpath = "//android.widget.Button[@text='OK']")
	public static  WebElement confirm;
	
	
	
}

package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ClassPage {
	
	
//	private static ClassPage ClassInstance;
//	
//	
//	private  ClassPage() {
//		
//	}
//	
//	public static ClassPage getInstance() {
//		
//		if(ClassInstance== null) {
//			ClassInstance = new ClassPage();
//		}
//		return ClassInstance;
//	}
	
	
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
	
	// Menu Page //
	
	
	@FindBy(xpath = "//android.widget.Image[@text='menu outline']")
	public static  WebElement MenuClick;
	
	@FindBy(xpath = "//android.widget.Button[@text='arrow redo']")
	public static  WebElement Privacy;
	
	@FindBy(xpath = "//android.widget.Button[@bounds='[900,624][987,711]']")
	public static  WebElement Help;
	
	@FindBy(xpath = "//android.widget.Button[@bounds='[900,787][987,874]']")
	public static  WebElement Account;
	
	@FindBy(xpath = "//android.widget.Image[@text='chevron forward sharp']")
	public static  WebElement PushNotificatiosn;
	
	@FindBy(xpath = "//android.widget.TextView[@bounds='[930,520][990,579]']")
	public static  WebElement DisableNotifications;
	
	@FindBy(xpath = "//android.view.View[@bounds='[885,528][990,570]']")
	public static  WebElement EnableNotifications;
	
	
	@FindBy(xpath = "//android.widget.Button[@text='back']")
	public static  WebElement BackMenu;
	
	@FindBy(xpath = "//android.widget.Button[@text='Log Out']")
	public static  WebElement LOGOUT_BUTTON;
	 
	@FindBy(xpath = "//android.widget.Button[@text='OK']")
	public static  WebElement CONFIRM_BUTTON;
	
	

	 
//	 public void enterClassRoom() {
//		   
//		 ClassesEntry.click();
//	 }
//	 
//	 
//	 public void clickClassRoom() {
//		   
//		 internalUseOnly.click();
//	 }
//	 
//	 
//	 
//	 public void enterRoom() {
//		   
//		 RoomEntering.click();
//	 }
//	 
//	 
//	 public void ClickAlertbutton() {
//		   
//		 ALERT_BUTTON.click();
//	 }
//	 
//	 public void ClickAlertSearch() {
//		   
//		 Alert_search.click();
//	 }
//	 
//	 public void SearchAlertbutton() {
//		   
//		 search_Alert.click();
//	 }
//	 
//	 
//	 public void ClickChatButton() {
//		   
//		 CHAT_BUTTON.click();
//	 }
//	 
//	 
//	 
//	 public void ClickUserButton() {
//		   
//		 USERS_BUTTON.click();
//	 }
//	 
//	 
//	 
//	 public void ClickFilesButton() {
//		   
//		 FILES_BUTTON.click();
//	 }
//	 
////	 public void ViewFiles() {
////		   
////		 ViewFiles.click();
////	 }
////	 
////	 public void ClickDownloadButton() {
////		   
////		 DOWNLOAD_BUTTON.click();
////	 }
//	 
//	 public void ClickScheduleButton() {
//		   
//		 SCHEDULE_BUTTON.click();
//	 }
//	 
////	 public void ClickNextSchedule() {
////		   
////		 NextSchedule.click();
////	 }
//	 
//	 
//	 public void ClickSettingButton() {
//		   
//		 SettingsButton.click();
//	 }
//	 
//	 
//	 
//	 public void ClickPushButton() {
//		   
//		 pushNotification_enable.click();
//		 Disable.click();
//	 }
//	 
//	 
//	 
//	 
//	 public void ClickExitButton() {
//		   
//		 Back.click();
//		 confirm.click();
//	 }
//	 
//      Menu page // 
	

//	 public void ClickMenubutton() {
//	   
//		 MenuClick.click();
//  }
//	 
//	 public void ClickPrivacy() {
//		   
//		 Privacy.click();
//}
//	 
//	 public void ClickHelp() {
//		   
//		 Help.click();
//}
//	 
//	 public void ClikAccount() {
//		   
//		 Account.click();
//}
//	 
//	 public void ClickPush() {
//		   
//		 PushNotificatiosn.click();
//		 DisableNotifications.click();
//		 EnableNotifications.click();
//		 BackMenu.click();
//}
//	 
//	
//public void ClickLogout() {
//  
//LOGOUT_BUTTON.click();
//}
//
//public void ClickConfirm() {
//  
//CONFIRM_BUTTON.click();
//}

}

package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TradingPage {
		
//		private static TradingPage TradingInstance;
	
//		private  TradingPage() {
//			
//		}
	//	
//		public static TradingPage getInstance() {
//			
//			if(TradingInstance== null) {
//				TradingInstance = new TradingPage();
//			}
//			return TradingInstance;
//		}
		
		// Trading Room //
		   
		   
		@FindBy(xpath = "//android.widget.Image[@text='bar chart outline']")
		public static  WebElement TradingRoomentry;
		   
		 
		@FindBy(xpath = "//android.widget.Button[@text='ENTER ROOM']")
		public static  WebElement RoomEntering;
		 
		  
		@FindBy(xpath = "//android.widget.Image[@bounds='[202,2258][267,2331]']")
		public static  WebElement ALERT_BUTTON;
		 
		@FindBy(xpath = "//android.widget.Image[@text='search sharp']")
		public static  WebElement Alert_search;
		 
//		@FindBy(xpath = "/html/body/div[1]/div/div/div/div[2]/div[2]/div/div[2]/div/div/div/div[1]/div/div[2]/div/div/div[3]/div/div/div/div[24]/span[3]/span/span/b")
//		public static  WebElement search_Alert;
		
//		@FindBy(xpath = "//android.widget.TextView[@clickable ='true']")
//		public static  WebElement search_Alert;
		
		@FindBy(xpath = "//android.widget.EditText[@bounds='[168,157][916,278]']")
		public static  WebElement search_Alert;

		@FindBy(xpath = "//android.view.View[@enabled='true']")
		public static  WebElement Alerts_click;
		
		@FindBy(xpath = "//android.widget.Image[@bounds='[337,2258][405,2331]']")
		public static  WebElement CHAT_BUTTON;
		 
		@FindBy(xpath = "//android.widget.Image[@bounds='[475,2258][540,2331]']")
		public static  WebElement USERS_BUTTON;
		 
		@FindBy(xpath = "//android.widget.Image[@text='search sharp']")
		public static  WebElement User_Search;
		
		@FindBy(xpath = "//android.widget.EditText[@bounds='[168,157][916,278]']")
		public static  WebElement User_Search1;
		
		@FindBy(xpath = "//android.view.View[@bounds='[272,388][990,579]']")
		public static  WebElement User_Profile;
		
		@FindBy(xpath = "//android.widget.Button[@text='close circle outline']")
		public static  WebElement User_ProfileClose;
		
				
		@FindBy(xpath = "//android.view.View[@bounds='[573,2230][711,2332]']")
		public static  WebElement FILES_BUTTON;
		 
		 
		@FindBy(xpath = "//android.widget.TextView[@bounds='[295,410][880,511]']")
		public static  WebElement ViewFiles;
		 
		@FindBy(xpath = "//android.widget.Image[@bounds='[919,455][990,525]']")
		public static  WebElement DOWNLOAD_BUTTON;
		 
		@FindBy(xpath = "//android.view.View[@bounds='[708,2230][905,2332]']")
		public static  WebElement SCHEDULE_BUTTON;
		 
		@FindBy(xpath = "//android.widget.Image[@text='chevron forward sharp']")
		public static  WebElement NextSchedule;
		 
		@FindBy(xpath = "//android.widget.Image[@bounds='[953,2258][1029,2331]']")
		public static  WebElement SettingsButton;
		 
		@FindBy(xpath = "//android.widget.TextView[@bounds='[900,514][959,573]']")
		public static  WebElement pushNotification;
		 
//		@FindBy(xpath = "//android.view.View[@bounds='[855,523][959,565]]']")
//		public static  WebElement Disable;
		
		@FindBy(xpath = "//android.widget.Button[@bounds='[14,171][149,264]']")
		public static  WebElement Back;
		 
		@FindBy(xpath = "//android.widget.Button[@bounds='[770,1307][891,1425]']")
		public static  WebElement confirm;
		 
}
		 // Trading room
		 
		 
//		 public void enterTradingroom() {
//			   
//			 TradingRoomentry.click();
//		 }
//		 
//		 
//		 public void clickOptions() {
//			   
//			 Options.click();
//		 }
//		 
//		 
//		 
//		 public void enterRoom() {
//			   
//			 RoomEntering.click();
//		 }
//		 
//		 
//		 public void ClickAlertbutton() {
//			   
//			 ALERT_BUTTON.click();
//		 }
//		 
//		 public void ClickAlertSearch() {
//			   
//			 Alert_search.click();
//		 }
//		 
//		 
//		 public void SearchAlertbutton() {
//			   
//			 search_Alert.click();
//		 }
//		 
//		 
//		 
//		 public void ClickChatButton() {
//			   
//			 CHAT_BUTTON.click();
//		 }
//		 
//		 
//		 
//		 public void ClickUserButton() {
//			   
//			 USERS_BUTTON.click();
//		 }
//		 
//		 public void ClickUserSearch() {
//			   
//			 User_Search.click();
//		 }
//		 
//		 
//		 public void ClickFilesButton() {
//			   
//			 FILES_BUTTON.click();
//		 }
//		 
//		 public void ViewFiles() {
//			   
//			 ViewFiles.click();
//		 }
//		 
//		 public void ClickDownloadButton() {
//			   
//			 DOWNLOAD_BUTTON.click();
//		 }
//		 
//		 public void ClickScheduleButton() {
//			   
//			 SCHEDULE_BUTTON.click();
//		 }
//		 
//		 public void ClickNextSchedule() {
//			   
//			 NextSchedule.click();
//		 }
//		 
//		 
//		 public void ClickSettingButton() {
//			   
//			 SettingsButton.click();
//		 }
//		 
//		 
//		 
//		 public void ClickPushButton() {
//			   
//			 pushNotification.click();
//			 Disable.click();
//		 }
//		  
//		 
//		 public void ClickExitButton() {
//			   
//			 Back.click();
//			 confirm.click();
//		 }

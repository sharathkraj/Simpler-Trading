package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TradingRO {
	
	private static TradingRO TradingInstance;
	
	private  TradingRO() {
		
	}
	
	public static TradingRO getInstance() {
		
		if(TradingInstance== null) {
			TradingInstance = new TradingRO();
		}
		return TradingInstance;
	}
	
	
	
	
	 @FindBy(xpath = "//android.widget.Image[@text='bar chart outline']")
	 private  WebElement TradingRoomentry;
	   
	 @FindBy(xpath = "//android.widget.Image[@text='options-icon']")
	 private  WebElement Options;
	   
	 @FindBy(xpath = "//android.widget.Button[@text='ENTER ROOM']")
	 private  WebElement RoomEntering;
	 
	  
	 @FindBy(xpath = "//android.widget.Image[@bounds='[202,2258][267,2331]']")
	 private  WebElement ALERT_BUTTON;

	  
	 @FindBy(xpath = "//android.widget.Image[@bounds='[337,2258][405,2331]']")
	 private  WebElement CHAT_BUTTON;
	 
	 @FindBy(xpath = "//android.widget.Image[@bounds='[475,2258][540,2331]']")
	 private  WebElement USERS_BUTTON;
	 
	 @FindBy(xpath = "//android.view.View[@bounds='[573,2230][711,2332]']")
	 private  WebElement FILES_BUTTON;
	 
	 
	 @FindBy(xpath = "//android.widget.TextView[@text='RH-auto-webinar-welcome-mat-REPLAY.jpg']")
	 private  WebElement ViewFiles;
	 
	 @FindBy(xpath = "//android.widget.Image[@bounds='[919,455][990,525]']")
	 private  WebElement DOWNLOAD_BUTTON;
	 
	 @FindBy(xpath = "//android.view.View[@bounds='[708,2230][905,2332]']")
	 private  WebElement SCHEDULE_BUTTON;
	 
	 @FindBy(xpath = "//android.widget.TextView[@text='chevron forward sharp']")
	 private  WebElement NextSchedule;
	 
	 @FindBy(xpath = "//android.widget.Image[@bounds='[953,2258][1029,2331]']")
	 private  WebElement SettingsButton;
	 
	 @FindBy(xpath = "//android.widget.TextView[@bounds='[900,514][959,573]']")
	 private  WebElement pushNotification;
	 
	 @FindBy(xpath = "//android.view.Viewn[@bounds='[818,748][990,857]']")
	 private  WebElement Disable;
	 
	 @FindBy(xpath = "//android.widget.Button[@bounds='[14,171][149,264]']")
	 private  WebElement Back;
	 

	 
	 
	 
	 
	 public void enterTradingroom() {
		   
		 TradingRoomentry.click();
	 }
	 
	 
	 public void clickOptions() {
		   
		 Options.click();
	 }
	 
	 
	 
	 public void enterRoom() {
		   
		 RoomEntering.click();
	 }
	 
	 
	 public void ClickAlertbutton() {
		   
		 ALERT_BUTTON.click();
	 }
	 
	 
	 
	 public void ClickChatButton() {
		   
		 CHAT_BUTTON.click();
	 }
	 
	 
	 
	 public void ClickUserButton() {
		   
		 USERS_BUTTON.click();
	 }
	 
	 
	 
	 public void ClickFilesButton() {
		   
		 FILES_BUTTON.click();
	 }
	 
	 public void ViewFiles() {
		   
		 ViewFiles.click();
	 }
	 
	 public void ClickDownloadButton() {
		   
		 DOWNLOAD_BUTTON.click();
	 }
	 
	 public void ClickScheduleButton() {
		   
		 SCHEDULE_BUTTON.click();
	 }
	 
	 public void ClickNextSchedule() {
		   
		 NextSchedule.click();
	 }
	 
	 
	 public void ClickSettingButton() {
		   
		 SettingsButton.click();
	 }
	 
	 
	 
	 public void ClickPushButton() {
		   
		 pushNotification.click();
		 Disable.click();
	 }
	 
	 
	 
	 
	 public void ClickExitButton() {
		   
		 Back.click();
	 }
	 
	 

	 
	 
}

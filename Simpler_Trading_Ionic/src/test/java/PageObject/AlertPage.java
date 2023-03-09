package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertPage {
	
	
//	private static AlertPage AlertInstance;
//	
//	private  AlertPage() {
//		
//	}
//	
//	public static AlertPage getInstance() {
//		
//		if(AlertInstance== null) {
//			AlertInstance = new AlertPage();
//		}
//		return AlertInstance;
//	}
	
	// Alert and Tranding Room //
	
	@FindBy(xpath = "//android.widget.TextView[@text='notifications outline']")
	 public static  WebElement AlertTab;
	   
	   
	 @FindBy(xpath = "//android.widget.Button[@text='filter outline']")
	 public static  WebElement AlertFilter;
		   
	 @FindBy(xpath = "//android.widget.TextView[@text='Deselect All']")
	 public static  WebElement DeSelect;
	 
	 @FindBy(xpath = "//android.widget.Button[@text='Apply']")
	 public static  WebElement Apply;
	 
	
		   
	 @FindBy(xpath = "//android.widget.Button[@text='filter outline']")
	 public static  WebElement AlertFilter1;
	 
	 @FindBy(xpath = "//android.widget.TextView[@text='Select All']")
	 public static WebElement ChooseAll;
	 
	 @FindBy(xpath = "//android.widget.Button[@text='Apply']")
	 public static  WebElement Apply1;
	 
	 @FindBy(xpath = "//android.view.View[@bounds='[45,376][1006,2095]']")
	 public static  WebElement details;
	 
	 
	 @FindBy(xpath = "//android.widget.Image[@text='bookmark outline']")
	 public static  WebElement bookMark;
	 
	 @FindBy(xpath = "//android.widget.Image[@text='bookmark outline']")
	 public static  WebElement bookMark1;

	 @FindBy(xpath = "//android.widget.Button[@text='back']")
	 public static  WebElement back;
	 
	 @FindBy(xpath = "//android.widget.EditText[@bounds='[16,137][916,261]']")
	 public static  WebElement Search;
	 
	 @FindBy(xpath = "//android.widget.Button[@text='filter outline']")
	 public static  WebElement AlertFilter2;
	 
	 @FindBy(xpath = "//android.widget.Button[@bounds='[53,1988][115,2050]']")
	 public static  WebElement show_bookmark;
	 
	 
	 //Trading room //	 
	 
	 @FindBy(xpath = "//android.widget.Image[@text='bar chart outline']")
	 public static  WebElement TradingRoomentry;
	   
	 @FindBy(xpath = "//android.widget.Image[@text='options-icon']")
	 public static  WebElement Options;
	 
	   
	 @FindBy(xpath = "//android.widget.Button[@text='ENTER ROOM']")
	 public static  WebElement RoomEntering;
	 
	  
	 @FindBy(xpath = "//android.widget.Image[@bounds='[202,2258][267,2331]']")
	 public static  WebElement ALERT_BUTTON;
	 
	 @FindBy(xpath = "//android.widget.Image[@text='search sharp']")
	 public static  WebElement Alert_search;
	 
	 @FindBy(xpath = "//android.widget.Image[@bounds='[168,157][916,278]]']")
	 public static  WebElement search_Alert;

	  
	 @FindBy(xpath = "//android.widget.Image[@bounds='[337,2258][405,2331]']")
	 public static  WebElement CHAT_BUTTON;
	 
	 @FindBy(xpath = "//android.widget.Image[@bounds='[475,2258][540,2331]']")
	 public static  WebElement USERS_BUTTON;
	 
	 @FindBy(xpath = "//android.widget.Image[@bounds='[168,157][916,278]']")
	 public static  WebElement User_Search;
	 
	 @FindBy(xpath = "//android.view.View[@bounds='[573,2230][711,2332]']")
	 public static  WebElement FILES_BUTTON;
	 
	 
	 @FindBy(xpath = "//android.widget.TextView[@text='RH-auto-webinar-welcome-mat-REPLAY.jpg']")
	 public static  WebElement ViewFiles;
	 
	 @FindBy(xpath = "//android.widget.Image[@bounds='[919,455][990,525]']")
	 public static  WebElement DOWNLOAD_BUTTON;
	 
	 @FindBy(xpath = "//android.view.View[@bounds='[708,2230][905,2332]']")
	 public static  WebElement SCHEDULE_BUTTON;
	 
	 @FindBy(xpath = "//android.widget.TextView[@text='chevron forward sharp']")
	 public static  WebElement NextSchedule;
	 
	 @FindBy(xpath = "//android.widget.Image[@bounds='[953,2258][1029,2331]']")
	 public static  WebElement SettingsButton;
	 
	 @FindBy(xpath = "//android.widget.TextView[@bounds='[900,514][959,573]']")
	 public static  WebElement pushNotification;
	 
	 @FindBy(xpath = "//android.view.Viewn[@bounds='[818,748][990,857]']")
	 public static  WebElement Disable;
	 
	 @FindBy(xpath = "//android.widget.Button[@bounds='[14,171][149,264]']")
	 public static  WebElement Back;
	 
	 @FindBy(xpath = "//android.widget.Button[@bounds='[770,1307][891,1425]']")
	 public static  WebElement confirm;


	 
	 
	 
//	 public void ClickAlert() {
//		   
//		 AlertTab.click();
//	 }
//	 
//	 
//	 public void ClickFilter() {
//		   
//		 AlertFilter.click();
//	 }
//	 
//	 
//	 
//	 public void DeSelectall() {
//		   
//		 DeSelect.click();
//	 }
//	 
//	 public void ClickApply() {
//		   
//		 Apply.click();
//	 }
//	 
//	 public void ClickAlertFilter() {
//		   
//		 AlertFilter1.click();
//	 }
//	 
//	 
//	 
//	 public void SelectAll() {
//		   
//		 ChooseAll.click();
//	 }
//	 
//	 public void ClickApply1() {
//		   
//		 Apply1.click();
//	 }
//	 
//	 
//	 public void ClickDetails() {
//		   
//		 details.click();
//	 }
//	 
//	 
//	 
//	 public void ClickBoomark() {
//		   
//		 bookMark.click();
//		 bookMark1.click();
//	 }
//	 
//	 public void ClickBack() {
//		   
//		 back.click();
//	 }
//	 
//	 
//	 
//	 public void ClickSearch(String Searchcontent) {
//		   
//		 Search.sendKeys(Searchcontent);
//	 }
//	 
//	 public void ClickAlertFilter1() {
//		   
//		 AlertFilter2.click();
//	 }
//	 
//	 
//	 public void ClickShowBookMark() {
//		   
//		 show_bookmark.click();
//	 }
//	 
	 // Trading room
	 
	 
//	 public void enterTradingroom() {
//		   
//		 TradingRoomentry.click();
//	 }
//	 
//	 
//	 public void clickOptions() {
//		   
//		 Options.click();
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
//	 
//	 public void SearchAlertbutton() {
//		   
//		 search_Alert.click();
//	 }
//	 
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
//	 public void ClickUserSearch() {
//		   
//		 User_Search.click();
//	 }
//	 
//	 
//	 public void ClickFilesButton() {
//		   
//		 FILES_BUTTON.click();
//	 }
//	 
//	 public void ViewFiles() {
//		   
//		 ViewFiles.click();
//	 }
//	 
//	 public void ClickDownloadButton() {
//		   
//		 DOWNLOAD_BUTTON.click();
//	 }
//	 
//	 public void ClickScheduleButton() {
//		   
//		 SCHEDULE_BUTTON.click();
//	 }
//	 
//	 public void ClickNextSchedule() {
//		   
//		 NextSchedule.click();
//	 }
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
//		 pushNotification.click();
//		 Disable.click();
//	 }
//	  
//	 
//	 public void ClickExitButton() {
//		   
//		 Back.click();
//		 confirm.click();
//	 }
	 

}

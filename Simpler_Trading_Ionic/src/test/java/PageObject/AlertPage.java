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
	
	// Alert and Trading Room //
	   
	   
	@FindBy(xpath = "//android.widget.Button[@text='filter outline']")
	public static  WebElement AlertFilter;
		   
	@FindBy(xpath = "//android.widget.TextView[@text='Deselect All']")
	public static  WebElement DeSelect;
	 
	@FindBy(xpath = "//android.widget.Button[@text='Apply']")
	public static  WebElement Apply;
	
	
	@FindBy(xpath = "//android.widget.TextView[@bounds='[930,525][990,587]']")
	public static  WebElement oneAlertenable;
	
	@FindBy(xpath = "//android.widget.Button[@text='Apply']")
	public static  WebElement Apply1;
	 
	
	@FindBy(xpath = "//android.widget.TextView[@text='Select All']")
	public static WebElement ChooseAll;
	 
	@FindBy(xpath = "//android.widget.Button[@text='Apply']")
	public static  WebElement Apply2;
	 
	@FindBy(xpath = "//android.view.View[@enabled='true']")
	public static  WebElement details;
	 
	 
	@FindBy(xpath = "//android.widget.Image[@text='bookmark outline']")
	public static  WebElement bookMark;
	
	@FindBy(xpath = "//android.widget.Image[@text='bookmark']")
	public static  WebElement bookMark1;

	@FindBy(xpath = "//android.widget.Button[@text='back']")
	public static  WebElement back;
	 
	@FindBy(xpath = "//android.widget.EditText[@bounds='[16,137][916,261]']")
	public static  WebElement Search;
	 
	@FindBy(xpath = "//android.widget.Button[@bounds='[53,1988][115,2050]']")
	public static  WebElement show_bookmark;
	
	 
	 
	 //Trading room //	 
	 
	@FindBy(xpath = "//android.widget.Image[@text='bar chart outline']")
	public static  WebElement TradingRoomentry;
	   
	 
	@FindBy(xpath = "//android.widget.Button[@text='ENTER ROOM']")
	public static  WebElement RoomEntering;
	 
	  
	@FindBy(xpath = "//android.widget.Image[@bounds='[202,2258][267,2331]']")
	public static  WebElement ALERT_BUTTON;
	 
	@FindBy(xpath = "//android.widget.Image[@text='search sharp']")
	public static  WebElement Alert_search;
	 
//	@FindBy(xpath = "/html/body/div[1]/div/div/div/div[2]/div[2]/div/div[2]/div/div/div/div[1]/div/div[2]/div/div/div[3]/div/div/div/div[24]/span[3]/span/span/b")
//	public static  WebElement search_Alert;
	
	@FindBy(xpath = "//android.widget.TextView[@bounds='[295,146][956,261]']")
	public static  WebElement search_Alert;

	
	@FindBy(xpath = "//android.widget.Image[@bounds='[337,2258][405,2331]']")
	public static  WebElement CHAT_BUTTON;
	 
	@FindBy(xpath = "//android.widget.Image[@bounds='[475,2258][540,2331]']")
	public static  WebElement USERS_BUTTON;
	 
	@FindBy(xpath = "//android.widget.Image[@text='search sharp']")
	public static  WebElement User_Search;
	
	@FindBy(xpath = "//android.widget.EditText[@bounds='[168,157][916,278]']")
	public static  WebElement User_Search1;
	
	@FindBy(xpath = "//android.view.View[@bounds='[272,433][990,624]']")
	public static  WebElement User_Click;
	
	@FindBy(xpath = "//android.widget.Button[@text='close circle outline']")
	public static  WebElement User_Close;
	
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
	 
	@FindBy(xpath = "//android.view.View[@bounds='[855,523][959,565]]']")
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

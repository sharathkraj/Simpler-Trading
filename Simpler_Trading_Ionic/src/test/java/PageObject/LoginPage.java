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
	 
	 
	 @FindBy(xpath = "//android.widget.Button[@text='filter outline']")
	 public static  WebElement Videofilter;
	   
	 @FindBy(xpath = "//android.widget.TextView[@text='Deselect All']")
	 public static  WebElement DeSelectAll;
	   
	 @FindBy(xpath = "//android.widget.TextView[@bounds='[930,525][990,587]']")
	 public static  WebElement enable;
	   
	 @FindBy(xpath = "//android.widget.Button[@text='Apply']")
	 public static  WebElement apply;
	   
	 @FindBy(xpath = "//android.widget.Button[@text='filter outline']")
	 public static  WebElement Videofilter1;
	   
	   
	 @FindBy(xpath = "//android.widget.TextView[@text='Select All']")
	 public static  WebElement SelectAll;
	   
	 @FindBy(xpath = "//android.widget.Button[@text='Apply']")
	 public static  WebElement apply1;
	   
	 @FindBy(xpath = "//android.widget.Image[@text='bookmark outline']")
	 public static WebElement bookMark;
	   
	 @FindBy(xpath = "//android.widget.Button[@text='filter outline']")
	 public static  WebElement Videofilter2;
	   
	   
	 @FindBy(xpath = "//android.widget.EditText[@enabled='true']")
	 public static  WebElement ShowBookMark;
	   
	 @FindBy(xpath = "//android.widget.Button[@text='Apply']")
	 public static  WebElement apply2;
	   
	 @FindBy(xpath = "//android.widget.Image[@text='bookmark']")
	 public static WebElement removeBookMark;
	  
	 @FindBy(xpath = "//android.widget.Button[@text='filter outline']")
	 public static  WebElement Videofilter3;
	   
	 @FindBy(xpath = "//android.widget.EditText[@clickable='true']")
	 public static  WebElement HomeSearch;
	 
	   
	 @FindBy(xpath = "//android.widget.TextView[@text='$Mar 10']")
	 public static  WebElement HomeFeed;
	   
//	 @FindBy(xpath = "//android.view.View[@text='Next Video']")
//	 public static  WebElement VideoPlay;
//	   
//	 @FindBy(xpath = "//android.view.View[@text='Next Video']")
//	 public static  WebElement VideoPause;
//	  
	      	   
	 @FindBy(xpath = "//android.view.View[@text='chevron forward sharp']")
	 public static  WebElement NextVideo;
			   
	 @FindBy(xpath = "//android.widget.Image[@text='back']")
	 public static  WebElement Back;
		 
	   
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
//	 
//	 public void Video_Filter() {
//		   
//		 Videofilter.click();
//	 }
//	 	 
//	 public void Disable() {
//		   
//		 DeSelectAll.click();
//	 }
//	 
//	 
//	 public void Enable() {
//		   
//		 enable.click();
//	 }
//	 
//	 public void Apply() {
//		   
//		 apply.click();
//	 }
//	 
//	 public void enterVideoFilter() {
//		   
//		 Videofilter1.click();
//	 }
//	  
//	 
//	 public void EnableAll() {
//		   
//		 SelectAll.click();
//	 }
//	 
//	 
//	 
//	 public void Apply1() {
//		   
//		 apply1.click();
//	 }
//	 
//	 
//	 public void Clickbookmark() {
//		   
//		 bookMark.click();
//	 }
//	 
//	 public void enterVideoFilter1() {
//		   
//		 Videofilter2.click();
//	 }
//	 
//	 public void showOnBookmark() {
//		   
//		 ShowBookMark.click();
//	 }
//	 
//	 public void Apply2() {
//		   
//		 apply2.click();
//	 }
//	 public void Disablebookmark() {
//		   
//		 DisablebookMark.click();
//	 }
//	 public void enterVideoFilter3() {
//		   
//		 Videofilter3.click();
//	 }
//	 public void disableBookMark() {
//		   
//		 DisableShowBookMark.click();
//	 }
//	 public void homesearch() {
//		   
//		 HomeSearch.click();
//	 }
//	 public void homeFeeds() {
//		   
//		 HomeFeed.click();
//	 }
//	 public void Play() {
//		   
//		 VideoPlay.click();
//	 }
//	 public void Pause() {
//		   
//		 VideoPause.click();
//	 }
//	 public void ClickNextVideo() {
//		   
//		 NextVideo.click();
//	 }
//	 public void enterBack() {
//		   
//		 Back.click();
//	 }
//	 

   


		
package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	private static LoginPage LoginInstance;
	
	private  LoginPage() {
		
	}
	
	public static LoginPage getInstance() {
		
		if(LoginInstance== null) {
			LoginInstance = new LoginPage();
		}
		return LoginInstance;
	}
	
	
	
   @FindBy(xpath = "//android.widget.EditText[@bounds='[73,1158][1006,1274]']")
   private  WebElement USERNAME;
   
   @FindBy(xpath = "//android.widget.EditText[@bounds='[73,1358][1006,1473]']")
   private  WebElement PASSWORD;
   

   @FindBy(xpath ="//android.widget.Button[@text='LOG IN']")
   private  WebElement LOGIN_BUTTON;
   
   @FindBy(xpath = "//android.widget.TextView[@text='Signals Inside The Squeeze']")
	 private  WebElement HomeFeed;
	   
	   
	 @FindBy(xpath = "//android.view.View[@text='Next Video']")
	 private  WebElement NextVideo;
		   
	 @FindBy(xpath = "//android.widget.Image[@text='back']")
	 private  WebElement Back;
	 
	 @FindBy(xpath = "//android.widget.Image[@text='bookmark outline']")
	 private WebElement bookMark;
		   
	 @FindBy(xpath = "//android.widget.Button[@text='filter outline']")
	 private  WebElement Videofilter;
	 
	 
	 @FindBy(xpath = "//android.widget.TextView[@bounds='[975,461][1035,520]']")
	 private  WebElement disble;

	 @FindBy(xpath = "//android.widget.TextView[@bounds='[53,174][1026,225]']")
	 private  WebElement enable;
	 
	 @FindBy(xpath = "//android.widget.Button[@text='Apply']")
	 private  WebElement apply;
	 
	 @FindBy(xpath = "//android.widget.EditText[@bounds='[16,137][916,261]']")
	 private  WebElement HomeSearch;


	 
	 public void enterUserName(String UserName) {
		   
		   USERNAME.sendKeys(UserName);
	   }
	   
	 public void enterPassWord(String PassWord) {
		   
		   PASSWORD.sendKeys(PassWord);
	   }
	 
	 public void ClickLogin() {
		   
		   LOGIN_BUTTON.click();
	 }
	 
	 

	 
	 
	 public void Feed() {
		   
		   HomeFeed.click();
	 }
	 
	 
	 
	 public void ClickNextVideo() {
		   
		   NextVideo.click();
	 }
	 
	 
	 public void ClickBack() {
		   
		   Back.click();
	 }
	 
	 public void ClickBooMark() {
		   
		   bookMark.click();
	 }
	 
	 
	 
	 public void enterVideoFilter() {
		   
		   Videofilter.click();
	 }
	  
	 
	 public void ClickDisable() {
		   
		   disble.click();
	 }
	 
	 
	 
	 public void ClickEnable() {
		   
		   enable.click();
	 }
	 
	 
	 
	 public void ClickApply() {
		   
		 apply.click();
	 }
	 
	 public void Searching() {
		   
		 HomeSearch.click();
	 }
	 

   
}

		
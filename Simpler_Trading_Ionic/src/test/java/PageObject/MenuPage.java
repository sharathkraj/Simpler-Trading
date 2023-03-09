package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenuPage {
	
//private static MenuPage MenuInstance;
	
//	private  MenuPage() {
//		
//	}
//	
//	public static MenuPage getInstance() {
//		
//		if(MenuInstance== null) {
//			MenuInstance = new MenuPage();
//		}
//		return MenuInstance;
//	}
	
//	@FindBy(xpath = "//android.widget.Image[@text='menu outline']")
//	public static  WebElement MenuClick;
//	
//	@FindBy(xpath = "//android.widget.Button[@text='arrow redo']")
//	public static  WebElement Privacy;
//	
//	@FindBy(xpath = "//android.widget.Button[@bounds='[900,624][987,711]']")
//	public static  WebElement Help;
//	
//	@FindBy(xpath = "//android.widget.Button[@bounds='[900,787][987,874]']")
//	public static  WebElement Account;
//	
//	@FindBy(xpath = "//android.widget.Image[@text='chevron forward sharp']")
//	public static  WebElement PushNotificatiosn;
//	
//	@FindBy(xpath = "//android.widget.TextView[@bounds='[930,520][990,579]']")
//	public static  WebElement DisableNotifications;
//	
//	@FindBy(xpath = "//android.view.View[@bounds='[885,528][990,570]']")
//	public static  WebElement EnableNotifications;
//	
//	
//	@FindBy(xpath = "//android.widget.Button[@text='back']")
//	public static  WebElement BackMenu;
	
	@FindBy(xpath = "//android.widget.Button[@text='Log Out']")
	public static  WebElement LOGOUT_BUTTON;
	 
	@FindBy(xpath = "//android.widget.Button[@text='OK']")
	public static  WebElement CONFIRM_BUTTON;
	
	
//		 public void ClickMenubutton() {
//		   
//			 MenuClick.click();
//	   }
//		 
//		 public void ClickPrivacy() {
//			   
//			 Privacy.click();
//	}
//		 
//		 public void ClickHelp() {
//			   
//			 Help.click();
//	}
//		 
//		 public void ClikAccount() {
//			   
//			 Account.click();
//	}
//		 
//		 public void ClickPush() {
//			   
//			 PushNotificatiosn.click();
//			 DisableNotifications.click();
//			 EnableNotifications.click();
//			 BackMenu.click();
//	}
//		 
//		
//   public void ClickLogout() {
//	   
//	 LOGOUT_BUTTON.click();
//    }
//
//   public void ClickConfirm() {
//	   
//	 CONFIRM_BUTTON.click();
//    }
}

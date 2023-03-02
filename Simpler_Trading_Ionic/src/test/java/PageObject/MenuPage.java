package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenuPage {
	
private static MenuPage MenuInstance;
	
	private  MenuPage() {
		
	}
	
	public static MenuPage getInstance() {
		
		if(MenuInstance== null) {
			MenuInstance = new MenuPage();
		}
		return MenuInstance;
	}
	
	@FindBy(xpath = "//android.widget.Image[@text='menu outline']")
	 private  WebElement Menu;
	
	@FindBy(xpath = "//android.widget.Button[@text='arrow redo']")
	 private  WebElement Privacy;
	
	@FindBy(xpath = "//android.widget.Button[@bounds='[900,624][987,711]']")
	 private  WebElement Help;
	
	@FindBy(xpath = "//android.widget.Button[@bounds='[900,787][987,874]']")
	 private  WebElement Account;
	
	@FindBy(xpath = "//android.widget.Image[@text='chevron forward sharp']")
	 private  WebElement PushNotificatiosn;
	
	@FindBy(xpath = "//android.widget.TextView[@bounds='[930,520][990,579]']")
	 private  WebElement DisableNotifications;
	
	@FindBy(xpath = "//android.view.View[@bounds='[885,528][990,570]']")
	 private  WebElement EnableNotifications;
	
	
	@FindBy(xpath = "//android.widget.Button[@text='back']")
	 private  WebElement BackMenu;
	
	 @FindBy(xpath = "//android.widget.Button[@text='Log Out']")
	 private  WebElement LOGOUT_BUTTON;
	 
	 @FindBy(xpath = "//android.widget.Button[@text='OK']")
	 private  WebElement CONFIRM_BUTTON;
	
	
		 public void ClickMenubutton() {
		   
			 Menu.click();
	   }
		 
		 public void ClickPrivacy() {
			   
			 Privacy.click();
	}
		 
		 public void ClickHelp() {
			   
			 Help.click();
	}
		 
		 public void ClikAccount() {
			   
			 Account.click();
	}
		 
		 public void ClickPush() {
			   
			 PushNotificatiosn.click();
			 DisableNotifications.click();
			 EnableNotifications.click();
			 BackMenu.click();
	}
		 
		
   public void ClickLogout() {
	   
	 LOGOUT_BUTTON.click();
    }

   public void ClickConfirm() {
	   
	 CONFIRM_BUTTON.click();
    }
}

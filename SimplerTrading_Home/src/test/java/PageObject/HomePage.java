package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	
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
	 
	   
	 @FindBy(xpath = "//android.widget.TextView[@text='$Mar 20']")
	 public static  WebElement HomeFeed;
	   
	 @FindBy(xpath = "//android.view.View[@text='Next Video']")
	 public static  WebElement VideoPlay;
	   
	 @FindBy(xpath = "//android.view.View[@text='Next Video']")
	 public static  WebElement VideoPause;
//	  
	      	   
	 @FindBy(xpath = "//android.view.View[@text='chevron forward sharp']")
	 public static  WebElement NextVideo;
			   
	 @FindBy(xpath = "//android.widget.Image[@text='back']")
	 public static  WebElement Back;
		 

}

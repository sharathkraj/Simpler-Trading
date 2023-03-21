package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertPage {
	
	
		     
	   
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
	 
	@FindBy(xpath = "//android.widget.Image[@text='7ca124044dddc33dcccd3e7e5ca9f5ad?d=mm']")
	public static  WebElement details;
	 
	 
	@FindBy(xpath = "//android.widget.Image[@text='bookmark outline']")
	public static  WebElement bookMark;
	
	@FindBy(xpath = "//android.widget.Image[@text='bookmark']")
	public static  WebElement bookMark1;

	@FindBy(xpath = "//android.widget.Button[@text='back']")
	public static  WebElement back;
	 
	@FindBy(xpath = "//android.widget.EditText[@clickable='true']")
	public static  WebElement AlertSearch;
	 
	@FindBy(xpath = "//android.widget.Button[@bounds='[53,1988][115,2050]']")
	public static  WebElement show_bookmark;
		 
		 

}

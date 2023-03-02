package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertPage {
	
	
	private static AlertPage AlertInstance;
	
	private  AlertPage() {
		
	}
	
	public static AlertPage getInstance() {
		
		if(AlertInstance== null) {
			AlertInstance = new AlertPage();
		}
		return AlertInstance;
	}
	
		     
	 @FindBy(xpath = "//android.widget.TextView[@text='notifications outline']")
	 private  WebElement AlertTab;
	   
	   
	 @FindBy(xpath = "//android.widget.Button[@text='filter outline']")
	 private  WebElement AlertFilter;
		   
	 @FindBy(xpath = "//android.widget.TextView[@text='Deselect All']")
	 private  WebElement DeSelect;
	 
	 @FindBy(xpath = "//android.widget.TextView[@text='Select All']")
	 private WebElement ChooseAll;
		   
	 @FindBy(xpath = "//android.widget.Button[@text='Apply']")
	 private  WebElement Apply;
	 
	 
	 @FindBy(xpath = "//android.view.View[@bounds='[45,376][1006,1054]']")
	 private  WebElement details;
	 
	 
	 @FindBy(xpath = "//android.widget.Image[@text='bookmark outline']")
	 private  WebElement bookMark;

	 @FindBy(xpath = "//android.widget.Button[@text='back']")
	 private  WebElement back;
	 
	 @FindBy(xpath = "//android.widget.EditText[@bounds='[16,137][916,261]']")
	 private  WebElement Search;
	 


	 
	 
	 
	 public void ClickAlert() {
		   
		 AlertTab.click();
	 }
	 
	 
	 public void ClickFilter() {
		   
		 AlertFilter.click();
	 }
	 
	 
	 
	 public void DeSelectall() {
		   
		 DeSelect.click();
	 }
	 
	 
	 public void SelectAll() {
		   
		 ChooseAll.click();
	 }
	 
	 public void ClickApply() {
		   
		 Apply.click();
	 }
	 
	 
	 
	 public void ClickDetails() {
		   
		 details.click();
	 }
	 
	 
	 
	 public void ClickBoomark() {
		   
		 bookMark.click();
	 }
	 
	 
	 
	 public void ClickBack() {
		   
		 back.click();
	 }
	 
	 
	 
	 public void ClickSearch(String Searchcontent) {
		   
		 Search.sendKeys(Searchcontent);
	 }
	 
	 

}

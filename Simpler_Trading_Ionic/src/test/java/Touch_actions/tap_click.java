package Touch_actions;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class tap_click {
	
	 public static void showBookmark(PerformsTouchActions driver) {
	    	TouchAction action = new TouchAction(driver);
	    	action.tap(PointOption.point(466,2011)).release().perform();
	    } 
	    

	public static void nextVideo(PerformsTouchActions driver) {
		TouchAction action = new TouchAction(driver);
		action.tap(PointOption.point(450,2305)).release().perform();
	} 
	public static void back(PerformsTouchActions driver) {
		TouchAction action = new TouchAction(driver);
		action.tap(PointOption.point(76,225)).release().perform();
	}
	
	public static void alerttab(PerformsTouchActions driver) {
		TouchAction action = new TouchAction(driver);
		action.tap(PointOption.point(101,2277)).release().perform();
	}
	public static void options(PerformsTouchActions driver) {
		TouchAction action = new TouchAction(driver);
		action.tap(PointOption.point(573,476)).release().perform();
	}
	public static void alert_search(PerformsTouchActions driver) {
		TouchAction action = new TouchAction(driver);
		action.tap(PointOption.point(994,222)).release().perform();
	}
	public static void user_click(PerformsTouchActions driver) {
		TouchAction action = new TouchAction(driver);
		action.tap(PointOption.point(427,530)).release().perform();	
	}
	
	public static void user_close(PerformsTouchActions driver) {
		TouchAction action = new TouchAction(driver);
		action.tap(PointOption.point(985,206)).release().perform();	
	}	
	public static void back_user(PerformsTouchActions driver) {
		TouchAction action = new TouchAction(driver);
		action.tap(PointOption.point(80,225)).release().perform();
	}
	public static void scheduleT(PerformsTouchActions driver) {
		TouchAction action = new TouchAction(driver);
		action.tap(PointOption.point(992,196)).release().perform();
	}
	public static void settings(PerformsTouchActions driver) {
		TouchAction action = new TouchAction(driver);
		action.tap(PointOption.point(653,1918)).release().perform();
	}
	public static void schedule(PerformsTouchActions driver) {
		TouchAction action = new TouchAction(driver);
		action.tap(PointOption.point(811,1929)).release().perform();
	}
	
	
	
}

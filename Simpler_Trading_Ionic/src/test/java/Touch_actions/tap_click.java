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
		action.tap(PointOption.point(234,1982)).release().perform();
	}
	public static void alerttab1(PerformsTouchActions driver) {
		TouchAction action = new TouchAction(driver);
		action.tap(PointOption.point(234,1982)).release().perform();
	}
	public static void user(PerformsTouchActions driver) {
		TouchAction action = new TouchAction(driver);
		action.tap(PointOption.point(507,1979)).release().perform();
	}
	public static void searchclick(PerformsTouchActions driver) {
		TouchAction action = new TouchAction(driver);
		action.tap(PointOption.point(992,215)).release().perform();
	}
	public static void filterlist(PerformsTouchActions driver) {
		TouchAction action = new TouchAction(driver);
		action.tap(PointOption.point(430,480)).release().perform();
	}
	public static void close(PerformsTouchActions driver) {
		TouchAction action = new TouchAction(driver);
		action.tap(PointOption.point(992,196)).release().perform();
	}
	public static void files(PerformsTouchActions driver) {
		TouchAction action = new TouchAction(driver);
		action.tap(PointOption.point(653,1918)).release().perform();
	}
	public static void schedule(PerformsTouchActions driver) {
		TouchAction action = new TouchAction(driver);
		action.tap(PointOption.point(811,1929)).release().perform();
	}
	
	
	
}

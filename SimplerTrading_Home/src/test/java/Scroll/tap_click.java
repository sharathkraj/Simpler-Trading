package Scroll;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class tap_click {
	
	// Home page //
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
		
		// Alert Page //
		public static void alerttab(PerformsTouchActions driver) {
			TouchAction action = new TouchAction(driver);
			action.tap(PointOption.point(101,2277)).release().perform();
		}
		
		// Trading Page //
		
		public static void options(PerformsTouchActions driver) {
			TouchAction action = new TouchAction(driver);
			action.tap(PointOption.point(573,476)).release().perform();
		}
		public static void alert_search(PerformsTouchActions driver) {
			TouchAction action = new TouchAction(driver);
			action.tap(PointOption.point(992,218)).release().perform();
		}
		
		public static void alert_copy(PerformsTouchActions driver) {
			TouchAction action = new TouchAction(driver);
			action.tap(PointOption.point(988,212)).release().perform();
		}
		
		public static void alert_back(PerformsTouchActions driver) {
			TouchAction action = new TouchAction(driver);
			action.tap(PointOption.point(84,216)).release().perform();
		}
		
		public static void user_Search(PerformsTouchActions driver) {
			TouchAction action = new TouchAction(driver);
			action.tap(PointOption.point(998,218)).release().perform();	
		}
		
		// Class Page //
		
		public static void Alert_back(PerformsTouchActions driver) {
			TouchAction action = new TouchAction(driver);
			action.tap(PointOption.point(76,206)).release().perform();
		}
				
		public static void pushn_enable(PerformsTouchActions driver) {
			TouchAction action = new TouchAction(driver);
			action.tap(PointOption.point(907,536)).release().perform();
		}
		
		public static void push_enable(PerformsTouchActions driver) {
			TouchAction action = new TouchAction(driver);
			action.tap(PointOption.point(914,804)).release().perform();
		}
}

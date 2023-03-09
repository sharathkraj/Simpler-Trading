package Touch_actions;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;

import java.time.Duration;
import java.util.Arrays;

import static org.openqa.selenium.interactions.PointerInput.Kind.TOUCH;
import static org.openqa.selenium.interactions.PointerInput.MouseButton.LEFT;
import static org.openqa.selenium.interactions.PointerInput.Origin.viewport;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.RemoteWebDriver;

import Webdriver.driverManger;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Swipes extends driverManger {
	

	private final static PointerInput FINGER = new PointerInput(TOUCH, "finger");

    public static void doSwipe(AndroidDriver driver, Point start, Point end, int duration) {
        Sequence swipe = new Sequence(FINGER, 1)
                .addAction(FINGER.createPointerMove(ofMillis(0), viewport(), start.getX(), start.getY()))
                .addAction(FINGER.createPointerDown(LEFT.asArg()))
                .addAction(FINGER.createPointerMove(ofMillis(duration), viewport(), end.getX(), end.getY()))
                .addAction(FINGER.createPointerUp(LEFT.asArg()));
        getDriver().perform(Arrays.asList(swipe));
    }
    
    public static void swipeUp(int numberOfTimes, AndroidDriver driver) {
    	
		Dimension dimension = getDriver().manage().window().getSize();
		Point start = new Point((int) (dimension.width * 0.5), (int) (dimension.height * 0.9));
		Point end = new Point((int) (dimension.width * 0.2), (int) (dimension.height * 0.1));
		for (int i = 0; i < numberOfTimes; i++) {
		doSwipe(driver, start, end, 1000); // with duration 1s
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
    
    
    public static void swipeDown(int numberOfTimes, AndroidDriver driver) {
		Dimension dimension = getDriver().manage().window().getSize();

		Point start = new Point((int) (dimension.width * 0.2), (int) (dimension.height * 0.2));
		Point end = new Point((int) (dimension.width * 0.5), (int) (dimension.height * 0.8));
		for (int i = 0; i < numberOfTimes; i++) {
		doSwipe(driver, start, end, 1000); // with duration 1s
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
    
    public static void swipetoclick(PerformsTouchActions driver) {
    	
    	
    	TouchAction action = new TouchAction(driver);
    	Dimension size =((RemoteWebDriver) driver).manage().window().getSize();
    	int width=size.width;
    	int height=size.height;
    	int middleOfX=width/2;
    	int startYCoordinate= (int)(height*.9);
    	int endYCoordinate= (int)(height*.2);
    	
    	    action.press(PointOption.point(middleOfX, startYCoordinate)) .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
    	            .moveTo(PointOption.point(middleOfX, endYCoordinate)).release().perform();
    }
	   

}

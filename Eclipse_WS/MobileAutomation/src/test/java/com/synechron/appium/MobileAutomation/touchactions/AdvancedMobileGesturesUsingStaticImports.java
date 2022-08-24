package com.synechron.appium.MobileAutomation.touchactions;

import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.testng.annotations.Test;

import com.synechron.appium.MobileAutomation.utils.DriverUtils;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

public class AdvancedMobileGesturesUsingStaticImports extends DriverUtils {

	AndroidDriver<AndroidElement> driver = null;
	@Test
	public void longPressTest() throws MalformedURLException {
		driver = getDriverForRealDevice();
		
		click("access-id", "Views");
		click("access-id", "Expandable Lists");
		click("access-id", "1. Custom Adapter");
		
		AndroidElement ele = getElement("androidui", "text(\"People Names\")");
		
		TouchAction act = new TouchAction(driver);
		
		
		act.longPress(longPressOptions().withElement(element(ele)).
				withDuration(Duration.ofSeconds(3))).
		release().perform();
		
		
	}
	
	@Test
	public void swipeTest() throws MalformedURLException {
		driver = getDriverForRealDevice();
		
		click("access-id", "Views");
		click("access-id", "Date Widgets");
		click("access-id", "2. Inline");
		click("xpath","//*[@content-desc='6']");
		
		AndroidElement srcEle = getElement("xpath", "//*[@content-desc='15']");
		AndroidElement destEle = getElement("xpath", "//*[@content-desc='0']");
		
		
		TouchAction act = new TouchAction(driver);
		
		act.longPress(longPressOptions().withElement(element(srcEle)).
				withDuration(Duration.ofSeconds(2))).
		moveTo(element(destEle)).
		release().perform();
				
	}
	
	@Test
	public void swipeOnScreen() throws MalformedURLException, InterruptedException {
		driver = getDriverForRealDevice();
		
		click("access-id", "Views");
		Thread.sleep(2000);
		swipeFromBottomToTop(driver);
		Thread.sleep(2000);
		swipeFromTopToBottom(driver);
	}
	
	public void swipeFromBottomToTop(AndroidDriver<AndroidElement> driver) {
		Dimension size = driver.manage().window().getSize();
		int startx = size.width /2;
		int starty = (int) (size.height * 0.8);
		int endy = (int) (size.height * 0.3);
		
		TouchAction act = new TouchAction(driver);
		
		act.
			press(PointOption.point(startx, starty)).
			waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000))).
			moveTo(PointOption.point(startx, endy)).
			release().perform();
	}
	
	public void swipeFromTopToBottom(AndroidDriver<AndroidElement> driver) {
		Dimension size = driver.manage().window().getSize();
		int startx = size.width /2;
		int starty = (int) (size.height * 0.3);
		int endy = (int) (size.height * 0.8);
		
		TouchAction act = new TouchAction(driver);
		
		act.
			press(PointOption.point(startx, starty)).
			waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000))).
			moveTo(PointOption.point(startx, endy)).
			release().perform();
	}


	@Test
	public void dragAndDrop() throws MalformedURLException {
		driver = getDriverForRealDevice();
		
		click("access-id", "Views");
		click("access-id", "Drag and Drop");
		
		AndroidElement srcEle = getElement("id", "io.appium.android.apis:id/drag_dot_1");
		AndroidElement destEle = getElement("id", "io.appium.android.apis:id/drag_dot_2");
		TouchAction act = new TouchAction(driver);
		act.longPress(
				longPressOptions().
				withElement(element(srcEle))).
		moveTo(element(destEle)).
		release().perform();
		
		
	}



}

package com.synechron.appium.MobileAutomation.js;

import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;
import com.synechron.appium.MobileAutomation.utils.DriverUtils;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

public class AdvancedMobileGesturesUsingJavaScript extends DriverUtils {

	AndroidDriver<AndroidElement> driver = null;
	//@Test
	public void longPressTest() throws MalformedURLException {
		driver = getDriverForRealDevice();
		click("access-id", "Views");
		click("access-id", "Expandable Lists");
		click("access-id", "1. Custom Adapter");
		AndroidElement ele = getElement("androidui", "text(\"People Names\")");
		((JavascriptExecutor) driver).executeScript("mobile: longClickGesture", 
				ImmutableMap.of("elementId", ((RemoteWebElement) ele).getId(), "duration",2000));
	}
	

	@Test
	public void swipeOnScreen() throws MalformedURLException, InterruptedException {
		driver = getDriverForRealDevice();
		click("access-id", "Views");
		AndroidElement ele = getElement("access-id", "Focus");
		Thread.sleep(2000);
		boolean canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: flingGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) ele).getId(),
			    "direction", "down",
			    "speed", 5000
			));
	}
}

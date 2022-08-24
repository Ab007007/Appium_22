package com.synechron.appium.MobileAutomation.androidui;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

import java.net.MalformedURLException;
import java.time.Duration;

import org.testng.annotations.Test;

import com.synechron.appium.MobileAutomation.utils.DriverUtils;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ScrollDemo {

	
	AndroidDriver<AndroidElement> driver = null;
	@Test
	public void longPressTest() throws MalformedURLException {
		driver = DriverUtils.getDriverForRealDevice();
		
		DriverUtils.click("access-id", "Views");
		
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"))");
		
	}
}

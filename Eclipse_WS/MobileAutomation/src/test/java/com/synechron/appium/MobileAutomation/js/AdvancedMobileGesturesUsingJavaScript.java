package com.synechron.appium.MobileAutomation.js;

import java.net.MalformedURLException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;
import com.synechron.appium.MobileAutomation.utils.DriverUtils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

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
	

	//@Test
	public void swipeOnScreen() throws MalformedURLException, InterruptedException {
		driver = getDriverForRealDevice();
		click("access-id", "Views");
		AndroidElement ele = getElement("access-id", "Focus");
		
		
		Thread.sleep(2000);
		boolean canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: flingGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) ele).getId(),
			    "direction", "left",
			    "speed", 5000
			));
	}
	
	
	@Test
	public void swipeLeftOnScreen() throws MalformedURLException, InterruptedException {
		driver = getDriverForRealDevice();
		click("access-id", "Views");
		click("access-id", "Gallery");
		click("access-id", "1. Photos");
		AndroidElement ele = getElement("xpath", "(//android.widget.ImageView)[1]");
		
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript
			("mobile: swipeGesture", 
					ImmutableMap.of("elementId", ((RemoteWebElement) ele).getId(), 
					"direction", "left" ,"percent", 0.95 , "speed", 1000
			));
	}
	
}

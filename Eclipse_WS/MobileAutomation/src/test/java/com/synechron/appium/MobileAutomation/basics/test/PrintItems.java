package com.synechron.appium.MobileAutomation.basics.test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class PrintItems {

	@Test
	public void printDefaultValue() throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver = null;
		
		DesiredCapabilities cap  =  new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus 5");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		//cap.setCapability(MobileCapabilityType.APP, new File("apps//ApiDemos-debug.apk").getAbsolutePath());
		
		cap.setCapability("appPackage", "io.appium.android.apis");
		cap.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
		
		//mCurrentFocus=Window{86972ae u0 io.appium.android.apis/io.appium.android.apis.ApiDemos}
		cap.setCapability(MobileCapabilityType.UDID, "01abd5130382753e");
		
		cap.setCapability("autoAcceptAlerts", true);
		driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		
		
		
		driver.findElementByAccessibilityId("Preference").click();
		driver.findElementByAccessibilityId("6. Advanced preferences").click();
		
		List<AndroidElement> headings = driver.findElementsById("android:id/title");
		
		 for (AndroidElement heading : headings) {
			System.out.println(heading.getAttribute("text"));
		}
	}
}

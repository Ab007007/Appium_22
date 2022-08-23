package com.synechron.appium.MobileAutomation.basics.test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class ReadDefaultVaule {

	
	@Test
	public void printDefaultValue() throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver = null;
		
		DesiredCapabilities cap  =  new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus 5");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		//cap.setCapability(MobileCapabilityType.APP, new File("apps//ApiDemos-debug.apk").getAbsolutePath());
		
		cap.setCapability("appPackage", "io.appium.android.apis");
		cap.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
		
		cap.setCapability(MobileCapabilityType.UDID, "01abd5130382753e");
		
		cap.setCapability("autoAcceptAlerts", true);
		driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		
		
		
		driver.findElementByAccessibilityId("Preference").click();
		driver.findElementByAccessibilityId("4. Default values").click();
		String chStatus = driver.findElementByClassName("android.widget.CheckBox").getAttribute("checked");
		
		System.out.println(chStatus);
		
		driver.findElementByXPath("//android.widget.TextView[@text='Edit text preference']/parent::android.widget.RelativeLayout").click();
		
		
		 String defaultValue = driver.findElementById("android:id/edit").getAttribute("text");
		
		 System.out.println("Default value : " + defaultValue);
		 driver.findElementById("android:id/edit").clear();
		 driver.findElementById("android:id/edit").sendKeys("Aravinda");
		 
		 driver.findElementById("android:id/button1").click();
		 
	}
}

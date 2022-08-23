package com.synechron.appium.MobileAutomation.utils;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class DriverUtils {

	public static AndroidDriver<AndroidElement> driver = null;
	public static AndroidDriver<AndroidElement> getDriver(String deviceName, String app, String udid) throws MalformedURLException {
		
		DesiredCapabilities cap  =  new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.APP, new File(app).getAbsolutePath());
		cap.setCapability(MobileCapabilityType.UDID, udid);
		cap.setCapability("autoAcceptAlerts", true);
		driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		return driver;
	}
	public static AndroidDriver<AndroidElement> getDriver(String deviceName, String apppackage, String appActivity, String udid) throws MalformedURLException {
		
		DesiredCapabilities cap  =  new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability("appPackage", apppackage);
		cap.setCapability("appActivity", appActivity);
		
		cap.setCapability(MobileCapabilityType.UDID, udid);
		cap.setCapability("autoAcceptAlerts", true);
		driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
	}
	public static AndroidDriver<AndroidElement> getDriverForRealDevice() throws MalformedURLException
	{
		DesiredCapabilities cap  =  new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus 5");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability("appPackage", "io.appium.android.apis");
		cap.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
		
		cap.setCapability(MobileCapabilityType.UDID, "01abd5130382753e");
		
		cap.setCapability("autoAcceptAlerts", true);
		driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
	}
	public static AndroidDriver<AndroidElement> getDriverForVirtualDevice() throws MalformedURLException
	{
		DesiredCapabilities cap  =  new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Aravind");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		//cap.setCapability(MobileCapabilityType.APP, new File("apps//ApiDemos-debug.apk").getAbsolutePath());
		
		cap.setCapability("appPackage", "io.appium.android.apis");
		cap.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
		
		cap.setCapability(MobileCapabilityType.UDID, "emulator-5554");
		
		cap.setCapability("autoAcceptAlerts", true);
		driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
	}
	
	public static AndroidElement getElement(String identifier, String value) {
		AndroidElement ele = null;
		
		
		
		return ele;
	}
	
	public static void type(String identifier, String value, String text) {
		
	}
	
	public static void click(String identifier, String value)
	{
		
	}
	
	public static void getAttribute(String identifier, String value, String attr) {
		
	}
}

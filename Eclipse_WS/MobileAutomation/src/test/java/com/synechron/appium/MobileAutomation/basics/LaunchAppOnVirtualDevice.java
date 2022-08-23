package com.synechron.appium.MobileAutomation.basics;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class LaunchAppOnVirtualDevice
{
	
	@Test
	public void launchApp() throws MalformedURLException {
		AndroidDriver<AndroidElement> driver = null;
		
		DesiredCapabilities cap  =  new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Aravind");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.APP, new File("apps//ApiDemos-debug.apk").getAbsolutePath());
		
		driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		
	
	}
	

}

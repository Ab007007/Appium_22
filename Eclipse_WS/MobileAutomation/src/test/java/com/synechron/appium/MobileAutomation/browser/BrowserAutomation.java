package com.synechron.appium.MobileAutomation.browser;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import data.GlobalData;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BrowserAutomation {

	
	@Test
	public void browserAutomation() throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, GlobalData.DEVICE_NAME);
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.UDID, GlobalData.DEVICE_UDID);
		cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		cap.setCapability("chromeOptions", ImmutableMap.of("w3c", false));
		
		cap.setCapability("autoAcceptAlerts", true);
		AndroidDriver driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://m.facebook.com");
		driver.findElementById("m_login_email").sendKeys("ABCD");
		driver.findElement(By.id("m_login_password")).sendKeys("ABCD");
		driver.findElement(By.name("login")).click();
	
	
	}
}

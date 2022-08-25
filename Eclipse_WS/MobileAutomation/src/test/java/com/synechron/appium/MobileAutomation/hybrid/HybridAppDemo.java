package com.synechron.appium.MobileAutomation.hybrid;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;
import com.synechron.appium.MobileAutomation.utils.DriverUtils;

import data.GlobalData;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class HybridAppDemo {

	
	@Test
	public void automateHybrid() throws MalformedURLException, InterruptedException {

		//driver = getDriver(GlobalData.DEVICE_NAME, "apps//WebViewTest.apk", GlobalData.DEVICE_UDID);
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, GlobalData.DEVICE_NAME);
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.APP, new File("apps//WebViewTest.apk").getAbsolutePath());
		cap.setCapability(MobileCapabilityType.UDID, GlobalData.DEVICE_UDID);
		cap.setCapability("chromeOptions", ImmutableMap.of("w3c", false));
		
		
		cap.setCapability("autoAcceptAlerts", true);
		AndroidDriver driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		DriverUtils.driver = driver ;
		DriverUtils.click("access-id", "Open navigation drawer");
		DriverUtils.click("androidui", "text(\"WebView\")");
		DriverUtils.click("id", "android:id/button1");
		System.out.println(driver.getContext());
		Set<String> contextType = driver.getContextHandles();
		Thread.sleep(5000);
		for (String context : contextType) {
			System.out.println(context);
			
			//NATIVE_APP
			//WEBVIEW_com.snc.test.webview2
		}
		driver.context("WEBVIEW_com.snc.test.webview2");
		Thread.sleep(5000);
		driver.findElement(By.name("q")).sendKeys("Synechron");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		List<AndroidElement> serachResults = driver.findElements(By.tagName("a"));
		for (AndroidElement result : serachResults) {
			System.out.println(result.getText());
		}
	}
}

package com.synechron.appium.MobileAutomation.basics.test;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

import com.synechron.appium.MobileAutomation.utils.DriverUtils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class BasicElements {
 // views -> Controls -> LigthTheam -> fill the form
	
	
	@Test
	public void fillForm() throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver =  DriverUtils.getDriverForRealDevice();
		
		
		
//		driver.findElementByAndroidUIAutomator(attribute("value"))
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		driver.findElementByAndroidUIAutomator("text(\"Controls\")").click();
		driver.findElementByAndroidUIAutomator("text(\"1. Light Theme\")").click();
		
		driver.findElementById("io.appium.android.apis:id/edit").sendKeys("AppiumEntry");
	
		driver.hideKeyboard();
		
		String value = driver.findElementByAndroidUIAutomator("text(\"Checkbox 1\")").getAttribute("checked");
		String radioValue = driver.findElementByAndroidUIAutomator("text(\"RadioButton 1\")").getAttribute("checked");
		
		System.out.println("Value : "  + value);
		System.out.println("radioValue : "  + radioValue);
		if(value == "false") {
			driver.findElementByAndroidUIAutomator("text(\"Checkbox 1\")").click();
		}
		if(radioValue == "false") {
			 driver.findElementByAndroidUIAutomator("text(\"RadioButton 1\")").click();
		}
		
		driver.findElementByAndroidUIAutomator("text(\"OFF\")").click();
		driver.findElementById("io.appium.android.apis:id/spinner1").click();
		driver.findElementByAndroidUIAutomator("text(\"Earth\")").click();
		
		
	}
	
}

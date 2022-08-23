package com.synechron.appium.MobileAutomation.basics.gaana;

import java.net.MalformedURLException;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import com.synechron.appium.MobileAutomation.utils.DriverUtils;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.PointOption;

public class AutoSuggestions {
//Views -> auto complete -> Screen Top -> Ind - Print all suggestion
//Take 30 mins and complete it

	@Test
	public void selectFromAutoSuggestion() throws MalformedURLException, InterruptedException {

		AndroidDriver<AndroidElement> driver =  DriverUtils.getDriverForRealDevice();
		
		driver.findElementByAccessibilityId("Views").click();
		driver.findElementByAccessibilityId("Auto Complete").click();
		driver.findElementByAccessibilityId("1. Screen Top").click();
		 AndroidElement element = driver.findElementById("io.appium.android.apis:id/edit");

		element.sendKeys("Ind");
		
		TouchAction act  =  new TouchAction(driver);
		
		Dimension size = driver.manage().window().getSize();
		
		//act.tap(TapOptions.tapOptions().withPosition(PointOption.point(offset size.width/2;)));
	
		
	}

}

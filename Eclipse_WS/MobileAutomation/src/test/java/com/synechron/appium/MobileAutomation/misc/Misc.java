package com.synechron.appium.MobileAutomation.misc;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

import com.synechron.appium.MobileAutomation.utils.DriverUtils;

import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class Misc extends DriverUtils
{
	
	@Test
	public void miscTestsOnDriver() throws MalformedURLException {
		driver = getDriverForRealDevice();
		
		System.out.println(driver.getCurrentPackage());
		System.out.println(driver.currentActivity());
		System.out.println(driver.getOrientation());
		System.out.println(driver.isDeviceLocked());
		System.out.println(driver.isKeyboardShown());
//		driver.unlockDevice();
		
		
		driver.setClipboardText("ARAVINDA CLIP");
		System.out.println(driver.getClipboardText());
		
		driver.pressKey(new KeyEvent(AndroidKey.HOME));
		
	}
	
	

}

package com.synechron.appium.MobileAutomation.basics.gaana;

import java.net.MalformedURLException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.synechron.appium.MobileAutomation.utils.DriverUtils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class GaanaTest {
	
	
	@Test
	public void sampleGaanaTest() throws MalformedURLException, InterruptedException
	{
		AndroidDriver<AndroidElement> driver =  DriverUtils.getDriver("Nexus 5", "com.gaana", "com.gaana.GaanaActivity", "01abd5130382753e");
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement saveButton = wait.until(ExpectedConditions.visibilityOf(driver.findElementById("com.gaana:id/btn_save")));
		
		if(saveButton.isDisplayed())
			saveButton.click();
		
		Thread.sleep(5000);
		driver.findElementByXPath("//android.widget.FrameLayout[@content-desc=\"Search\"]/android.widget.ImageView").click();
		Thread.sleep(5000);
		WebElement editbutton = wait.until(ExpectedConditions.visibilityOf(driver.findElementById("com.gaana:id/tv_search")));
		
		editbutton.click();
		driver.findElementById("com.gaana:id/search_src_text").sendKeys("KGF");
		
		driver.hideKeyboard();
		
		List<AndroidElement> searchResults = driver.findElementsByXPath("//androidx.recyclerview.widget.RecyclerView[@resource-id='com.gaana:id/rv_search_results']//*[@resource-id='com.gaana:id/ll_track_container']/android.widget.TextView");
		
		searchResults.forEach(ele -> System.out.println(ele.getAttribute("text"	)));

	
	
	}

}

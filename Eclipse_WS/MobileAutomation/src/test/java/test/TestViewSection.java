package test;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.synechron.appium.MobileAutomation.utils.DriverUtils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import page.CustomAdapterScreen;
import page.ExpandableListScreen;
import page.MainScreen;
import page.ViewScreen;

public class TestViewSection {
	
	AndroidDriver driver = null; 
	MainScreen ms =null;
	ViewScreen vs = null;
	CustomAdapterScreen cs = null;
	ExpandableListScreen es = null;
	
	
	@BeforeTest
	public void setup() throws MalformedURLException
	{
		driver = DriverUtils.getDriverForRealDevice();
		ms = new MainScreen(driver);
		vs = new ViewScreen(driver);
		cs = new CustomAdapterScreen(driver);
		es = new ExpandableListScreen(driver);
		
	}
	
	@Test
	public void longPressTest() {
		
		ms.clickOnViews();
		vs.clickOnExpandableList();
		es.clickOnCustomAdapter();
		cs.longPresspeopleNamess(driver);
		
		
	}
	
	
	

}

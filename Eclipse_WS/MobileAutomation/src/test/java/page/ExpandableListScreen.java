package page;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ExpandableListScreen {
	
	@AndroidFindBy(accessibility = "1. Custom Adapter")
	AndroidElement customAdapter;
	
	
	public void clickOnCustomAdapter( ) {
		System.out.println("clicking on Custom Adapter");
		customAdapter.click();
	}
	
	
	public ExpandableListScreen(AndroidDriver driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
	}
}

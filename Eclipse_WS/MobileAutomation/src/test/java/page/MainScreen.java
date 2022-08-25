package page;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class MainScreen {

	@AndroidFindBy(accessibility = "Views")
	AndroidElement views;
	
	
	public void clickOnViews( ) {
		System.out.println("clicking on views");
		views.click();
	}
	
	
	public MainScreen(AndroidDriver driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
	}
	
	
	
	
	
}

package page;

import java.time.Duration;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;

public class CustomAdapterScreen {

	@AndroidFindBy(uiAutomator = "text(\"People Names\")")
	AndroidElement peopleNames;
	
	@AndroidFindBy(uiAutomator = "text(\"Dog Names\")")
	AndroidElement dogNames;
	
	@AndroidFindBy(uiAutomator = "text(\"Cat Names\")")
	AndroidElement catNames;
	
	@AndroidFindBy(uiAutomator = "text(\"Fish Names\")")
	AndroidElement fishNames;
	
	public void clickOnpeopleNamess( ) {
		System.out.println("clicking on People Names");
		peopleNames.click();
	}
	
	
	public void longPresspeopleNamess(AndroidDriver driver) {
		System.out.println("clicking on People Names");
		TouchAction act = new TouchAction(driver);
		
		
		act.longPress(LongPressOptions.
				longPressOptions().
				withElement(ElementOption.element(peopleNames)).
				withDuration(Duration.ofSeconds(3))).
		release().perform();
	}
	
	public CustomAdapterScreen(AndroidDriver driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
	}
}

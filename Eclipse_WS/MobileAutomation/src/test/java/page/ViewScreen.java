package page;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ViewScreen {

	
	@AndroidFindBy(accessibility = "Expandable Lists")
	AndroidElement expandableList;

	public void clickOnExpandableList( ) {
		System.out.println("clicking on Expandable Lists");
		expandableList.click();
	}
	
	
	public ViewScreen(AndroidDriver driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
	}
}

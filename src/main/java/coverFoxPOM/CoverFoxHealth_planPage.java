package coverFoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxHealth_planPage {
	
	@FindBy(xpath ="//div[@class='next-btn']") private WebElement nextButtonOnHealthPlan;
	
	
	
	public CoverFoxHealth_planPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickOnnextButtonOnHealthPlan()
	{
		nextButtonOnHealthPlan.click();
	}
}

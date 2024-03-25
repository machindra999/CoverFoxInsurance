package coverFoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxHomePage {
	
	@FindBy (xpath ="//button[@title='Get Started']") private WebElement GetStartedButton;
	
	
	public CoverFoxHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	 public void clickOnGetStartedButton()
	 {
		 GetStartedButton.click();
	 }
}

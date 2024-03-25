package coverFoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CoverFoxMemberDetailsPage {
		
	@FindBy(id = "Age-You") private WebElement ageBox;
	
	@FindBy(xpath ="//div[text()='Next']") private WebElement nextButtonOnMemberDetailsPage;
	
	public CoverFoxMemberDetailsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnageBox(String age)
	{
		ageBox.click();
		
		Select sel= new Select(ageBox);
		sel.selectByValue(age+"y");
				
	}
	
	public void clickOnnextButtonOnMemberDetailsPage()
	{
		nextButtonOnMemberDetailsPage.click();
	}

	
		
	
}

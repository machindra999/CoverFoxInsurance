package coverFoxPOM;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxAddressDetails {

	@FindBy(xpath = "(//input[@type='number'])[1]") private WebElement pincodeField;
	
	@FindBy(xpath = "(//input[@type='number'])[2]") private WebElement mobileField;
	
	@FindBy(xpath = "//div[@class='next-btn']") private WebElement continueButton;
	//div[@class='next-btn']
	
	
	public CoverFoxAddressDetails(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}
	
	public void fillPinCodeField(String pincode)
	{
		pincodeField.sendKeys(pincode);
	}
	
	public void fillmobileField(String mobileNo)
	{
		mobileField.sendKeys(mobileNo);
	} 
	
	public void clickOnContinueutton()
	{
		continueButton.click();
	}
 


}

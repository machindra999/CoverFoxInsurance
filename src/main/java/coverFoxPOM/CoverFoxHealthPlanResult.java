package coverFoxPOM;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CoverFoxHealthPlanResult {
	
	@FindBy(xpath = "(//div[@class='filter-sec'])[3]//div[@class='fc-filter-val']") private WebElement brandFilter;
	
	@FindBy(xpath = "//div[contains(text(),'matching Health')]") private WebElement result;
	
	@FindBy(id = "plans-list")private List<WebElement> totalResult;
	
	public CoverFoxHealthPlanResult(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public int availableResultFromText() {
		
//		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(5));
//		wait.until(ExpectedConditions.visibilityOf(result));
		String searchResult = result.getText();
		String arr[] = searchResult.split(" ");
		String searchResultString= arr[0];
		
		int searchResultInt = Integer.parseInt(searchResultString);
		return searchResultInt;
		
	}
	
	public int availableNumberFromBanner()   {
		
		int totalResultCount = totalResult.size();
		return totalResultCount;
	}

}

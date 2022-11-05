package core.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.generic.TestBase;

public class ProductionListingPage extends TestBase {
	
	@FindBy(xpath="//*[@class='col col-title']") 
	WebElement Listing;

	public ProductionListingPage()
	{
		PageFactory.initElements(driver, this);
	}
		
	public String products(){
		return Listing.getText();
	}
	
}

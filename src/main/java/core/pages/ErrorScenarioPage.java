package core.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.generic.TestBase;

public class ErrorScenarioPage extends TestBase{

	@FindBy(xpath="//*[text()='New Product']") 
	WebElement newErrorProduct;

	@FindBy(xpath="(//*[@class='inline-errors'])[1]") 
	WebElement Error_Title;
	
	@FindBy(xpath="(//*[@class='inline-errors'])[2]") 
	WebElement Error_SKU;
	
	@FindBy(xpath="(//*[@class='inline-errors'])[3]") 
	WebElement Error_Description;
	
	@FindBy(xpath="//input[@value='Create Product']") 
	WebElement CreateProduct;
	
	public ErrorScenarioPage()
	{
		PageFactory.initElements(driver, this);
	}

	
	public void newProduct(){
		newErrorProduct.click();		
	}

	public String createProduct(){
		CreateProduct.click();
		return Error_Title.getText();
	}
	
	public String errorSKU(){
		return Error_SKU.getText();
	}
	
	public String errorDescription(){
		return Error_Description.getText();
	}
	
}

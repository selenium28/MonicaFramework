package core.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.generic.TestBase;

public class ProductCreationPage extends TestBase{
	
	@FindBy(xpath="//input[@id='product_title']") 
	WebElement Title_Text;
	
	@FindBy(xpath="//input[@id='product_sku']") 
	WebElement SKU_Text;
	
	@FindBy(xpath="//input[@id='product_description']") 
	WebElement Description_text;
	
	@FindBy(xpath="//input[@value='Create Product']") 
	WebElement CreateProduct;
	
	public ProductCreationPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void titleText(String titletext){
		Title_Text.sendKeys(titletext);
	}
	
	public void skuText(String skutext){
		SKU_Text.sendKeys(skutext);
	}
	
	public void description(String description){
		Description_text.sendKeys(description);
	}
	
	public void createProduct(){
		CreateProduct.click();
	}

}

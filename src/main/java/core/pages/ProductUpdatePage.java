package core.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.generic.TestBase;

public class ProductUpdatePage extends TestBase{
	
	@FindBy(xpath="(//*[text()='Edit'])[1]") 
	WebElement Edit_Product;
	
	@FindBy(xpath="//input[@id='product_title']") 
	WebElement Title_Text;
	
	@FindBy(xpath="//input[@id='product_sku']") 
	WebElement SKU_Text;
	
	@FindBy(xpath="//input[@id='product_description']") 
	WebElement Description_text;
	
	@FindBy(xpath="//input[@value='Update Product']") 
	WebElement UpdateProduct;
	
	public ProductUpdatePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void editProduct(){
		Edit_Product.click();
	}
	
	public void titleText(String updatetitletext){
		Title_Text.sendKeys(updatetitletext);
	}
	
	public void skuText(String updateskutext){
		SKU_Text.sendKeys(updateskutext);
	}
	
	public void description(String updatedescription){
		Description_text.sendKeys(updatedescription);
	}
	
	public void updateProduct(){
		UpdateProduct.click();
	}

}

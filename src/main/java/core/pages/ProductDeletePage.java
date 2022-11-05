package core.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.generic.TestBase;

public class ProductDeletePage extends TestBase{

	@FindBy(xpath="(//*[text()='Delete'])[1]") 
	WebElement DeleteProduct;
	
	@FindBy(xpath="//*[text()='Product was successfully destroyed.']") 
	WebElement DeleteProduct_Successfully;
	
	public ProductDeletePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String deleteProduct(){
		DeleteProduct.click();
		driver.switchTo().alert().accept();
		return DeleteProduct_Successfully.getText();
	}
	
}

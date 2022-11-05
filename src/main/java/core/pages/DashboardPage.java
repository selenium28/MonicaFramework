package core.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.generic.TestBase;

public class DashboardPage extends TestBase{
	
	@FindBy(xpath="//a[text()='Products']") 
	WebElement Products;
	
	@FindBy(xpath="//*[text()='New Product']") 
	WebElement CreateProduct;
	
	public DashboardPage()
	{
		PageFactory.initElements(driver, this);
	}
		
	public void products(){
		Products.click();
	}
	
	public void createProduct(){
		CreateProduct.click();
	}

}

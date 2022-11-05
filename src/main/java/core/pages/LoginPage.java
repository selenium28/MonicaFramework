package core.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.generic.TestBase;

public class LoginPage extends TestBase{
	
	
	@FindBy(xpath="//input[@name='username']")
	WebElement Email;
	
	@FindBy(xpath="//input[@name='password']") 
	WebElement Password;
	
	@FindBy(xpath="//button[@type='submit']") 
	WebElement Login_Button;
	
	@FindBy(xpath="//*[text()='Signed in successfully.']") 
	WebElement Login_Successful;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void enterEmail(String username){
		Email.sendKeys(username);
	}
	
	public void enterPassword(String password){
		Password.sendKeys(password);
	}
	
	public String clickLogin(){
		Login_Button.click();
		return Login_Successful.getText();
	}
	
	public void verifySuccessfulMessage(){
		Login_Successful.click();	
	}

}

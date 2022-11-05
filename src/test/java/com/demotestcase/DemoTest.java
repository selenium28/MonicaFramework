package com.demotestcase;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import core.generic.TestBase;
import core.pages.DashboardPage;
import core.pages.ErrorScenarioPage;
import core.pages.LoginPage;
import core.pages.ProductCreationPage;
import core.pages.ProductDeletePage;
import core.pages.ProductUpdatePage;
import core.pages.ProductionListingPage;

public class DemoTest extends TestBase{

	LoginPage objLoginPage;
	DashboardPage objDashboardPage;
	ProductCreationPage objProductCreationPage;
	ProductionListingPage objProductionListingPage;
	ProductUpdatePage objProductUpdatePage;
	ProductDeletePage objProductDeletePage;	
	ErrorScenarioPage objErrorScenarioPage;

	String titletext = null;

	@BeforeTest
	public void setup() throws FileNotFoundException, IOException{
		setUp();
	}

	@Test
	public void loginTest()
	{
		String username = "admin@example.com";
		String password = "password";

		objLoginPage = new LoginPage();
		objLoginPage.enterEmail(username);
		objLoginPage.enterPassword(password);
//		String successMessage = objLoginPage.clickLogin();
//		Assert.assertEquals(successMessage,"Signed in successfully.", "Loggin Successfully");
	}

//	@Test
	public void createProductTest()
	{

		objDashboardPage = new DashboardPage();
		objDashboardPage.products();
		objDashboardPage.createProduct();
		titletext = "Demo Title Test1";
		String skutext = "Demo SKU1";
		String description = "Demo Description1";

		objProductCreationPage = new ProductCreationPage();
		objProductCreationPage.titleText(titletext);
		objProductCreationPage.skuText(skutext);
		objProductCreationPage.description(description);
		objProductCreationPage.createProduct();

	}

//	@Test
	public void listProductTest()
	{
		objProductionListingPage = new ProductionListingPage();
		objDashboardPage = new DashboardPage();
		objDashboardPage.products();
		String listingProductName = objProductionListingPage.products();
		Assert.assertEquals(listingProductName,"Demo Title Test1", "Product Listed Successfully");

	}

//	@Test
	public void updateProduct()
	{
		String updatetitletext = "Updated Product Title";
		String updateskutext = "Updated SKU";
		String updatedescription = "Updated Description";

		objProductUpdatePage = new ProductUpdatePage();
		objProductUpdatePage.editProduct();
		objProductUpdatePage.titleText(updatetitletext);
		objProductUpdatePage.skuText(updateskutext);
		objProductUpdatePage.description(updatedescription);
		objProductUpdatePage.updateProduct();
		objDashboardPage = new DashboardPage();
		objDashboardPage.products();
	}

//	@Test
	public void deleteTest()
	{
		objProductDeletePage = new ProductDeletePage();
		String detelesuccessful = objProductDeletePage.deleteProduct();
		Assert.assertEquals(detelesuccessful, "Product was successfully destroyed.","Product delete Successfully");

	}

//	@Test
	public void errorScenario()
	{
		objErrorScenarioPage = new ErrorScenarioPage();
		objErrorScenarioPage.newProduct();
		String errorTitle = objErrorScenarioPage.createProduct();
		Assert.assertEquals(errorTitle, "can't be blank","Error Message Displayed");
		String errorSKU =  objErrorScenarioPage.errorSKU();
		Assert.assertEquals(errorSKU, "can't be blank","Error Message Displayed");
		String errorDescription =  objErrorScenarioPage.errorSKU();
		Assert.assertEquals(errorDescription, "can't be blank","Error Message Displayed");
	}
	
	@AfterTest
	public void teardown(){
		tearDown();
//		public static void main(String[] args) {
//			System.setProperty("webdriver.chrome.driver","E:\\Class\\Plugins\\chromedriver_win32\\chromedriver.exe");
//			WebDriver driver = new ChromeDriver();
//		      String url = " https://www.tutorialspoint.com/questions/index.php";
//		      driver.get(url);
//
//		}

	}

}

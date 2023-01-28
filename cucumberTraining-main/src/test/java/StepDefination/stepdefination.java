package StepDefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import PageObject.loginPage;
import PageObject.customerPage;
import Utilities.BrowserManager;
import io.cucumber.java.en.*;

public class stepdefination {

	WebDriver driver;
	public loginPage loginPg;
	public customerPage customerPage;
	@Given("User launch Chrome Browser")
	public void user_launch_chrome_browser() {
		BrowserManager.setDriver("Chrome");
		driver=BrowserManager.getDriver();
		loginPg=new loginPage(driver);
		customerPage=new customerPage(driver);
	}

	@When("User opens URL {string}")
	public void user_opens_url(String url) {
		driver.get(url);
	}

	@When("User Enters Email as {string} and password as {string}")
	public void user_enters_email_as_and_password_as(String email, String password) {
		loginPg.enterEmail(email);
		loginPg.enterpass(password);
	}
	@When("Click on login button")
	public void click_on_login_button() {
		loginPg.clickOnLoginButton();
	}

	@Then("the page tittle is {string}")
	public void the_page_tittle_is(String expectedTitle) {
		String actualTitle=driver.getTitle();
		System.out.println("This is actual title "+actualTitle);
		if(actualTitle.equals(expectedTitle)) {
			Assert.assertTrue(true);

		}
		else 
		{
			Assert.assertFalse(false);
		}
	}

	@When("User clicks on logout")
	public void user_clicks_on_logout() {
		loginPg.clickOnLogoutButton();
	}



	@Then("Close browser")
	public void close_browser() {
		driver.quit();
	}

//////////////////////////////////////////////////////////ADDING NEW CUSTOMER////////////////////////////////////////////////////////
	
	
	
	@Then("User can view Dashbaord")
	public void user_can_view_dashbaord() {
		customerPage.userCanViewDashboard();
	}

	@When("User click on customers menu")
	public void user_click_on_customers_menu() {
	    customerPage.user_Can_Click_CustomerMenu();
	}

	@When("Click on customers tab")
	public void click_on_customers_tab() {
	   customerPage.user_Click_CustomersTab();
	}

	@When("Click on Add new button")
	public void click_on_add_new_button() {
		customerPage.click_on_add_new_button();
	    
	}

	@Then("User can view Add new customer page")
	public void user_can_view_add_new_customer_page() {
	   customerPage.user_Can_view_AddNewCustomerPage();
	}

	@When("User Enters customer info")
	public void user_enters_customer_info() {
	   customerPage.User_Enters_customer_info();
	}

	@When("Click on save button")
	public void click_on_save_button() {
	 customerPage.user_ClickOnSaveBtn();
	}

	@Then("User can view confirmation message {string}")
	public void user_can_view_confirmation_message(String expectedResult) {
	   String bodyTagText=driver.findElement(By.tagName("Body")).getText();
	   if(bodyTagText.contains(expectedResult)) {
		   Assert.assertTrue(true);
	   }
	   else {
		   Assert.assertFalse(false);
	   }
	}

}



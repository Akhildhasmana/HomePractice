package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {

	WebDriver ldriver;

	public loginPage(WebDriver rdriver ) {
		ldriver=rdriver;

		PageFactory.initElements(rdriver, this);
	}

	@FindBy(id="Email")
	WebElement email;
	@FindBy(id="Password")
	WebElement Password;
	@FindBy(xpath="//button[@class='button-1 login-button']")
	WebElement loginBtn;
	@FindBy(xpath="//a[@href='/logout']")
	WebElement logoutBtn;


	public void enterEmail(String emailAdd) {
		email.clear();
		email.sendKeys(emailAdd);
	}

	public void enterpass(String pwd) {
		Password.clear();
		Password.sendKeys(pwd);
	}

	public void clickOnLoginButton() {
		loginBtn.click();
	}
	public void clickOnLogoutButton() {
		logoutBtn.click();
	}   

}

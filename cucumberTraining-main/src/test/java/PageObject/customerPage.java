package PageObject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class customerPage {

	WebDriver driver;

	public customerPage(WebDriver rdriver ) {
		driver=rdriver;

		PageFactory.initElements(rdriver, this);
	}

	@FindBy(id="Email")
	WebElement email;
	@FindBy(id="Password")
	WebElement Password;
	@FindBy(id="FirstName")
	WebElement Fname;
	@FindBy(id="LastName")
	WebElement Lname;
	
	
	public void userCanViewDashboard() {
		
		WebElement dashBoardIcon=driver.findElement(By.xpath("//p[normalize-space()='Dashboard']"));
		String dashboardText=dashBoardIcon.getText();
		 Assert.assertEquals("Dashboard",dashboardText);

    }
	
	public void user_Can_Click_CustomerMenu() {
		
		WebElement customerMenu=driver.findElement(By.xpath("//a[@href='#']//p[contains(text(),'Customers')]"));
		customerMenu.click();
	}
	
	public void  user_Click_CustomersTab() {
	WebElement customerMenu=driver.findElement(By.xpath("//a[@href='/Admin/Customer/List']//p[contains(text(),'Customers')]"));
	customerMenu.click();
}
   public void click_on_add_new_button() {
	   WebElement addNewBtn=driver.findElement(By.cssSelector("a.btn.btn-primary"));
	   addNewBtn.click();
   }

     public void user_Can_view_AddNewCustomerPage() {
     WebElement AddNewCustomerText=driver.findElement(By.xpath("//div[@class='card-title']"));
     String AddNew=AddNewCustomerText.getText();
     Assert.assertEquals("Customer info",AddNew);
     
     }
     
     public void User_Enters_customer_info() {
    	 
    	 email.sendKeys("akhildhasmana45@yopmail.com");
    	 Password.sendKeys("akhil@123");
    	 Fname.sendKeys("akhil");
    	 Lname.sendKeys("dhasmana");
    	 
    	 
     }
     
     public void user_ClickOnSaveBtn() {
    	 driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[1]")).click();
    	 
     }
     
//     public void user_Gets_ConfirmationMessage() {
//    	 WebElement successMessage=driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissable']"));
//    	Assert.assertEquals("The new customer has been added successfully.",successMessage.getText());
//     }
     
}
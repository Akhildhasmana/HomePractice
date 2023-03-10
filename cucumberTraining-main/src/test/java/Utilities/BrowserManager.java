package Utilities;




import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserManager {

	public  static WebDriver webdriver;
	public static WebDriver setDriver(String browser) {

		if (browser.equals("Chrome")) {
			System.out.println("inside chrome");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-extensions");
			options.addArguments("--start-maximized");
			options.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));
			//new String[] {"enable-automation"}
			webdriver = new ChromeDriver(options);

		} else if (browser.equals("Firefox"))
		{

			webdriver = new FirefoxDriver();
		} 
		else if (browser.equals("Edge")) 
		{
			webdriver = new EdgeDriver();
		}//a[normalize-space()='Selenium - Quick Guide']
		return webdriver;

	}
	public static void nav(String url) throws InterruptedException
	{

		webdriver.get(url);




	}
	public static  WebDriver implicit() {
		webdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		return webdriver;
	}
	public static  WebElement explicit(String path)  {
		WebDriverWait wait2=new WebDriverWait(getDriver(),Duration.ofSeconds(10));
		WebElement execute=webdriver.findElement(By.xpath(path));
		wait2.until(ExpectedConditions.elementToBeClickable(By.xpath(path)));

		execute.click();
		return execute;

	}






	public  static WebDriver getDriver() {
		// TODO Auto-generated method stub
		return webdriver;
	}
	public static void close() {
		webdriver.close();
	}



}

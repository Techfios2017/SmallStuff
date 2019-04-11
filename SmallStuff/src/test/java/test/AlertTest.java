package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;import org.testng.annotations.Test;

import page.Alertpage;
import page.Iframepage;
import util.BrowserFactory;

public class AlertTest {
	
	@Test
	public void Mousehover(){
		
	WebDriver driver = BrowserFactory.startBrowser("chrome", "http://demo.guru99.com/test/delete_customer.php");	
		
	driver.manage().window().maximize();
	
	Alertpage alert= PageFactory.initElements(driver, Alertpage.class);
	
	alert.DeletingACustomer("1234");	

	driver.close();

	driver.quit();

}
}

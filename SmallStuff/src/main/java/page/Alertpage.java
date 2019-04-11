package page;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Alertpage {
	
	WebDriver driver;

	public Alertpage (WebDriver ldriver){
		this.driver=ldriver;
	}
	
	@FindBy(how=How.NAME,using="cusid")
	WebElement CustomerID;
	
	@FindBy(how=How.NAME,using="submit")
	WebElement SubmitButton;
	
	public void DeletingACustomer(String customer){
		
	CustomerID.sendKeys(customer);
	SubmitButton.click();
	//for alert
	Alert alert=driver.switchTo().alert();
	alert.accept();
	alert.accept();	
		
	}


}

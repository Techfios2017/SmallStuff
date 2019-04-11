package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Iframepage {

	WebDriver driver;

	public Iframepage (WebDriver ldriver){
		this.driver=ldriver;
	}

	@FindBy(how=How.NAME,using="firstname")
	WebElement FirstFrameName;
	
	
	@FindBy(how=How.ID,using="sex-0")
	WebElement FirstFrameMalegender;
	
	@FindBy(how=How.XPATH,using="//a[contains(text(),'Sortable')]")
	WebElement SecondFrameSortable;
	
	
	public void fillupfirstframe(String name){
		
	driver.switchTo().frame("iframe1");
	FirstFrameName.sendKeys(name);
	FirstFrameMalegender.click();	
		
	}
	
	public void InteractWithSecondFrameSortable() throws InterruptedException{
		
	driver.switchTo().frame("iframe2");
	
	//Thread sleep
	
	Thread.sleep(4000);
	
	
	//Explicit wait
	
	WebDriverWait wait=new WebDriverWait(driver,20);
	wait.until(ExpectedConditions.visibilityOf(SecondFrameSortable));	
	
	SecondFrameSortable.click();	
	
	}

	
}

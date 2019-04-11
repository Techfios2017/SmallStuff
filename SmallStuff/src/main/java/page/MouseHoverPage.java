package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MouseHoverPage {
	
	WebDriver driver;

	public MouseHoverPage (WebDriver ldriver){
		this.driver=ldriver;
	}
	

	@FindBy(how=How.XPATH,using="//div[@class='menuHead'][contains(text(),'Search Engine')]")
	WebElement SearchEngine ;
	
	@FindBy(how=How.XPATH,using=".//*[@id='menu1choices']/a[1]")
	WebElement GoogleLink;
	
	public void NavigateToGoogleLink(){
		
	Actions actions= new Actions(driver);
	
	actions.moveToElement(SearchEngine).moveToElement(GoogleLink).click().perform();
		
	}
	
}

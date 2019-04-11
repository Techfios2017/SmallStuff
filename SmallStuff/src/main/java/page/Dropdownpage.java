package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class Dropdownpage {
	
WebDriver driver;

public Dropdownpage (WebDriver ldriver){
	this.driver=ldriver;
}

@FindBy(how=How.NAME,using="country")
WebElement countrydropdown;


public void SelectCountry(String value){
	
Select country= new Select(countrydropdown);
country.selectByVisibleText(value);

}


}

package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.Dropdownpage;
import util.BrowserFactory;

public class DropDownTest {
	
@Test
public void Dropdown(){
	
WebDriver driver = BrowserFactory.startBrowser("chrome", "http://demo.guru99.com/test/newtours/register.php");	
	
driver.manage().window().maximize();

Dropdownpage dropdown= PageFactory.initElements(driver, Dropdownpage.class);

dropdown.SelectCountry("CHILE");

driver.close();

driver.quit();

}

 

}

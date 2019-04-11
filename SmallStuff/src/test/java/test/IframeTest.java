package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.Dropdownpage;
import page.Iframepage;
import util.BrowserFactory;

public class IframeTest {
	
	@Test
	public void Iframe() throws InterruptedException{
		
	WebDriver driver = BrowserFactory.startBrowser("chrome", "https://www.toolsqa.com/iframe-practice-page/");	
		
	driver.manage().window().maximize();

	Iframepage frame= PageFactory.initElements(driver, Iframepage.class);

	frame.fillupfirstframe("John");
	
	frame.InteractWithSecondFrameSortable();

	driver.close();

	driver.quit();

	}

}

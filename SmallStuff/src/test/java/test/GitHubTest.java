package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import util.BrowserFactory;

public class GitHubTest {
	
	@Test
	public void titletest(){
		
	WebDriver driver = BrowserFactory.startBrowser("chrome", "https://www.amazon.com/");	
	
	String actualtitle=driver.getTitle();
	
	System.out.println(actualtitle);

}
}

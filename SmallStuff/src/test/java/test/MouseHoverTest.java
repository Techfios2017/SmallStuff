package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import page.MouseHoverPage;
import util.BrowserFactory;

public class MouseHoverTest {
	
	@Test
	public void Mousehover(){
		
	WebDriver driver = BrowserFactory.startBrowser("chrome", "http://only-testing-blog.blogspot.com/p/mouse-hover.html");	
		
	driver.manage().window().maximize();
	
	MouseHoverPage hover=PageFactory.initElements(driver, MouseHoverPage.class);
	
	hover.NavigateToGoogleLink();

	driver.close();

	driver.quit();

	}
}

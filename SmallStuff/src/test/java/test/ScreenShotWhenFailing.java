package test;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.LoginPage;
import util.BrowserFactory;

public class ScreenShotWhenFailing {

public WebDriver driver;
	
	
	@Test
	public void TechfiosLoginTest()throws Exception{
	
try{
		
	
	WebDriver driver = BrowserFactory.startBrowser("chrome", "http://echfios.com/test/billing/?ng=login/");	
	
	LoginPage logintotechfios= PageFactory.initElements(driver, LoginPage.class);

	logintotechfios.Login("techfiosdemo@gmail.com", "bc123");

	driver.close();

	driver.quit();
		
}
catch(Exception e){
  File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(screenshotFile, new File("D:\\SoftwareTesting.png"));}			
	
	}


}

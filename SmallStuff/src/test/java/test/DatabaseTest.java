package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.LoginPage;
import util.BrowserFactory;

public class DatabaseTest {
	
	@Test
	public void database() throws ClassNotFoundException, SQLException{
		
		
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("driver loaded");
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/selenium","root","Bangladesh123");
		System.out.println("connected to DB");
		Statement smt =con.createStatement();
		ResultSet rs=smt.executeQuery("select * from seleniumuser");
		
		while(rs.next())
			
		{
			
			String firstname=rs.getString("firstname");
			String emailadress=rs.getString("email");
		
			System.out.println(firstname);
			
			System.out.println(emailadress);
			WebDriver driver = BrowserFactory.startBrowser("chrome", "http://techfios.com/test/billing/?ng=login/");	
			
			LoginPage logintotechfios= PageFactory.initElements(driver, LoginPage.class);

			logintotechfios.Login(firstname, emailadress);

			driver.close();

			driver.quit();
			
			
		}
	}
}

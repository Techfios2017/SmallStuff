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


public class TechfiosDatabaseTest {
	
@Test
public void TechfiosDatabaselogin() throws ClassNotFoundException, SQLException{
	
Class.forName("com.mysql.jdbc.Driver");
System.out.println("jdbc loaded");
Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/TechfiosWebsite", "root", "Bangladesh123");
System.out.println("connection worked");
Statement smt=con.createStatement();
ResultSet rs=smt.executeQuery("select * from spring");


while(rs.next())
{

String Email=rs.getString("email");
String password=rs.getString("password");

System.out.println(Email +" "+ password);

WebDriver driver = BrowserFactory.startBrowser("chrome", "http://techfios.com/test/billing/?ng=login/");	

LoginPage logintotechfios= PageFactory.initElements(driver, LoginPage.class);

logintotechfios.Login(Email,password);

driver.close();

driver.quit();


}


	
	
	
	
	
	
}

}

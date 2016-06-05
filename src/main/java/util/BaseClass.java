package util;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import tests.LoginTest;

public class BaseClass {
	
	public static WebDriver driver;
	public static CommanUtil commonUtil;
	public static LoginTest login;
	
	
	@BeforeClass
	public static void setUp(){
		driver = new FirefoxDriver();
		commonUtil = new CommanUtil(driver);
		login = new LoginTest();
	}
	
	

}

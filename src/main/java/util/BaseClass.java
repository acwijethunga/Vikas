package util;

import java.util.logging.Logger;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import tests.LoginTest;

public class BaseClass {
	
	public static WebDriver driver;
	public static CommanUtil commonUtil;
	public static LoginTest login;
	
	private static Logger log  = Logger.getLogger(BaseClass.class.getSimpleName());
	
	@BeforeClass
	public static void setUp(){
		driver = new FirefoxDriver();
		commonUtil = new CommanUtil(driver);
		login = new LoginTest();
		log.info("this is baseclass");
	}
	
	

}

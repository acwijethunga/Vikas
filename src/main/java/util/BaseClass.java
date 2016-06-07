package util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Logger;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageObject.LoginPgObj;
import tests.LoginTest;

public class BaseClass {
	
	public static WebDriver driver;
	public static CommanUtil commonUtil;
	public static LoginTest login;
	public static LoginPgObj loginPgObj;
	public static String url=null;
	private static Logger log  = Logger.getLogger(BaseClass.class.getSimpleName());
	
	@BeforeClass
	public static void setUp(){
		driver = new FirefoxDriver();
		commonUtil = new CommanUtil(driver);
		login = new LoginTest();
		loginPgObj =new LoginPgObj(driver);
		log.info("this is baseclass");
		
				

		commonUtil.getUrl(commonUtil.setUrl("url"));

	}
	
	

}

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
		
		String url=null;
		
			BufferedReader br = null;

			try {

				String sCurrentLine;

				br = new BufferedReader(new FileReader(".//TestData//url.txt"));

				while ((sCurrentLine = br.readLine()) != null) {
					String[] urls =  sCurrentLine.split("=");
					if(urls[0].equals("url"));
						url=urls[1];
				}

			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					if (br != null)br.close();
				} catch (IOException ex) {
					ex.printStackTrace();
				}
			}
		

		commonUtil.getUrl(url);

	}
	
	

}

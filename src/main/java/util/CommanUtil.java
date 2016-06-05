package util;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class CommanUtil {
private	WebDriver driver;
	
	public CommanUtil(WebDriver driver) {
		super();
		this.driver = driver;
	}
	public void getUrl(String url){
		driver.get(url);
	}

	public void pageVrify(String exptTitle){
		String title = driver.getTitle();
		Assert.assertEquals("Page Title Assertion", exptTitle, title);
		
	}

}

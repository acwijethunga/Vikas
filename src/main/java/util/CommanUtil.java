package util;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommanUtil {
private	WebDriver driver;
private WebElement webelement;
	
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
	
	public void select(String text, By element){
		webelement = driver.findElement(element);
		webelement.sendKeys();
	}
	public void click( By element){
		webelement = driver.findElement(element);
		webelement.click();
	}

}

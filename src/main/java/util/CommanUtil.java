package util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

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
	public String setUrl(String Name){
		String url=null;
		
		BufferedReader br = null;

		try {

			String sCurrentLine;

			br = new BufferedReader(new FileReader(".//TestData//url.txt"));

			while ((sCurrentLine = br.readLine()) != null) {
				String[] urls =  sCurrentLine.split("=");
				if(urls[0].equals(Name));
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
		return url;
	}

}

package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPgObj {
	WebDriver driver;

	public LoginPgObj(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public By cuntryDrpDwn = By.xpath(".//*[@id='countryDropDown_msdd']/div[1]/span[2]");
	public By explorebtn = By.id("btnExplore");
	public By cuntry = By.xpath(".//*[@id='countryDropDown_child']/ul/li[18]/span");
	
	

}

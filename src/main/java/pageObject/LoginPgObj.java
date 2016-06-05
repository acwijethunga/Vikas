package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPgObj {
	WebDriver driver;

	public LoginPgObj(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public By cuntryDrpDwn = By.id("countryDropDown_title");
	
	

}

package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.BaseClass;

public class LoginTest extends BaseClass {
	
	@Test
	public void verfyTab() throws InterruptedException{
		commonUtil.pageVrify("Select Your Country");
		commonUtil.click(loginPgObj.cuntryDrpDwn);
		Thread.sleep(1000);
		commonUtil.select("Singapore", loginPgObj.cuntryDrpDwn);
		commonUtil.click(loginPgObj.cuntry);
		
	}
	@Test
	public void verifyExploreBtn() throws Exception{
		Thread.sleep(2000);
		commonUtil.click(loginPgObj.explorebtn);
		
	}
	
	
}



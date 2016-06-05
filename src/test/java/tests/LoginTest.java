package tests;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import util.BaseClass;

public class LoginTest extends BaseClass {
	
	 

	@Before
	public void pageOpen(){
		commonUtil.getUrl("https://www.srilankan.com/");
		
	}
	@Test
	public void verfyTab(){
		commonUtil.pageVrify("Select Your Country");
	}
	
	
	}

}

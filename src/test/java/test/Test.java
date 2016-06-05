package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import tests.LoginTest;
import tests.Welcome;




@RunWith(Suite.class)
@Suite.SuiteClasses({
	LoginTest.class,Welcome.class
})
public class Test {
	
	
	
	

}

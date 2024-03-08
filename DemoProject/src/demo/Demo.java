package demo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {

	@Test
	public void openBrowser() {
		Reporter.log("Browser Opened", true);
	}
	
	@Test(enabled = false)
	public void login() {
		Reporter.log("Logged in", true);
	}
	
	@Test
	public void register() {
		Reporter.log("Registered", true);
	}
	
}

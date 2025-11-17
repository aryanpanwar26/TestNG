package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class testngex11 {
	private static int var = 0;
	
	@Test(retryAnalyzer = IRetryClass.class)
	public void login() {
		var++;
		System.out.println("LoginTest");
		if(var<3) {
			Assert.assertTrue(false);
		}
	}
}

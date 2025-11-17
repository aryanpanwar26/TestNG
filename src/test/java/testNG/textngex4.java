package testNG;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class textngex4 {
	
	@Test(dependsOnMethods= {"loginTest"})
	public void paymentTest() {
		System.out.println("PaymentTest");
	}
	@Test
	public void loginTest() {
		System.out.println("LoginTest");
		Assert.assertTrue(false);
	}
}

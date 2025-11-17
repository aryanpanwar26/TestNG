package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class testngex10 {
	@Test
	public void PaymentTest() {
		System.out.println("PaymentMethod");
	}
	@Test
	public void LoginTest() {
		System.out.println("LoginMethod");
		Assert.assertTrue(false);
	}
	@Test
	public void BilingTest() {
		System.out.println("BilingMethod");
	}
	@Test
	public void RegistrationTest() {
		System.out.println("RegistrationMethod");
	}
}

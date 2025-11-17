package testNG;

import org.testng.annotations.Test;

public class textngex3 {
	
	@Test(priority=3)
	public void PaymentTest() {
		System.out.println("PaymentMethod");
	}
	@Test(priority=0)
	public void LoginTest() {
		System.out.println("LoginMethod");
	}
	@Test(priority=2)
	public void BilingTest() {
		System.out.println("BilingMethod");
	}
	@Test(priority=1)
	public void RegistrationTest() {
		System.out.println("RegistrationMethod");
	}
}

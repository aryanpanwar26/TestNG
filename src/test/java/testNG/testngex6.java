package testNG;

import org.testng.annotations.Test;

public class testngex6 {
	@Test(groups={"sanity"})
	public void PaymentTest() {
		System.out.println("PaymentMethod");
	}
	@Test(groups={"smoke"})
	public void LoginTest() {
		System.out.println("LoginMethod");
	}
	@Test(groups={"sanity"})
	public void BilingTest() {
		System.out.println("BilingMethod");
	}
	@Test(groups={"smoke.Regression"})
	public void RegistrationTest() {
		System.out.println("RegistrationMethod");
	}
}

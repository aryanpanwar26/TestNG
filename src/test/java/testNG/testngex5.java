package testNG;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(testnglistenerex1.class)
public class testngex5 {
	
//	@Test(invocationCount=5)
//	public void paymentTest() {
//		System.out.println("PaymentTest");
//	}
	
	@Test(enabled=false)
	public void paymentTest() {
		System.out.println("PaymentTest");
	}
	
	@Test(expectedExceptions=ArithmeticException.class)
	public void BilingTest() throws InterruptedException{
		System.out.println("BilingTest");
		Thread.sleep(3000);
	}
	
	
//	@Test(timeOut=2000)
//	public void BilingTest() throws InterruptedException{
//		System.out.println("BilingTest");
//		Thread.sleep(3000);
//	}
}

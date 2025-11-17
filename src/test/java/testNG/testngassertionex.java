package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class testngassertionex {
	
	@Test
	public void login() {
//		System.out.println("LoginTest");
//		Assert.assertEquals(true, true);
//		Assert.assertTrue(false);
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationbykrishna.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.id("basicelements"));
		Assert.assertTrue(element.isDisplayed());
		Assert.assertEquals(driver.getTitle(), "Login Signup Demo");
		driver.close();
	}
}

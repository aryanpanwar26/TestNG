package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;

public class testngsoftassertionex1 {
	
	@Test
	public void login() {	
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationbykrishna.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.id("basicelements"));
		SoftAssert soft = new SoftAssert();
		soft.assertTrue(false);
		soft.assertAll();
	//	soft.assertTrue(element.isDisplayed());
		driver.quit();
	}
}

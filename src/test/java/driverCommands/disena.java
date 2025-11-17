package driverCommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class disena {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationbykrishna.com/");
		WebElement registrationlink = driver.findElement(By.id("registration2"));
		registrationlink.click();
		//Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait((Duration.ofSeconds(5)));
		WebElement userName = driver.findElement(By.id("unameSignin"));
		if(userName.isDisplayed() && userName.isEnabled()) {
			userName.sendKeys("asfafaf");
		}
		Thread.sleep(1000);
		userName.clear();
		//driver.close();
		
		
		
		//implicit wait, explicit wait and fluent wait.
		
	}

}

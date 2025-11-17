package driverCommands;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertex1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationbykrishna.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		WebElement e1 = driver.findElement(By.id("basicelements"));
		e1.click();
		WebElement e2 = driver.findElement(By.id("UserFirstName"));
		e2.sendKeys("example");
		Thread.sleep(1000);
		WebElement e3 = driver.findElement(By.id("UserLastName"));
		e3.sendKeys("password");
		Thread.sleep(1000);
		WebElement e4 = driver.findElement(By.id("UserCompanyName"));
		e4.sendKeys("abc");
		Thread.sleep(1000);
		
		WebElement e5 = driver.findElement(By.cssSelector("button[onclick='myFunctionPopUp()']"));
		Thread.sleep(1000);
		e5.click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		Thread.sleep(3000);
		
		driver.quit();
		
	}

}

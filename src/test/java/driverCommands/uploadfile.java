package driverCommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class uploadfile {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationbykrishna.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("[id='basicelements']")).click();
		Thread.sleep(1000);
		WebElement a = driver.findElement(By.id("exampleInputFile"));
		a.sendKeys("C:\\Users\\arypanwa\\eclipse-workspace\\123\\src\\test\\java\\driverCommands\\text.txt");
		
		//autoID and robot class
		
	}

}

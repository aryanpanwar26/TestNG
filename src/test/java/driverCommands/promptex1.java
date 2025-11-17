package driverCommands;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class promptex1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationbykrishna.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("[id='basicelements']")).click();
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		

		WebElement a = driver.findElement(By.cssSelector("[id='javascriptPromp'"));
		//js.executeScript("arguments[0].scrollIntoView()", a);
		js.executeScript("window.scrollTo(0, 500)");
		a.click();
		Thread.sleep(1000);
		Alert alt = driver.switchTo().alert();
		String s = "yohohoho";
		alt.sendKeys(s);
		alt.accept();
		
		Thread.sleep(5000);
		String e3 = driver.findElement(By.cssSelector("[id='pgraphdemo']")).getText();
		if(e3.equals("Hello " + s + "! How are you today?")) {
			System.out.println("success");
		}
		else {
			System.out.println("failed");
		}
		Thread.sleep(5000);
		
		
		driver.close();
		
	}

}

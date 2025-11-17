package driverCommands;

import java.awt.TextArea;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webdriverex2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromiumdriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/");
		
//		WebElement registration  = driver.findElement(By.id("registration2"));
//		WebElement registration  = driver.findElement(By.linkText("Registration"));
	//	WebElement registration  = driver.findElement(By.partialLinkText("Regis"));
		WebElement registration  = driver.findElement(By.xpath("(//div[@class='card mt-4 top-card'])[1]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", registration);
		WebElement box = driver.findElement(By.id("item-0"));
		box.click();
		Thread.sleep(2000);
		WebElement textBox1  = driver.findElement(By.xpath("//*[@id='userName']"));
		textBox1.sendKeys("username");
		WebElement textBox2  = driver.findElement(By.xpath("//*[@id='userEmail']"));
		textBox2.sendKeys("aryan@gmail.com");
		WebElement textBox3  = driver.findElement(By.xpath("//*[@id='currentAddress']"));
		js.executeScript("arguments[0].value= arguments[1]", textBox3, "chinchwad");
		WebElement textBox4  = driver.findElement(By.xpath("//*[@id='permanentAddress']"));
		textBox4.sendKeys("UP");
		Thread.sleep(2000);
		WebElement submit  = driver.findElement(By.xpath("//*[@id=\"submit\"]"));
		js.executeScript("arguments[0].click()", submit);
		
		
		WebElement name = driver.findElement(By.id("name"));
		if("Name:username".equals(name.getText())) {
			System.out.println("Name Matched!");
		}
		else {
			System.out.println("Name not Matched!");
		}
//		WebElement textBox3  = driver.findElement(By.name("fName"));
//		textBox3.sendKeys("Aryan");
		
//		WebElement textBox3  = driver.findElement(By.className("form-control"));
//		textBox3.sendKeys("Aryan");
	}

}

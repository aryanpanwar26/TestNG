package driverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.*;
public class example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationbykrishna.com/");
		
		List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
		System.out.println(alllinks.size());
		driver.manage().timeouts().implicitlyWait((Duration.ofSeconds(5)));
		for(WebElement ele:alllinks) {
			System.out.println(ele.getAttribute("href") + " " + ele.getAttribute("innerText").trim());
		}
		//driver.close();
		
	}

}

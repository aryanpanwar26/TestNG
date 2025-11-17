package driverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TOI2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromiumdriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("https://timesofindia.indiatimes.com/");
		WebElement get2  = driver.findElement(By.xpath("//div[@class='UHNLR']/ul/li[2]/a"));
		System.out.println(get2.getText());
	}

}

package driverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class timesofindia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromiumdriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("https://timesofindia.indiatimes.com/");
		//WebElement get  = driver.findElement(By.xpath("//div[@class='QW5wt LWsUK speculationContainer']/section[@class='I1dVQ']/ul/li[1]//div[@class='CRKrj style_change edCaE']"));
		WebElement get = driver.findElement(By.cssSelector("a[class='border_color VeCXM INx9f']  div[class='CRKrj style_change edCaE']"));
		System.out.println(get.getText());
	}

}

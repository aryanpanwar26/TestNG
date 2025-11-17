package driverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webdriverex1 {
	
	public static void main(String[] args) throws InterruptedException {
	   // System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	   // System.setProperty("webdriver.edge.driver", "./Drivers/msedgedriver.exe");
		//WebDriver driver = new ChromeDriver();
	//    WebDriverManager.firefoxdriver().setup();
//		WebDriver driver = new FirefoxDriver();
//		//driver.findElement(By.id(""));
//		//ChromeDriver driver1 = new ChromeDriver();
//		//driver1.location();
//		driver.get("https://www.google.com");
		
		
		WebDriverManager.chromiumdriver().setup();
		ChromeOptions option = new ChromeOptions();
		//option.addArguments("--headless");
		option.addArguments("--incognito");
		option.addArguments("--start-maximized");
		option.addArguments("--disable-popup-blocking");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://demoqa.com/browser-windows");
		//driver.manage().window().maximize();
		//driver.manage().window().fullscreen();
		/*if("Google".equalsIgnoreCase(driver.getTitle())) {
			
		}
		else {
			
		}*/
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", driver.findElement(By.id("windowButton")));
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
//		driver.navigate().refresh();
//		driver.navigate().back();
//		driver.navigate().forward();
		//driver.manage().window().minimize();
		driver.close();
		Thread.sleep(2000);
		driver.quit();
	}
}

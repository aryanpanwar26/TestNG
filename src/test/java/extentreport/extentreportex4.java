package extentreport;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class extentreportex4 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationbykrishna.com");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.manage().window().fullscreen();
 
		ExtentSparkReporter reporter = new ExtentSparkReporter("./reports/report1.html");
		reporter.config().setReportName("Automation test report");
		reporter.config().setDocumentTitle("Test execution report");
		
		ExtentReports report = new ExtentReports();
		report.attachReporter(reporter);
		report.setSystemInfo("Tester", "Aryan Panwar");
		report.setSystemInfo("Environment", "QA");
		report.setSystemInfo("Browser", "Chrome");
		
		ExtentTest test = report.createTest("LoginTest", "Verify login functionality");
		
		WebElement registration = driver.findElement(By.id("registration2"));
		registration.click();
		test.pass("Registration Clicked", MediaEntityBuilder.createScreenCaptureFromPath("C:\\\\Users\\\\arypanwa\\\\eclipse-workspace\\\\123\\\\screenshots\\\\s1.png").build());
		
		
		
		driver.findElement(By.id("unameSignin")).sendKeys("Aryan");
		test.log(Status.PASS, "UserName entered");
		
		test.pass("Registration clicked", MediaEntityBuilder.createScreenCaptureFromPath("C:\\\\Users\\arypanwa\\\\eclipse-workspace\\\\123\\\\screenshots\\\\s1.png").build());
		test.pass("Registration clicked").addScreenCaptureFromPath("C:\\\\Users\\\\arypanwa\\\\eclipse-workspace\\\\123\\\\screenshots\\\\s1.png");
		
		driver.quit();
		report.flush();
		
	}

}

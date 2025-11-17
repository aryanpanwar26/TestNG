package extentreport;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class extentreportex2 {
	@Test
	public void g() {
		ExtentSparkReporter reporter = new ExtentSparkReporter("./reports/report.html");
		reporter.config().setReportName("Automation test report");
		reporter.config().setDocumentTitle("Test execution report");
		
		ExtentReports report = new ExtentReports();
		report.attachReporter(reporter);
		report.setSystemInfo("Tester", "Aryan Panwar");
		report.setSystemInfo("Environment", "QA");
		report.setSystemInfo("Browser", "Chrome");
		
		ExtentTest test = report.createTest("LoginTest", "Verify login functionality");
		
		test.log(Status.PASS, "Registration link clicked");
		test.log(Status.PASS, "UserName entered");
		
		ExtentTest test1 = report.createTest("RegistrationTest", "Verify registration functionality");
		test1.log(Status.FAIL, "Failed step");
		
		ExtentTest test2 = report.createTest("PaymentTest", "Verify payment functionality");
		
		ExtentTest loginTest = test2.createNode("Login");
		loginTest.log(Status.PASS, "Enter UserName");
		loginTest.log(Status.PASS, "Enter Password");
		loginTest.log(Status.PASS, "Click Submit");
		
		ExtentTest cartTest = test2.createNode("Select Product and navigate to Cart");
		cartTest.log(Status.PASS, "Select Product");
		cartTest.log(Status.PASS, "Click on Add to Cart button");
		
		ExtentTest paymentTest = test2.createNode("Make Payment");
		paymentTest.log(Status.PASS, "Verify product in cart");
		paymentTest.log(Status.PASS, "Enter creditCard info and make payment");
		
		report.flush();
	}

}

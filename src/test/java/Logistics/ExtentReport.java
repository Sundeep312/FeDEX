package Logistics;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pageObjects.FedexHomepage;
import pageObjects.FedexactualPage;

public class ExtentReport extends Base {
	
	
	public WebDriver driver;
	public ExtentHtmlReporter htmlReport;
	public ExtentReports extent;
	public ExtentTest test;
	
	@BeforeTest
	public void setExtent()
	{
		
		//instantiating the created objects 
		
		//giving directory to save the reports in test-output folder 
		htmlReport= new ExtentHtmlReporter(System.getProperty("user.dir")+"/test-output/myReport.html");
		
		//configuring Report properties such as title of report, report name , themem of the report
		htmlReport.config().setDocumentTitle("Automation Testing");
		htmlReport.config().setReportName("Functional report");
		htmlReport.config().setTheme(Theme.DARK);
		
		extent=new ExtentReports();
		//attaching ExtentHtml report information to Extent class 
		extent.attachReporter(htmlReport);
		//Setting systemproperties 
		extent.setSystemInfo("OS", "Mac");
		extent.setSystemInfo("Hostname", "Localhost");
		extent.setSystemInfo("Tester", "Sundeep");
		
	}
	
	//to flesh reports after test
	@AfterTest
	public void endReport()
	{
		extent.flush();
	}
	
	@BeforeMethod
	public void setup() throws IOException
	{
		driver=baseNavigation();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("URL4"));
	}
	
	
	
	@Test
	public void noCoomerceTitletest() throws IOException 
	{
		//making entry of test in Extent reports
		test=extent.createTest("noCoomerceTitle test");
		
		String title=driver.getTitle();
		System.out.println(title);
		AssertJUnit.assertEquals(title, "noCommerce demo store");
			
		
	}
	
	@Test
	public void noCoomerceLogotest() throws IOException
	{
		test=extent.createTest("noCoomerceLogotest");

		
		boolean Status=driver.findElement(By.xpath("//div[@class='header-logo']//a//img")).isDisplayed();
		AssertJUnit.assertTrue(Status);
	
	}
	
	@Test
	public void noCoomerceLogintest()
	{
		test=extent.createTest("noCoomerceLogintest");
		AssertJUnit.assertTrue(true);
		  
	}
	
	@AfterMethod
	public void teardown(ITestResult result) throws IOException
	{
		//to check result of each method test case
		if(result.getStatus() == ITestResult.FAILURE )
		{
			
			//sending test result logs into extent reports 
			//result.genName results in printing failed test method 
			test.log(Status.FAIL, "Test Case Failed is" + result.getName());
			//result.getThrowable results in printing error thrown in console
			test.log(Status.FAIL, "Test Case Failed is" + result.getThrowable());
			
			String screenshotPath = ExtentReport.getScreenshot(driver, result.getName());
			   test.addScreenCaptureFromPath(screenshotPath);// adding screen shot
		}
	else if (result.getStatus() == ITestResult.SKIP) 
	      {
		   test.log(Status.SKIP, "Test Case SKIPPED IS " + result.getName());
		  }
		  else if (result.getStatus() == ITestResult.SUCCESS) {
		   test.log(Status.PASS, "Test Case PASSED IS " + result.getName());
		  }
		  
	}
	
	public static String getScreenshot(WebDriver driver, String screenshotName) throws IOException {
		
		//simpleDateFormat is a java method for get dynamic date 
		  String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());  
		  TakesScreenshot ts = (TakesScreenshot) driver;
		  File source = ts.getScreenshotAs(OutputType.FILE);
		  
		  // after execution, you could see a folder "FailedTestsScreenshots" under src folder
		  String destination = System.getProperty("user.dir") + "/Screenshots/" + screenshotName + dateName + ".png";
		  File finalDestination = new File(destination);
		  FileUtils.copyFile(source, finalDestination);
		  return destination;
		 }
		 
	}
	
	
	
	 
	



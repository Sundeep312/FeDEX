package Logistics;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.FedexHomepage;
import pageObjects.FedexactualPage;

public class Fedex1 extends Base {
	
	
	@BeforeTest
	public void Navigation() throws IOException
	{
		driver=baseNavigation();
		driver.get(prop.getProperty("URL1"));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	
	
	
	@Test
	public void page1() throws InterruptedException 
	{
		
		FedexHomepage FH=new FedexHomepage(driver);
		
		FH.Square().click();
		FH.From().sendKeys("India");
		
		for(int i=0;i<3;i++)
		{
			FH.From().sendKeys(Keys.ARROW_DOWN);
		}
		Thread.sleep(3000);
		FH.From().sendKeys(Keys.ENTER);
		FH.To().sendKeys("UK");
		FH.To().sendKeys(Keys.ENTER);
		
		
	}
	
	//@Test
	public void page2() throws IOException
	{
		
		
		FedexHomepage FH=new FedexHomepage(driver);
		
		FH.dropdown().click();
		Select s=new Select(FH.dropdown());
		s.selectByVisibleText("Get Rates & Transit Times");
		
		
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}

}

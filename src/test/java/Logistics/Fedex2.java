package Logistics;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pageObjects.FedexHomepage;
import pageObjects.FedexactualPage;

public class Fedex2 extends Base {
	
	
	@BeforeTest
	public void navigation() throws IOException
	{
		driver=baseNavigation();
		driver.get(prop.getProperty("URL2"));
		
	}
	
	@Test
	public void page2() throws InterruptedException, IOException
	{
		
		FedexactualPage FP=new FedexactualPage(driver);
		
		

		
		List<WebElement> list=FP.Origin().findElements(By.tagName("option"));
		System.out.println(list.size());
		
		
	
		
	for(int j=0; j<list.size();j++)
	{
		String lst=list.get(j).getText();
		System.out.println(lst);
		
	}
		
		
		
		Select s=new Select(FP.Origin());
		s.selectByVisibleText("United Kingdom");
		FP.Addsearch().click();
		FP.postcode().sendKeys("TR14 8FG");
		FP.houseNumber().sendKeys("3");
		FP.City().sendKeys("Camborne");
		FP.Serach().click();
		FP.Select().click();
		FP.Addselect().click();
		Select st=new Select(FP.Destination());
		st.selectByVisibleText("India");
		FP.Zip().sendKeys("524001");
		FP.City2().sendKeys("Nellore");
		FP.Packages().sendKeys("2");
		FP.yes().click();
		FP.weight().sendKeys("10");
		Select sc=new Select(FP.racode());
		sc.selectByIndex(0);
		FP.calender().click();
	List<WebElement> dates=driver.findElements(By.cssSelector(".enabledDateStyle"));
	
	int count=dates.size();
	
	for(int i=0; i<count;i++)
	{
		String text=dates.get(i).getText();
		
		if(text.equalsIgnoreCase("23"))
		{
			dates.get(i).click();
		}
		
	}
		
		FP.Quote().click();
		
			
		
	}
	
	@Test
	public void ValidateClearlink()
	{
		FedexactualPage FP=new FedexactualPage(driver);
		boolean condition=FP.clear().isDisplayed();
		Assert.assertTrue(condition);
		
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
}

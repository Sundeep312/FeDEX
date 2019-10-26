package Logistics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SampleFedex {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/sundeeppamulapati/Documents/Eclipse-Auto/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.fedex.com/ratefinder/home?source=gh&cc=gb&language=en");
		//driver.findElement(By.xpath("//div[@class='loginLogoutTitle']//a[contains(text(),'Login')]")).click();
		driver.findElement(By.id("origCountryId")).click();
		WebElement dropdown=driver.findElement(By.id("origCountryId"));
		Select s=new Select(dropdown);
		s.selectByVisibleText("United Kingdom");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//tr[8]//td[2]//input[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("TR14 8FG");
		driver.findElement(By.xpath("//div[@id='al-houseNumber']//input")).sendKeys("3");
		driver.findElement(By.xpath("//div[@id='al-city']//input")).sendKeys("Camborne");
		driver.findElement(By.id("al-searchAddress")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@id='al-addressResults']//div[5]//input[1]")).click();
		driver.findElement(By.id("al-useSelectedAddress")).click();
		
		

	}

}

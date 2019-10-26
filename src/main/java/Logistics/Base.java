package Logistics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Base {
	
	public WebDriver driver;
	public Properties prop;
	
	public WebDriver baseNavigation() throws IOException
	{
		
	
		 prop=new Properties();
		
		FileInputStream fis=new FileInputStream("/Users/sundeeppamulapati/Fedex/src/main/java/resources/file.properties");
		
		prop.load(fis);
		prop.getProperty("URL");
		String browserName=prop.getProperty("Browser");
		
		if(browserName.equals("Chrome"))
				{
			System.setProperty("webdriver.chrome.driver", "/Users/sundeeppamulapati/Documents/Eclipse-Auto/chromedriver");
			 driver=new ChromeDriver();
			
				}
		else if(browserName.equals("Firefox"))
		{ 
			driver=new FirefoxDriver();
		}
		else if(browserName.equals("IE"))
		{
			driver= new InternetExplorerDriver();
			
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		return driver;
	}

	public void getscreenshot(String Result) throws IOException
	{
		
		File Src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(Src, new File("//Users//sundeeppamulapati//Documents//Eclipse-Auto//Screenshot//"+ Result+"screensshot.png"));
		
	}
	
}

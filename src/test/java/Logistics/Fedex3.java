package Logistics;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pageObjects.FedexHomepage;
import pageObjects.FedexactualPage;
import pageObjects.FedexloginPage;

public class Fedex3 extends Base {
	
	
	@BeforeMethod
	public void navigation () throws IOException
	{
		driver=baseNavigation();
		
		
	}
	
	
	@Test(dataProvider="getData")
	public void page3(String ID, String password, String retypepass, String Answer, String FName, String Lname, String Zip, String Add1, String city, String EMail, String RetypeEmail, String Phone) throws InterruptedException, IOException
	{
		
		driver.get(prop.getProperty("URL3"));
		driver.manage().window().maximize();
		
		
		FedexloginPage FL=new FedexloginPage(driver);
		
		
		FL.ID().sendKeys(ID);
	
		FL.passWord().sendKeys(password);
		FL.retypePass().sendKeys(retypepass);
		
		Select s=new Select(FL.question());
		s.selectByIndex(1);
		FL.Answer().sendKeys(Answer);
		FL.firstName().sendKeys(FName);
		FL.lastName().sendKeys(Lname);
		Select sl=new Select(FL.country());
		sl.selectByVisibleText("United Kingdom");
		FL.Zip().sendKeys(Zip);
		FL.address1().sendKeys(Add1);
		FL.city().sendKeys(city);
		FL.email().sendKeys(EMail);
		FL.retypeEmail().sendKeys(RetypeEmail);
		FL.phone().sendKeys(Phone);
		FL.terms().click();
		FL.Accept().click();
		
		
	
		
	}

	@DataProvider
	public Object[][] getData()
	{
		Object[][] data=new Object[3][12];
		
		//data set 1
		data[0][0]="1234567550";
		data[0][1]="Sunny3112";
		data[0][2]="Sunny3112";
		data[0][3]="Nellore";
		data[0][4]="Sundeep";
		data[0][5]="Pam";
		data[0][6]="TR14 8FG";
		data[0][7]="3 PLEN AN VARGHAS";
		data[0][8]="Camborne";
		data[0][9]="sunnydeepu10@gmail.com";
		data[0][10]="sunnydeepu10@gmail.com";
		data[0][11]="07508962079";
		
		
		//data set 2
		data[1][0]="12345";
		data[1][1]="sunny331";
		data[1][2]="sunny331";
		data[1][3]="kavali";
		data[1][4]="deepu";
		data[1][5]="p";
		data[1][6]="CB4 2RS";
		data[1][7]="55";
		data[1][8]="Cam";
		data[1][9]="123@mail.com";
		data[1][10]="321@mail.com";
		data[1][11]="0750";
		
		//data set 3
		data[2][0]="123456";
		data[2][1]="Sunny33";
		data[2][2]="Sunny";
		data[2][3]="Hyderabad";
		data[2][4]="sunny";
		data[2][5]="pa";
		data[2][6]="TR14 8JY";
		data[2][7]="16 commercial street";
		data[2][8]="Camborne";
		data[2][9]="321@mail.com";
		data[2][10]="123@mail.com";
		data[2][11]="0750896";
		return data;
		
		
	}
	
	@AfterMethod
	public void getScreenShot() throws IOException
	{
      File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src,new File("/Users/sundeeppamulapati/Documents/Eclipse-Auto/Screenshot/ScreenShot.png"));
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
}

package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FedexactualPage {
	
	public WebDriver driver;
	
	public FedexactualPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

@FindBy(id="origCountryId")
WebElement Origin;

@FindBy(xpath="//tr[8]//td[2]//input[1]")
WebElement Addsearch;

@FindBy(xpath="//input[@name='postalCode']")
WebElement postcode;

@FindBy(xpath="//div[@id='al-houseNumber']//input")
WebElement houseNumber;

@FindBy(xpath="//div[@id='al-city']//input")
WebElement City;

@FindBy(id="al-searchAddress")
WebElement Search;

@FindBy(xpath="//div[@id='al-addressResults']//div[5]//input[1]")
WebElement Select;

@FindBy(id="al-useSelectedAddress")
WebElement AddSelect;

@FindBy(id="destCountryId")
WebElement Destination;

@FindBy(id="destZipId")
WebElement Zip;

@FindBy(id="destCityId")
WebElement City2;

@FindBy(id="NumOfPackages")
WebElement Packages;

@FindBy(xpath="//tr[@id='rowpackagesindentical']//input[1]")
WebElement yes;

@FindBy(id="raCodeId")
WebElement codeId;

@FindBy(id="totalPackageWeight")
WebElement weight;

@FindBy(css="#raCodeId")
WebElement racode;

@FindBy(xpath="//div[@id='shipCalendarDate._icon']")
WebElement calender;

@FindBy(css=".enabledDateStyle")
WebElement dates;

@FindBy(css=".buttonpurple")
WebElement Quote;

@FindBy(xpath="//a[contains(text(),'Clear all fields')]")
WebElement clear;

public WebElement clear()
{
	return clear;
}


public WebElement Origin()
{
	return Origin;	
}

public WebElement Addsearch()
{
	return Addsearch;	
}

public WebElement postcode()
{
	return postcode;	
}

public WebElement houseNumber()
{
	return houseNumber;	
}

public WebElement City()
{
	return City;	
}

public WebElement Serach()
{
	return Search;	
}

public WebElement Select()
{
	return Select;	
}

public WebElement Addselect()
{
	return AddSelect;
}

public WebElement Destination()
{
	return Destination;	
}

public WebElement Zip()
{
	return Zip;	
}

public WebElement City2()
{
	return City2;	
}

public WebElement Packages()
{
	return Packages;	
}

public WebElement yes()
{
	return yes;	
}


public WebElement raCodeId()
{
	return codeId;	
}

public WebElement calender()
{
	return calender;	
}

public WebElement dates()
{
	return dates;	
}

public WebElement Quote()
{
return Quote;
}

public WebElement weight()
{
return weight;
}

public WebElement racode()
{
	return racode;
}

}




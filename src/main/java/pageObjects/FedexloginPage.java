package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FedexloginPage {
	
	public WebDriver driver;
	
	public FedexloginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

@FindBy(xpath="//div[@class='loginLogoutTitle']//a[contains(text(),'Login')]")
WebElement LoggingIn;

@FindBy(css=".smallpurpleheader")
WebElement signUp;

@FindBy(css="#uid")
WebElement ID;

@FindBy(css="#password")
WebElement passWord;

@FindBy(css="#retypePassword")
WebElement retypePass;

@FindBy(css="#reminderQuestion")
WebElement question;

@FindBy(id="reminderAnswer")
WebElement Answer;

@FindBy(id="firstName")
WebElement firstName;

@FindBy(id="lastName")
WebElement lastName;

@FindBy(xpath="//select[@name='country']")
WebElement country; 

@FindBy(id="zip")
WebElement Zip; 

@FindBy(id="address1")
WebElement address1; 

@FindBy(id="city")
WebElement city; 

@FindBy(id="state")
WebElement state; 

@FindBy(id="email")
WebElement email;

@FindBy(id="retypeEmail")
WebElement retypeEmail;

@FindBy(id="phone")
WebElement phone;

@FindBy(id="cboptin")
WebElement terms;

@FindBy(id="iacceptbutton")
WebElement Accept;

@FindBy(css="#idempty")
WebElement text;

public WebElement LoggingIn()
{
	return LoggingIn;	
}

public WebElement signUp()
{
	return signUp;	
}

public WebElement ID()
{
	return ID;	
}

public WebElement passWord()
{
	return passWord;	
}

public WebElement retypePass()
{
	return retypePass;	
}

public WebElement question()
{
	return question;	
}

public WebElement Answer()
{
	return Answer;	
}

public WebElement firstName()
{
	return firstName;
}

public WebElement lastName()
{
	return lastName;	
}

public WebElement country()
{
	return country;	
}

public WebElement Zip()
{
	return Zip;	
}

public WebElement address1()
{
	return address1;	
}

public WebElement city()
{
	return city;	
}

public WebElement state()
{
	return state;	
}

public WebElement email()
{
	return email;	
}

public WebElement retypeEmail()
{
	return retypeEmail;	
}

public WebElement phone()
{
	return phone;	
}

public WebElement terms()
{
	return terms;	
}

public WebElement Accept()
{
	return Accept;	
}

public WebElement text()
{
	return text;	
}

}




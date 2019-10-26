package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FedexHomepage {
	
	public WebDriver driver;
	
	
	public FedexHomepage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(xpath="/html/body/div[1]/header/fedex-cookie-consent/div/div/div/div/form/fieldset/div[3]/button[2]")
	WebElement Coockie;
	
	@FindBy(xpath="//span[contains(text(),'Shipping')]")
	WebElement dropdown;
	
	@FindBy(xpath="//body[contains(@class,'fxg-home has-cookie-consent')]/main/div[contains(@class,'fxg-main-content')]/div/div[contains(@class,'')]/div[@class='fxg-hero__background-image']/div[@class='fxg-cube-container']/div[1]/div[1]")
	WebElement Square;
	
	@FindBy(id="fromAddress")
	WebElement From;
	
	
	@FindBy(id="toAddress")
	WebElement To;
	
	
	public WebElement Coockie()
	{
		return Coockie;
	}
	
	
	public WebElement dropdown()
	{
		return dropdown;
	}
	
	public WebElement Square()
	{
		return Square;
	}
	
	public WebElement From()
	{
		return From;
	}
	
	public WebElement To()
	{
		return To;
	}
	
}

package blazepagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BlazedemoRegisterPageprgrm {
	WebDriver driver;
	   
	@FindBy(xpath="//*[@id=\"name\"]")
	WebElement name;

    @FindBy(xpath="//*[@id=\"company\"]")
	WebElement company;
    
    @FindBy(xpath="//*[@id=\"email\"]")
	WebElement email;
	
    @FindBy(xpath="//*[@id=\"password\"]")
	WebElement password;
	
    @FindBy(xpath="//*[@id=\"password-confirm\"]")
	WebElement confirmpswd;
	
    @FindBy(xpath="//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[6]/div/button")
    WebElement register;
    
    public BlazedemoRegisterPageprgrm(WebDriver driver)
    {
		this.driver=driver;
        PageFactory.initElements(driver,this);
    }
	
    
  public void setvalues(String names, String companyname, String emailaddress, String pswd, String conpswd)
    {
    	name.sendKeys(names);
    	company.sendKeys(companyname);
    	email.sendKeys(emailaddress);
    	password.sendKeys(pswd);
    	confirmpswd.sendKeys(conpswd);
	}
   
    public void registerclick()
    {
    	register.click();
    }

	
	
	
	
}

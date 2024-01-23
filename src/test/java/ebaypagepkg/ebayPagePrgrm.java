package ebaypagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ebayPagePrgrm {
	

	WebDriver driver;
	   
	@FindBy(xpath="//*[@id=\"gh-ac\"]")
	WebElement search;
	
	@FindBy(xpath="//*[@id=\"gh-btn\"]")
	WebElement searchbutton;
	
	@FindBy(xpath="//*[@id=\"item59bc9f3369\"]/div/div[2]/a")
	WebElement firsttoy;
	
	@FindBy(xpath="//*[@id=\"mainContent\"]/div/div[6]/ul/li[2]/div/a")
	WebElement addtocart;
	
	@FindBy(xpath="//*[@id=\"gf-l\"]/li[6]/a")
	WebElement linkpolicies;
	
	@FindBy(xpath="//*[@id=\"gh-ug-flex\"]/a")
	WebElement registerbutton;
	
	@FindBy(xpath="//*[@id=\"personalaccount-radio\"]")
	WebElement personalacc;
	
	@FindBy(xpath="//*[@id=\"firstname\"]")
	WebElement firstname;
	
	@FindBy(xpath="//*[@id=\"lastname\"]")
	WebElement lastname;
	
	@FindBy(xpath="//*[@id=\"Email\"]")
	WebElement email;
	
	@FindBy(xpath="//*[@id=\"password\"]")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"EMAIL_REG_FORM_SUBMIT\"]")
	WebElement register;
	
	public ebayPagePrgrm(WebDriver driver)
	{
		this.driver=driver;
        PageFactory.initElements(driver,this);
	}
	public void setvalues(String toy) 
	 {
	     search.sendKeys(toy);
	 }
    public void testclick()
     {
    	 searchbutton.click();
    	 firsttoy.click();
         addtocart.click();
     }	 
    	public void scrolldown() {
    	 JavascriptExecutor js = (JavascriptExecutor) driver;
	     js.executeScript("window.scrollBy(0,500)", "");
	     linkpolicies.click();
     }
    public void registerclick()
     {
    	 registerbutton.click();
     }
	public void setvalues(String fname, String lname, String mail, String pswd) {
		firstname.sendKeys(fname);
		lastname.sendKeys(lname);
		email.sendKeys(mail);
		password.sendKeys(pswd);
	 }
	public void submitclick() {
	
		register.click();
	}
	
	
	
	
	
	
	
	
	
	
}

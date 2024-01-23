package pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbLoginPage {
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"email\"]") 
	WebElement email;
	
	@FindBy(xpath="//*[@id=\"pass\"]") 
	WebElement password;
	
	@FindBy(name="login") 
	WebElement login;
	
	public FbLoginPage(WebDriver driver)
	 {
	           this.driver=driver;
	           PageFactory.initElements(driver,this);
	 }
	
	public void setvalues(String username, String pswd)
	{
		email.sendKeys(username);   
        password.sendKeys(pswd);
	}

	public void clickLoginBtn()
	 {
	    	  login.click();
	 }

	
	
	
	
	
	
	
	
	
	
	
	
	
	
/*
	//Locating Login button
		By loginBtn=By.name("login");
	    //Locating Email id Text box
	    By emailIdField=By.id("email");
	    //Locating password Text box
	    By psswd=By.id("pass");

	    //Initializing the Objects

	    public FbLoginPage(WebDriver driver)

	    {

	               this.driver=driver;

	    }

	//Clicking on Login button

	    public void clickLoginBtn()

	    {
	    	 driver.findElement(loginBtn).click();
	                

	    }



	    //Specifiying email and psswd

	    public void setvalues (String UN,String PWD)

	    {

	            driver.findElement(emailIdField).sendKeys(UN);   
	            driver.findElement(psswd).sendKeys(PWD);
	            
	    }

*/	    

	
	
	
	
	
}

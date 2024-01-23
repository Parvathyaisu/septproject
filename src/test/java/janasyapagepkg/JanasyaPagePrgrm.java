package janasyapagepkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class JanasyaPagePrgrm {

	WebDriver driver;
	   
	@FindBy(xpath="//*[@id=\"HeaderNavigation\"]/nav/ul/li[1]/a")
	WebElement newarrivals ;

    @FindBy(xpath="//*[@id=\"halo-sidebar\"]/div[2]/div[1]/div[1]/h3")
	WebElement category;
    
    @FindBy(xpath="//*[@id=\"halo-sidebar\"]/div[2]/div[1]/div[2]/div/ul/li[1]/a")
	WebElement kurtas;
    
    @FindBy(xpath="//*[@id=\"44199301382314\"]")
	WebElement addtocart;
    
    @FindBy(xpath="//*[@id=\"HeaderNavigation\"]/nav/ul/li[4]/a/span[1]")
	WebElement fusion;
	        
	public JanasyaPagePrgrm(WebDriver driver) 
     {
    	 this.driver=driver;
         PageFactory.initElements(driver,this);
	 }
	public void janasyapageclick()	
	  {
		     newarrivals.click();
		     category.click();
		     kurtas.click();
	  }
    public void addtocart() 
	  { 
		     JavascriptExecutor js = (JavascriptExecutor) driver;
		     js.executeScript("window.scrollBy(0,250)", "");
		     addtocart.click();
	  }     
	 public void menusclick() 
	  {
		   List<WebElement> menus=driver.findElements(By.xpath("//*[@id=\"HeaderNavigation\"]/nav/ul/li"));
		   System.out.println("Total no of menus="+menus.size());
		 	
		 	for(WebElement title:menus)
	         {
		 		System.out.println(title.getText());
		 	 }
	  }
     public void fushion() 
	  { 
		    Actions act=new Actions(driver); 
	        WebElement name=driver.findElement(By.xpath("//*[@id=\"HeaderNavigation\"]/nav/ul/li[4]/a/span[1]"));
	        act.moveToElement(name).perform();
	  }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

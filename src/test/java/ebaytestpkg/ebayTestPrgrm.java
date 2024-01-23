package ebaytestpkg;

import org.testng.annotations.Test;

import ebaypagepkg.ebayPagePrgrm;

public class ebayTestPrgrm extends Baseclass{
	
@Test	
	public void test() throws InterruptedException 
	{ 
	   ebayPagePrgrm eb=new ebayPagePrgrm(driver);
	   eb.setvalues("toy");
	   eb.testclick();
	   eb.scrolldown();
	   driver.navigate().to("https://www.ebay.com/"); 
	   eb.registerclick();
	   eb.setvalues("Parvathy","R","abc@gmail.com","abcD#123");
	   eb.submitclick();
	   
	}	
	
	
	
	

	

	
	
	
	
	
	
	
	
	
}

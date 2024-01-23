package blazetestpkg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import blazepagepkg.BlazedemoRegisterPageprgrm;

public class BlazedemoRegisterTestPrgrm extends Baseclass{
	
@Test	
	public void test() 
	{ 
		BlazedemoRegisterPageprgrm bd=new BlazedemoRegisterPageprgrm (driver);
	    bd.setvalues("parvathy","luminar","abc@gmail.com","abcD#123","abcD#123");
	    bd.registerclick();
	}	
	
	
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

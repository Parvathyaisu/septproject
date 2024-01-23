package janasyatestpkg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import janasyapagepkg.JanasyaPagePrgrm;


public class JanasyatestPrgrm extends Baseclass{

	
	@Test
		public void test() throws InterruptedException
		{ 
		   JanasyaPagePrgrm jan=new JanasyaPagePrgrm (driver);
		   jan.janasyapageclick();
		   jan.addtocart();
		   Thread.sleep(2000);
		   jan.menusclick(); 
		   jan.fushion(); 
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
}

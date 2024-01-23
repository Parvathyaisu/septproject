package ebaytestpkg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;

public class Baseclass {
	public static WebDriver driver;

	@BeforeClass
			 public void setup()
			  {
			     driver=new EdgeDriver();
			     driver.get("https://www.ebay.com/");
			     driver.manage().window().maximize();
			     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			  }
}

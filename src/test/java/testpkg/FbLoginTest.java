package testpkg;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import basepkg.Baseclass;
import pagepkg.FbLoginPage;
import utilities.ExcelUtils;

public class FbLoginTest extends Baseclass{

	@Test
	public void verifyLoginWithValidCred () throws InterruptedException
	{
		
		FbLoginPage p1=new FbLoginPage(driver);
		
	//Reading  the data from excel file by the specified path	
		
		String xl="C:\\Users\\parva\\OneDrive\\Desktop\\Book1.xlsx";
		String Sheet="Sheet1";
		int rowcount=ExcelUtils.getRowCount(xl, Sheet);
		for(int i=1;i<=rowcount;i++)
		{
		 String username=ExcelUtils.getCellValue(xl, Sheet, i, 0);
		 System.out.println("username----"+username);
		String pswd=ExcelUtils.getCellValue(xl, Sheet, i, 1);
		System.out.println("password----"+pswd);
		//passing username and password as parameters
		p1.setvalues(username,pswd);
		//submitting the data by clicking on login button
		p1.clickLoginBtn();
		Thread.sleep(2000);
		}
	}

}
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

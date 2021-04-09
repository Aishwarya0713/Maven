package module1;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObject.Landingpage;
import resources.base;

public class Login extends base {


	@Test(dataProvider="getData")
	public void basepagenavigation(String username,String password) throws IOException{
		
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
		log1.info("Successfully opened the application");
		Landingpage l=new Landingpage(driver); 
		log1.info(username);
		log1.info(password);
		
		l.Username().sendKeys(username);
		l.password().sendKeys(password);
		l.login().click();
		Assert.assertEquals(driver.getCurrentUrl(),"https://qtrecognition.testqtwiz.com/Activity.php");
		System.out.println("tested");
		driver.close();
		log1.info("Successfully entered the username and password");
	}
	
	
	@DataProvider

	public Object[][] getData() throws InterruptedException
	{
		Object[][] data = new Object[8][2];
		data[0][0] = "aishwarya.kurkoti@qualitestgroup.com";
		data[0][1] = "p@ssw0rd";

		
		data[1][0] = "aishwarya.kurkoti@qualitestgroup.com";
		data[1][1] = "";
		
		data[2][0] = "aishwarya.kurkoti@qualitestgroup.com";
		data[2][1] = "P@SSW0RD";
		
		data[3][0] = "AISHWARYA.KURKOTI@QUALITESTGROUP.COM";
		data[3][1] = "p@ssw0rd";
		
		data[4][0] = "";
		data[4][1]= "p@ssw0rd";
		
		data[5][0] = "aishwarya.kurkoti@qualitestgroup.com";
		data[5][1] = "abcdefgh";
		
		data[6][0] = "aishwarya.ki@qualitestgroup.com";
		data[6][1] = "P@ssw0rd";
		
		data[7][0] = "aishwarya.ki@qualitestgroup.com";
		data[7][1] = "abcdefgh";
		
		return data;
	}

	
}
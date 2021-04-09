package module3;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObject.Landingpage;
import resources.base;

public class Precon extends base {
	@Test
	public void PreCond(String username,String password) throws IOException {
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
		log1.info("successfully opened the application");
		Landingpage l = new Landingpage(driver);
		l.Username().sendKeys(username);
		l.password().sendKeys(password);
		l.login().click();
	}
	

}

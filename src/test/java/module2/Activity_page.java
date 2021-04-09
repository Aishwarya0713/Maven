package module2;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pageObject.Landingpage;
import resources.base;

public class Activity_page extends base {
	public void login() throws IOException {
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
		Landingpage lp = new Landingpage(driver);
		lp.Username().sendKeys("aishwarya.kurkoti@qualitestgroup.com");
		lp.password().sendKeys("p@ssw0rd");
		lp.login().click();
		
	}
	
	@Test 
	public void NameINLeft() throws IOException {
		login();
		WebElement wb = driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/h5[1]"));
		Point pt=wb.getLocation();
		int xcrod=pt.getX();
		System.out.println("Position from Left Side is:"+xcrod);
		int ycrod=pt.getY();
		System.out.println("Position from Right Side is:"+ycrod);
		if(xcrod<=450 && ycrod<=200) {
			System.out.println("Name is on the left side of the screen");
		}
		else {
			System.out.println("Name is not the left side of the screen");
		}
		
		driver.close();
	}
	

	

}

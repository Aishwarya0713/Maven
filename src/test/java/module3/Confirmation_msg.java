package module3;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.Activity;
import resources.base;

public class Confirmation_msg extends base {
	@Test(dataProvider="getData")
	
	public void sendkudos(String username,String password) throws IOException , InterruptedException, AWTException{
		Precon pc = new Precon();
		pc.PreCond(username, password);
		Activity a=new Activity(pc.driver);
		
		a.Sendkudos().click();
		Thread.sleep(1000);
		a.NameEmail().sendKeys("madhu.niloor");
		Thread.sleep(1000);
		Robot T = new Robot();
		T.keyPress(KeyEvent.VK_DOWN);
		T.keyPress(KeyEvent.VK_ENTER);
		a.kudotype("Exceptional Work");
		Thread.sleep(1000);
		a.comments().sendKeys("AWESOME");
		a.send().click();
		Thread.sleep(3000);
		pc.driver.close();
		log1.info("Email sent successfully");
	
	}
	
	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[1][2];
		data[0][0]="aishwarya.kurkoti@qualitestgroup.com";
		data[0][1]="P@ssw0rd";
		return data;
	}

}


package module3;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.Activity;
import resources.base;

public class Send_multipl_kudos extends base {
	@Test(dataProvider="getData")
	
	public void sendkudos(String username,String password) throws IOException , InterruptedException, AWTException{
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
		Precon pc = new Precon();
		pc.PreCond(username, password);
		Activity a=new Activity(pc.driver);
		
		a.Sendkudos().click();
		a.NameEmail().sendKeys("madhu.niloor");
		Robot T = new Robot();
		T.keyPress(KeyEvent.VK_DOWN);
		T.keyPress(KeyEvent.VK_ENTER);
		ArrayList<String> kudo = new ArrayList<String>();
		kudo.add("Exceptional Work");
		kudo.add("Excellent Team Work");
		kudo.add("Innovative Thinker");
		kudo.add("Good Client Relations");
		kudo.add("Quality Hero");
		kudo.add("Quick Learner");
		kudo.add("Hard Worker");
		kudo.add("Team player");
		Iterator it = kudo.iterator();
		while(it.hasNext()) {
			a.kudotype(it.next().toString());
			Thread.sleep(1000);
		}
		a.takeScreenshot();
		Thread.sleep(1000);
		
		a.comments().sendKeys("AWESOME");
		a.send().click();
		Thread.sleep(1000);
		pc.driver.close();
	
	}
	
	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[1][2];
		data[0][0]="aishwarya.kurkoti@qualitestgroup.com";
		data[0][1]="P@ssw0rd";
		return data;
	}

}

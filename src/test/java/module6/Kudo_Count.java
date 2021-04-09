package module6;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObject.Activity;
import pageObject.Landingpage;
import resources.base;

public class Kudo_Count extends base {
	public void basepagenavigation() throws IOException{
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
		log1.info("Successfully opened application");
		
		Landingpage l = new Landingpage(driver);
		l.Username().sendKeys("aishwarya.kurkoti@qualitestgroup.com");
		l.password().sendKeys("P@ssw0rd");
		l.login().click();
		log1.info("Successfully entered username and password");
	}
	public int sendkudo() throws IOException {
		basepagenavigation();
		Activity ok = new Activity(driver);
		int val = Integer.parseInt(ok.kudocount1().getText().split(" ")[0]);
		return val;
	}
	public void sendkudo1() throws InterruptedException{
		Activity a = new Activity(driver);
		a.Sendkudos().click();
		a.NameEmail().sendKeys("Madhu Niloor(madhu.niloor@qualitestgroup.com");
		a.Kudo1().click();
		a.kudotype("Quick Learner");
		a.comments().sendKeys("AWESOME");
		a.send().click();	
	}
	public int cnt() throws InterruptedException {
		Activity ac = new Activity(driver);
		int vals = Integer.parseInt(ac.kudocount1().getText().split(" ")[0]);
		return vals;
	}
	@Test
	public void testcase() throws IOException, InterruptedException {
		int after=sendkudo();
		sendkudo1();
		Thread.sleep(1000);
		int cmt=cnt();
		if(after>cmt)
		{
			System.out.println("HI");
		}
		else {
			System.out.println("Count is increased");
		}
	}


}

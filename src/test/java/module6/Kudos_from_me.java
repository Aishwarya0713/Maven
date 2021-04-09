package module6;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pageObject.Landingpage;
import resources.base;

	public class Kudos_from_me extends base {
		public void clickkudo() throws IOException {
			driver=initializeDriver();
			driver.get(prop.getProperty("url"));
			log1.info("Successfully opened the app");
			
			Landingpage l = new Landingpage(driver);
			l.Username().sendKeys("aishwarya.kurkoti@qualitestgroup.com");
			l.password().sendKeys("P@ssw0rd");
			l.login().click();
			log1.info("successfully entered username and password");
			
		}
		@Test
		
		public void kudofromme() throws IOException, InterruptedException, AWTException {
			clickkudo();
			WebElement wb = driver.findElement(By.xpath("//span[contains(.,'Kudos from me')]"));
			wb.click();
			Thread.sleep(3000);
		}

}


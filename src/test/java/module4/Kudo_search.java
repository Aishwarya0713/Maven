package module4;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pageObject.Landingpage;
import resources.base;

public class Kudo_search extends base {
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
	
	public void kudosearch() throws IOException, InterruptedException, AWTException {
		clickkudo();
		WebElement wb = driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div/div[5]/div/h5/a/span"));
		wb.click();
		Thread.sleep(3000);
		WebElement we = driver.findElement(By.xpath("//input[@list='globalUsers']"));
		we.sendKeys("seema ch");
		Thread.sleep(5000);
		
		Robot R = new Robot();
		R.keyPress(KeyEvent.VK_DOWN);
		R.keyPress(KeyEvent.VK_ENTER);
		R.keyPress(KeyEvent.VK_TAB);
		R.keyPress(KeyEvent.VK_ENTER);
		
		WebElement d =driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		d.click();
		
		
		
	}

}

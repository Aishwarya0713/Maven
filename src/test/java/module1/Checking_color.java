package module1;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.Color;
import org.testng.annotations.Test;

import pageObject.Landingpage;
import resources.base;

public class Checking_color extends base {
	@Test
	public void Checking_color() throws IOException {
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
	Set<String> colors = new HashSet<String>();
	colors.add("#fdcc160");
	colors.add("#2a2559");
	colors.add("ffffff");
	Landingpage p = new Landingpage(driver);
	String golden=Color.fromString(p.titlcolor().getCssValue("background-color")).asHex();
	String grey=Color.fromString(p.bodycolor().getCssValue("background-color")).asHex();
	String navy=Color.fromString(p.buttoncolor().getCssValue("background-color")).asHex();
	
	if(colors.contains(golden)) {
		System.out.println("Contains color");
	}
	else {
		System.out.println("take screenshot");
		File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("C:\\Users\\Qualitest\\Pictures\\Saved Pictures\\ss1.png"));
	}
	if(colors.contains(navy)) {
		System.out.println("Contains color");
	}
	else {
		System.out.println("take screenshot");
		File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("C:\\Users\\Qualitest\\Pictures\\Saved Pictures\\ss2.png"));
	}
	if(colors.contains(grey)) {
		System.out.println("Contains color");
	}
	else {
		System.out.println("take screenshot");
		File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("C:\\Users\\Qualitest\\Pictures\\Saved Pictures\\ss3.png"));
	}
	driver.close();
	}

}

package module1;

import java.io.IOException;

import org.testng.annotations.Test;

import junit.framework.Assert;
import resources.base;

public class CheckTitle extends base{
	@Test
	public void CheckTitle() throws IOException
	{
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
		Assert.assertEquals(driver.getTitle(), "QTRecognition");
		System.out.println("tested");
		driver.close();
		
		
	}
	

}

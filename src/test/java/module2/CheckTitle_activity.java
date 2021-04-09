package module2;

import java.io.IOException;

import org.testng.annotations.Test;

import junit.framework.Assert;
import resources.base;

public class CheckTitle_activity extends base {
	@Test
	public void activity_title() throws IOException
	{
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
		Assert.assertEquals(driver.getTitle(), "QTRecognition");
		System.out.println("tested");
		driver.close();
		
		
	}
	

}

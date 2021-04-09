package pageObject;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Activity {
	
	public WebDriver driver;

	By contact3=By.xpath("//a[@data-toggle='modal']");
	By contact4=By.xpath("//input[@placeholder='* Enter Name or Email Address']");
	By kudoCount=By.xpath("//*[@id='todayCount']");
	By k1=By.xpath("//*[@id=\"trophy_list\"]/div[1]/div/div");
	By k2=By.xpath("//*[@id=\"trophy_list\"]/div[2]/div/div");
	By k3=By.xpath("//*[@id=\"trophy_list\"]/div[3]/div/div");
	By k4=By.xpath("//*[@id=\"trophy_list\"]/div[4]/div/div");
	By k5=By.xpath("//*[@id=\"trophy_list\"]/div[5]/div/div");
	By k6=By.xpath("//*[@id=\"trophy_list\"]/div[6]/div/div");
	By k7=By.xpath("//*[@id=\"trophy_list\"]/div[7]/div/div");
	By k8=By.xpath("//*[@id=\"trophy_list\"]/div[8]/div/div");
	By contact6=By.xpath("//textarea[@class='form-control mb-2']");
	By contact7=By.xpath("//button[@class='btn btn-primary']");
	By kudossearch=By.xpath("(//div[@id=\"contact_list\"]//a[@href=\"#myModal\"])[1]");
    By kudos1=By.xpath("//body/div[@id='myModal']/div[1]/div[1]/form[1]/div[2]/div[3]/div[1]/div[1]/div[1]");
    By comments=By.xpath("//textarea[@id='comment']");
    By sendbutton=By.xpath("//button[contains(text(),'Send')]");
    By cancelbutton=By.xpath("//button[contains(text(),'Cancel')]");
	 
	public Activity(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement Sendkudos() {
		return driver.findElement(contact3);
	}
	public WebElement NameEmail() {
		
		return driver.findElement(contact4);
		
	}
public WebElement Kudo1() {
		
		return driver.findElement(k1);
		
	}
public WebElement Kudo2() {
	
	return driver.findElement(k2);
	
}
public WebElement Kudo3() {
	
	return driver.findElement(k3);
	
}
public WebElement Kudo4() {
	
	return driver.findElement(k4);
	
}
public WebElement Kudo5() {
	
	return driver.findElement(k5);
	
}
public WebElement Kudo6() {
	
	return driver.findElement(k6);
	
}
public WebElement Kudo7() {
	
	return driver.findElement(k7);
	
}
public WebElement Kudo8() {
	
	return driver.findElement(k8);
	
}

public WebElement comments() {
	
	return driver.findElement(contact6);
	
	
}
public WebElement send() {
	
	return driver.findElement(contact7);
	
	
}
public WebElement kudocount1() {
	
	return driver.findElement(kudoCount);
	
	
}
public void kudostype(String kudostype)
{
    WebElement kt=driver.findElement(By.xpath("//i[contains(text(),'"+kudostype+"')]/ancestor::center"));
    kt.click();
}
public WebElement RCKudosSearch() {
    return driver.findElement(kudossearch);
}
public WebElement Comments() {
    return driver.findElement(comments);
    
    
}
public WebElement SendButton() {
    return driver.findElement(sendbutton);
    
    
}
public WebElement CancelButton() {
    return driver.findElement(cancelbutton);
    
    
}

public void kudotype(String kudotype) {
	WebElement kt = driver.findElement(By.xpath("//i[contains(text(),'"+kudotype+"')]/ancestor::center"));
	kt.click();
}
public void takeScreenshot() throws IOException {
	File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src,new File("C:\\Users\\Qualitest\\Pictures\\Saved Pictures\\multiplekudo.png"));
	
}


}
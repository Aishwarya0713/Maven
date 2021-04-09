package module5;
	import java.awt.AWTException;
	import java.io.IOException;
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;
	import module3.Precon;
import pageObject.Activity;
	import resources.base;
	public class Recent_contacts extends base {
	    
	        @Test(dataProvider="logindata")
	        public void sk(String username,String password) throws IOException, AWTException, InterruptedException {
	        	Precon pc = new Precon();
	    		pc.PreCond(username, password);
	            Thread.sleep(1000);
	            Activity rc=new Activity(pc.driver);
	            rc.RCKudosSearch().click();
	            Thread.sleep(1000);
	            rc.kudostype("Exceptional Work");
	            rc.Comments().sendKeys("Good Work");
	            rc.SendButton().click();
	}
	        @DataProvider
	         public Object[][] logindata() {
	             Object[][]data =new Object[1][2];
	                
	                data[0][0]="aishwarya.kurkoti@qualitestgroup.com";
	                data[0][1]="P@ssw0rd";
	                return data;
	         }
	}
	 


package piit.AutomatinTrainingProgram;





import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.sql.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import M.common.Utility;
import PageObjectModel.ForgotPasswordPage;
import PageObjectModel.Home;

public class Signout extends Utility {
	
	
	
@Test
public void f() throws InterruptedException, IOException {
	  Home ob=new Home(driver);
	  ob.Email();
	  Pictures();
	  ob.PasswordFieldsEnters();
	  Thread.sleep(6000);
	  Pictures();
	  
	  Thread.sleep(6000);
	  ob.ForgotLinkClick();
	  ForgotPasswordPage id=new  ForgotPasswordPage(driver);
	  id.IdsSendKeys();
	  id.SearchButtonClick();
	  Thread.sleep(6000);
	  Pictures();
}
	@Test
	public void TextVerificationMethod() throws InterruptedException {
  driver.navigate().back();
  Thread.sleep(6000);
  ForgotPasswordPage id=new  ForgotPasswordPage(driver);
  String Questions=id.QuestionOfText();
  SoftAssert softit=new SoftAssert();
  
  softit.assertEquals("Please enter your email or mobile number to search for your account.",Questions);
  System.out.println("this is after assertion");
  softit.assertAll();
  
  }
	 @AfterClass
	  public void afterClass() {
		  driver.close();
	 }	  
	@Test
	public void Pictures() throws IOException {
		Date dt=new Date(0);
		String sk=dt.toString().replace(" ", "_").replace(":", "_");
        System.out.println(dt);
        System.out.println(sk);
		File screenshots=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		org.openqa.selenium.io.FileHandler.copy(screenshots, new File ("C:\\Users\\amgha\\eclipse-workspace\\AutomatinTrainingProgram\\pictures\\"+sk+"ShotOfPage.jpg"));
	  
}

}


	  


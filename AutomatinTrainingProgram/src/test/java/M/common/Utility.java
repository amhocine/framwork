package M.common;




import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Utility {
	public WebDriver driver;
 @Parameters({"browsers"})
  @BeforeClass
  public void beforeClass(String window) {
	
	if (window.equalsIgnoreCase("Chrome")) {
		  System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\amgha\\\\eclipse-workspace\\\\AutomatinTrainingProgram\\\\drivers\\\\chromedriver.exe");
		    driver=new ChromeDriver();
		driver   .navigate().to("http://www.facebook.com");
		 driver.manage().window().maximize();
	  }  
		 else if(window.equalsIgnoreCase("edge")) {
		  System.setProperty("webdriver.edge.driver","C:\\Users\\amgha\\eclipse-workspace\\AutomatinTrainingProgram\\drivers\\msedgedriver.exe");
		  driver= new EdgeDriver();
		 driver .navigate().to("http://www.facebook.com");
		 driver.manage().window().maximize();
	  }
	  	else if(window.equalsIgnoreCase("Firefox"))  {
		  System.setProperty("webdriver.gecko.driver", "C:\\Users\\amgha\\eclipse-workspace\\AutomatinTrainingProgram\\drivers\\geckodriver.exe");
		  driver=new FirefoxDriver();
		  driver .navigate().to("http://www.facebook.com");
		  driver.manage().window().maximize();
	  	}	  
  }
  @AfterClass
  public void afterClass() {
	  driver.close();
  }
		public void Pictures() throws IOException {
			Date dt=new Date();
			String sk=dt.toString().replace(" ", "_").replace(":", "_");
	        System.out.println(dt);
	        System.out.println(sk);
			File screenshots=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			org.openqa.selenium.io.FileHandler.copy(screenshots, new File ("C:\\Users\\amgha\\eclipse-workspace\\AutomatinTrainingProgram\\pictures\\"+sk+"ShotOfPage.jpg"));
		  
	}
}

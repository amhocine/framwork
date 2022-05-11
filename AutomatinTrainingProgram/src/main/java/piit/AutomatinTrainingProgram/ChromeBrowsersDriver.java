package piit.AutomatinTrainingProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowsersDriver {
    static WebDriver driver;
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
   System.setProperty("webdriver.chrome.driver","C:\\Users\\amgha\\eclipse-workspace\\AutomatinTrainingProgram\\drivers\\chromedriver.exe");
    driver=new ChromeDriver();
    driver.navigate().to("http://www.amazon.com");	 
    driver.manage()	 .window().maximize();
    driver.navigate().back();
    Thread.sleep(6000);	 
	driver.navigate().forward();
	Thread.sleep(6000);
	driver.navigate().refresh();
	String ur=driver.getCurrentUrl();
	System.out.println(ur);
	String windowhandle=driver.getWindowHandle();
	System.out.println(windowhandle);
	driver.close();
	}

}

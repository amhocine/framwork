package piit.AutomatinTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class llocators {
static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    driver.manage()	 .window().maximize();
	  System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\amgha\\\\eclipse-workspace\\\\AutomatinTrainingProgram\\\\drivers\\\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.navigate().to("http://www.amazon.com");	 
	 /* WebElement Searchfieldtxt=driver.findElement(By.name("field-keywords"));

	   Searchfieldtext.sendKeys("Computer") ;
	    WebElement Searchicon= driver.findElement(By.id("nav-search-submit-button"));
	    Searchicon.click();
	 WebElement searchicon=driver.findElement(By.id("id=\"nav-search-submit-button"));
	 WebElement linktx=driver.findElement(By.linkText("Registry"));
	 linktx.click();*/
	 WebElement outerto=driver.findElement(By.partialLinkText("Outer Range"));
	outerto.click();
	
	
	}

}
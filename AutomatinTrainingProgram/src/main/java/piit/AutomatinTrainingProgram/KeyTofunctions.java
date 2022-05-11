package piit.AutomatinTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyTofunctions {

static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\amgha\\eclipse-workspace\\AutomatinTrainingProgram\\drivers\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.navigate().to("http://www.amazon.com");	 
	    driver.manage()	 .window().maximize();
	    WebElement searchtofield=driver.findElement(By.id("twotabsearchtextbox"));
	    searchtofield.sendKeys("Computer");
	    Actions ob=new Actions(driver);
	    
		
		ob.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
	    Thread.sleep(6000);
	    
	    ob.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
	    searchtofield.clear();
	    Thread.sleep(6000);
	    searchtofield.click();
	    ob.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
	
	
	}

}

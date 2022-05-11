package piit.AutomatinTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class llocatored {
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\amgha\\eclipse-workspace\\AutomatinTrainingProgram\\drivers\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.navigate().to("http://www.amazon.com");	 
	    driver.manage()	 .window().maximize();
	    
	    WebElement searchtofield=driver.findElement(By.xpath("//input[@aria-label='Search']"));
	    searchtofield.sendKeys("desktop");
	   
	   
	    WebElement searchtoclick=driver.findElement(By.xpath("/html/body/div/header/div/div/div/div/form/div/div/span/input"));
	Thread.sleep(6000);
	searchtoclick.click();
	

		
	}

}

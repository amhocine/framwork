package piit.AutomatinTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class homedepot {


private static final WebElement Searchfieldtext = null;
static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\amgha\\eclipse-workspace\\AutomatinTrainingProgram\\drivers\\chromedriver.exe");
	     driver = new ChromeDriver();
	    driver.navigate().to("http://www.homedepot.com");	 
	    driver.manage()	 .window().maximize();
	   WebElement MyAccount=driver.findElement(By.id("headerMyAccount"));
	   MyAccount.click();
	   
	   WebElement RegisterAccount=driver.findElement(By.className("bttn__content"));
	   RegisterAccount.click();
	   Thread.sleep(6000); 
	 
	   WebElement PersonalAccount=driver.findElement(By.xpath("//*[text()='Select & Continue']"));
	  PersonalAccount.click();
	  Thread.sleep(6000);
	  
	  WebElement EmailAdress=driver.findElement(By.id("email"));
	  EmailAdress.sendKeys("HOCINE@YMAIL.COM");
	  Thread.sleep(6000);
	  
	  WebElement Password=driver.findElement(By.id("password-input-field"));
		Password.sendKeys("Hocine88$");
		Thread.sleep(6000);
		
		 WebElement ZibCode=driver.findElement(By.id("zipCode"));
		 ZibCode.sendKeys("19136");
		 Thread.sleep(6000);
		
		 WebElement PhoneNumber=driver.findElement(By.id("phone"));
		 PhoneNumber.sendKeys("6098260507");
		 Thread.sleep(6000);
		 
		 WebElement Keepmesignein=driver.findElement(By.xpath("//*[text()='Keep me signe in']"));
		 Keepmesignein.click();
		
		 WebElement VerifyMobile=driver.findElement(By.xpath("//*[@for='verify-phone-checkbox']"));
		 VerifyMobile.click();
		 Thread.sleep(6000);
		 
		 WebElement Robot=driver.findElement(By.id("recaptcha-anchor"));
		Robot.click();
	    
		WebElement CreateanAccount=driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/button/span"));
		CreateanAccount.click();
		Thread.sleep(6000);
	    
	    
	    
	  
	
	
	    
	 
	   
	}

	private static void findElement(String string) {
		// TODO Auto-generated method stub
		
	}

}

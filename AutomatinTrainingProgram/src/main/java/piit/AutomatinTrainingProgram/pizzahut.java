package piit.AutomatinTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pizzahut {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\amgha\\eclipse-workspace\\AutomatinTrainingProgram\\drivers\\chromedriver.exe");
	    ChromeDriver driver = new ChromeDriver();
	    driver.navigate().to("http://www.pizzahut.com");	 
	    driver.manage()	 .window().maximize();
	    
	    WebElement MenuTab=driver.findElement(By.className("MuiButton-label"));
	    MenuTab.click();
	    Thread.sleep(6000); 
		 
	    WebElement PizzaChoice=driver.findElement(By.className("ng-scope"));    
	    PizzaChoice.click();
	    Thread.sleep(6000); 
		 
	   
	    WebElement PopularPizza=driver.findElement(By.xpath("//*[@data-testid='menu-pizza-link']"));
	    PopularPizza.click();
	    Thread.sleep(6000);   
	    
	    WebElement CheesePizza=driver.findElement(By.className("ng-binding"));
	    CheesePizza.click();
	    Thread.sleep(6000); 
	    
	    WebElement Delivery=driver.findElement(By.className(" WebElement CheesePizza=driver.findElement(By."));
	    Delivery.click();
	    
	    WebElement FillTheAddress=driver.findElement(By.id("WebElement Delivery=driver.findElement(By"));
	    FillTheAddress.click();
	}

}

package piit.AutomatinTrainingProgram;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightto {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\amgha\\eclipse-workspace\\AutomatinTrainingProgram\\drivers\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.navigate().to("https://deluxe-menu.com/popup-mode-sample.html");	 
	    driver.manage()	 .window().maximize();
	 // TODO Auto-generated method stub
	    Thread.sleep(6000);
	    WebElement Picture =driver.findElement(By.xpath("//*[@style='cursor: pointure;']"));
	    Actions ob=new Actions(driver);
	    ob.contextClick(Picture);
	    
	}

}
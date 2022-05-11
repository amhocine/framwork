package piit.AutomatinTrainingProgram;

import org.testng.annotations.Test;

import M.common.Utility;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;

public class browsers extends Utility {
 

@Test
  public void f() {
	WebElement id=driver.findElement(By.name("email"));
	id.sendKeys("amgharhocine@ymail.com");
	WebElement password=driver.findElement(By.name("pass"));
	password.sendKeys("johnsilver");
	WebElement loginbutton=driver.findElement(By.name("login"));
	loginbutton.click();
  }
 

  }

  



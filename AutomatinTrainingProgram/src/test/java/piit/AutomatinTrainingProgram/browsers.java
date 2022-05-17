package piit.AutomatinTrainingProgram;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import M.common.Utility;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;

@Test
public class browsers extends Utility {
 

public void f() {
	WebElement id=driver.findElement( By.name("email"));
	id.sendKeys("Silem@piit");
	WebElement password=driver.findElement( By.name("pass"));
	password.sendKeys("johnsilver");
	WebElement loginbutton=driver.findElement( By.name("login"));
	loginbutton.click();
  }
 

  }

  



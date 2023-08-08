package session_11;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Add_Remove {
	WebDriver driver;
  @Test(priority=0)
  public void link() throws InterruptedException {
	  driver.findElement(By.cssSelector("#content > ul > li:nth-child(2) > a")).click();
	  driver.findElement(By.cssSelector("#content > div > button")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id='elements']/button")).click();
	  Thread.sleep(2000);
  }
  @BeforeMethod 
  public void beforeMethod() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop"
				+ "\\selenium\\Browser Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}

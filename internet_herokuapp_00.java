package testNG_88;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class internet_herokuapp_00 {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  driver.findElement(By.cssSelector("#content > ul > li:nth-child(31) > a")).click();
	  Thread.sleep(2000);
	  driver.get("https://the-internet.herokuapp.com/");
	  Thread.sleep(2000);
	  driver.findElement(By.cssSelector("#content > ul > li:nth-child(32) > a")).click();
	  Thread.sleep(2000);
	  driver.get("https://the-internet.herokuapp.com/");
	  Thread.sleep(2000);
	  driver.findElement(By.cssSelector("#content > ul > li:nth-child(33) > a")).click();
	  Thread.sleep(2000);
	  driver.get("https://the-internet.herokuapp.com/");
	  Thread.sleep(2000);
	  driver.findElement(By.cssSelector("#content > ul > li:nth-child(34) > a")).click();
	  Thread.sleep(2000);
	  driver.get("https://the-internet.herokuapp.com/");
	  Thread.sleep(2000);
	  driver.findElement(By.cssSelector("#content > ul > li:nth-child(35) > a")).click();
	  Thread.sleep(2000);
	  driver.get("https://the-internet.herokuapp.com/");
	  Thread.sleep(2000);
	  driver.findElement(By.cssSelector("#content > ul > li:nth-child(36) > a")).click();
	  Thread.sleep(2000);
	  driver.get("https://the-internet.herokuapp.com/");
	  Thread.sleep(2000);
	  driver.findElement(By.cssSelector("#content > ul > li:nth-child(37) > a")).click();
	  Thread.sleep(2000);
	  driver.get("https://the-internet.herokuapp.com/");
	  Thread.sleep(2000);
	  driver.findElement(By.cssSelector("#content > ul > li:nth-child(38) > a")).click();
	  Thread.sleep(2000);
	  driver.get("https://the-internet.herokuapp.com/");
	  Thread.sleep(2000);
	  driver.findElement(By.cssSelector("#content > ul > li:nth-child(39) > a")).click();
	  Thread.sleep(2000);
	  driver.get("https://the-internet.herokuapp.com/");
	  Thread.sleep(2000);
	  driver.findElement(By.cssSelector("#content > ul > li:nth-child(40) > a")).click();
	  Thread.sleep(2000);
	  driver.get("https://the-internet.herokuapp.com/");
	  Thread.sleep(2000);
	  driver.findElement(By.cssSelector("#content > ul > li:nth-child(41) > a")).click();
	  Thread.sleep(2000);
	  driver.get("https://the-internet.herokuapp.com/");
	  Thread.sleep(2000);
	  driver.findElement(By.cssSelector("#content > ul > li:nth-child(42) > a")).click();
	  Thread.sleep(2000);
	  driver.get("https://the-internet.herokuapp.com/");
	  Thread.sleep(2000);
	  driver.findElement(By.cssSelector("#content > ul > li:nth-child(43) > a")).click();
	  Thread.sleep(2000);
	  driver.get("https://the-internet.herokuapp.com/");
	  Thread.sleep(2000);
	  driver.findElement(By.cssSelector("#content > ul > li:nth-child(44) > a")).click();
	  Thread.sleep(2000);
	  driver.get("https://the-internet.herokuapp.com/");
	  Thread.sleep(2000);
	  driver.findElement(By.cssSelector("#page-footer > div > div > a")).click();
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

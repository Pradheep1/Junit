package org.test;
import java.sql.Driver;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junit {
static WebDriver driver;

@BeforeClass
	public static void beforeclass() {
	System.setProperty("webDriver.chrome.driver", "F:\\JunitMaven\\Driver\\chromedriver.exe");
 driver=new ChromeDriver();
	System.out.println("Browser Launch");
	}
@AfterClass
public static void AfterClass() {
	driver.quit();
	System.out.println("Quit");
}

@Before
public void before() {
	Date d = new Date();
	System.out.println(d);
}

@After
public void After() {
	Date d = new Date();
	System.out.println(d);
}

@Test
public void Test() {
 driver.get("https://www.facebook.com/");
WebElement f1 = driver.findElement(By.id("email"));
f1.sendKeys("pradheep@gmail.com");

WebElement f2 = driver.findElement(By.id("pass"));
f2.sendKeys("23546");

WebElement f3 = driver.findElement(By.id("login button"));
f3.click();

}
}

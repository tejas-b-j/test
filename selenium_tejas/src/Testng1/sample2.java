package Testng1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class sample2 
{
	@ Test
	public void test()
	{
		System.setProperty("webdriver.gecko.driver","./browserfiles/geckodriver.exe");
		 WebDriver driver = new FirefoxDriver();
		driver.get("http://localhost/login.do");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String title = driver.getTitle();
		Assert.assertEquals(title, "actiTIME - Login");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
	    driver.findElement(By.xpath("//div[.='Login ']")).click();
		
	}
	

}

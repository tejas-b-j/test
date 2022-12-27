package practice;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Meesho 
{
	@Test
	public void test() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./browserfiles/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.meesho.com/");
		driver.findElement(By.xpath("(//input[@type='text'][1])[1]")).sendKeys("watch for boys");
		driver.findElement(By.xpath("//div[.='Analog Watches']")).click();
		driver.findElement(By.xpath("//p[.='Black']")).click();
		pom p = new pom(driver);
	    /*Point loc = ele.getLocation();
		int x=loc.getX();
		int y=loc.getY();
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy("+x+","+y+")");*/
		Thread.sleep(2000);
		p.link();
		WebElement sre = driver.findElement(By.xpath("//h4[.='₹163']"));
		String value = sre.getText();
		System.out.println(value);
		String value1 = value.replaceAll(",", "");
		String value2 = value1.replaceFirst("₹", "");
	    Integer.parseInt(value2);
	    Assert.assertEquals(value2,"163");
	    driver.findElement(By.xpath("//span[.='Add to Cart']")).click();
	    driver.quit();
		
		}
	}

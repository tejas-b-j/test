package practice;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Bookmy_show {
	@Test
	public void test() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./browserfiles/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://in.bookmyshow.com/explore/home/bengaluru");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//div[.='Vedha'][1])[1]")).click();
		driver.findElement(By.xpath("(//span[.='Book tickets'][1])[1]")).click();
		driver.findElement(By.xpath("//button[.='Not Now']")).click();
		/*Alert al = driver.switchTo().alert();
		Thread.sleep(2000);
		al.accept();*/
		driver.findElement(By.xpath("//a[.='Bharathi Theatre (Peenya) A/C 4K Digital Cinema']")).click();
		driver.findElement(By.xpath("//div[.='							09:45 PM					']")).click();
		driver.findElement(By.xpath("//div[@id='btnPopupAccept']")).click();
		/*String m_id = driver.getWindowHandle();
		Set<String> all_id = driver.getWindowHandles();
		all_id.remove(m_id);
		Thread.sleep(2000);
		for(String id:all_id)
		{
			driver.switchTo().window(id);
			driver.close();
			
		}*/
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='__list']//li[.='2']")).click();
		Thread.sleep(2000);
		  driver.findElement(By.xpath("//div[@id='proceed-Qty']")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//td[@class='SRow1']//div[@id='A_2_05']")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//td[@class='SRow1']//div[@id='A_2_09']")).click();
		  Thread.sleep(2000);
		  WebElement sre = driver.findElement(By.xpath("//span[.='Rs.260.00']"));
		 String srs = sre.getText();
		 System.out.println(srs);
		 driver.close();
		}
	}

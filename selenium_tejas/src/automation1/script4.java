package automation1;

import org.openqa.selenium.chrome.ChromeDriver;

public class script4 
{
	public static void main(String[] args) 
	{
		String key="webdriver.chrome.driver";
		String value="./browserfiles/chromedriver.exe";
		System.setProperty(key, value);
		ChromeDriver ch=new ChromeDriver();
		ch.get("https://facebook.com");
		
		
	}

}

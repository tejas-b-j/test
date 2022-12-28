package automation1;

import org.openqa.selenium.firefox.FirefoxDriver;

public class script2 
{public static void main(String[] args) 
{
	String key="webdriver.gecko.driver";
	String value="./browserfiles/geckodriver.exe";
	System.setProperty(key, value);
	FirefoxDriver fx = new FirefoxDriver();
	

}

}



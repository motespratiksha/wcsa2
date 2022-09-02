package launchBrowser;

import org.openqa.selenium.firefox.FirefoxDriver;

public class launchFirefox
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		new FirefoxDriver();
	}
}
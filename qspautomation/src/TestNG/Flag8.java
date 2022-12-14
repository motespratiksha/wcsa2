package TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Flag8 {
	WebDriver driver;
	@Parameters("browser")
	
	@Test()
	public void loginActiTime(String browservalue)
	{
		if(browservalue.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
			driver.get("https://www.google.com");
			driver.switchTo().activeElement().sendKeys("chrome");
		}
		else if(browservalue.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
			driver.get("https://www.google.com");
			driver.switchTo().activeElement().sendKeys("firefox");

		}
	}
}

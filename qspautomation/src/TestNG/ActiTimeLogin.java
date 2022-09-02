package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class ActiTimeLogin 
{
	WebDriver driver;
	@Parameters({"browser","username","password"})
	@Test
	public void actiTimeLogin(String browserValue,String validUsername,String validPassword)
	{
		if(browserValue.equalsIgnoreCase("chrome"))
				{
					System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
					driver=new ChromeDriver();
					driver.manage().window().maximize();
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
					driver.get("http://127.0.0.1/login.do;jsessionid=ub974rkesmmi");	
					driver.findElement(By.name("username")).sendKeys("admin");
					driver.findElement(By.name("pwd")).sendKeys("manager");
					driver.findElement(By.id("loginButton")).click();
					driver.close();
				}
				else if(browserValue.equalsIgnoreCase("firefox"))
				{
					System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
					driver=new FirefoxDriver();
					driver.manage().window().maximize();
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
					driver.get("http://127.0.0.1/login.do;jsessionid=ub974rkesmmi");	
					driver.findElement(By.name("username")).sendKeys("admin");
					driver.findElement(By.name("pwd")).sendKeys("manager");
					driver.findElement(By.id("loginButton")).click();
					driver.close();}
	}
}

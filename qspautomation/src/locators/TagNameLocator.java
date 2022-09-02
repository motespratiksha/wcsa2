package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocator
{
	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do;jsessionid=ub974rkesmmi");

		//how to use tagname locator
		driver.findElement(By.tagName("input")).sendKeys("admin");
	}
}


	



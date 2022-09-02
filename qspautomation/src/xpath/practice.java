package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		
	   driver.findElement(By.xpath("//img[contains(@class,'rounded selenium') or contains(@class,'1-strong rounded selenium')or contains(@class,'shadow-1-strong')]")).click();
	
		
	}

}

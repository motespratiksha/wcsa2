package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Way4 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		String text = driver.findElement(By.xpath("//h4[contains(@class,'selenium')or contains(@class,'ide')or contains(@class,'grid')]")).getText();
		System.out.println(text);
		
		
		
	

	}

}

package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.flipkart.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Cart']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _1sbqEe _3AWRsL']")).click();
		
	}

}

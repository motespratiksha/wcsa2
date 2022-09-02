package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagarm {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.instagram.com");
	
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("pratu");
	

		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123");
	

		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}

}

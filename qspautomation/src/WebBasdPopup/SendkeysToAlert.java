package WebBasdPopup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SendkeysToAlert {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://omayo.blogspot.com");
		
		driver.findElement()
		Alert al = driver.switchTo().alert();
		Thread.sleep(2000);
		al.sendKeys("automation");
		
		
		
		
		
	}

}

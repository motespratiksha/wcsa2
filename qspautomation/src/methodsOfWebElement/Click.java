package methodsOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click {

	public static void main(String[] args) throws InterruptedException
	{
	 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	 WebDriver driver= new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.google.com");
	 Thread.sleep(3000);
    WebElement add = driver.findElement(By.name("btnI"));
              add.click();

	}

}

package Robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robot1AnyApp {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.selenium.dev");
		
        WebElement target = driver.findElement(By.xpath("//span[.='Downloads']"));
        Actions act = new Actions(driver);
        act.contextClick(target).perform();
        Robot robot = new Robot();
        
        for(int i=0;i<=5;i++ )
        {
        	robot.keyPress(KeyEvent.VK_DOWN);
        	
        	robot.keyRelease(KeyEvent.VK_DOWN);
        	Thread.sleep(2000);
        }
        	
        	  robot.keyPress(KeyEvent.VK_ENTER); 
        	  robot.keyRelease(KeyEvent.VK_ENTER);
        
	}

}

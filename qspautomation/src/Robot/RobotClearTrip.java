package Robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotClearTrip {

	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	    driver.get("https://www.cleartrip.com/flights");
	    Thread.sleep(4000);
	    WebElement target = driver.findElement(By.xpath("//h2[@class='fs-6 px-4 c-neutral-400 fw-400']"));
	    
	    Actions act=new Actions(driver);
	    for(int i=0;i<=2;i++)
	    {
			act.clickAndHold(target).perform();
	    	
	    }
	    Thread.sleep(3000);
	    Robot robot=new Robot();
	    robot.keyPress(KeyEvent.VK_CONTROL);
	    robot.keyPress(KeyEvent.VK_C);
	    robot.keyRelease(KeyEvent.VK_C);
	    robot.keyRelease(KeyEvent.VK_CONTROL);
	    Thread.sleep(3000);
	    
	    driver.navigate().to("https://www.google.com");
	    driver.findElement(By.name("q"));
	    
	    robot.keyPress(KeyEvent.VK_CONTROL);
	    robot.keyPress(KeyEvent.VK_V);
	    robot.keyRelease(KeyEvent.VK_V);
	    robot.keyRelease(KeyEvent.VK_CONTROL);
	    Thread.sleep(3000);
	    
	    driver.findElement(By.name("btnk")).click();
	    
	    
	    
	    
	
	}
}
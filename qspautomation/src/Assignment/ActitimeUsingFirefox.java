package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ActitimeUsingFirefox 
{

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do;jsessionid=10ab20ua190i7");
	
		WebElement loginpage = driver.findElement(By.xpath("//td[text()='Please identify yourself']"));
		boolean status = loginpage.isDisplayed();
		System.out.println(status);
	

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
	

		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		

		driver.findElement(By.xpath("//a[@id='loginButton']")).click();


		WebElement homepage = driver.findElement(By.xpath("//td[text()='Enter Time-Track']"));
		boolean status1 = homepage.isDisplayed();
		System.out.println(status1);
	}

}

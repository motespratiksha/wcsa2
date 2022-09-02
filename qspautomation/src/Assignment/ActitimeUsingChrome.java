package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActitimeUsingChrome {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do;jsessionid=10ab20ua190i7");

		String loginPageTitle = driver.getTitle();
		if(loginPageTitle.equals("actiTIME - Login"))
		{
			System.out.println("login page title is verified | test case is passed");
		}
		else
		{
			System.out.println("login page title is not verified | test case is not passed");

		}

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");


		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");


		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(2000));//Explicitly wait method
		wait.until(ExpectedConditions.titleContains("actiTIME - Enter Time-Track")); //explicitly wait

		String homePageTitle = driver.getTitle();
		if(homePageTitle.equals("actiTIME - Enter Time-Track"))
		{
			System.out.println("login page title is verified | test case is passed");
		}     
		else
		{
			System.out.println("login page title is not verified | test case is not passed");
		}
	}

}



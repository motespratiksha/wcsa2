package methodsOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Pratiksha/Desktop/web%20page/checkbox.html");
		
	WebElement loginbutton = driver.findElement(By.id("sql"));
	loginbutton.click();
	boolean status = loginbutton.isSelected();
	System.out.println(status);

	}

}

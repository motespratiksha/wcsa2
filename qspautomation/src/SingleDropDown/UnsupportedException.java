package SingleDropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UnsupportedException {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Pratiksha/Desktop/web%20page/singleselectdropdown.html");
		
		Thread.sleep(3000);
		WebElement ssdropdown = driver.findElement(By.name("menu"));
		Select sel = new Select(ssdropdown);
		sel.selectByVisibleText("omlet");
		sel.deselectAll();

	}

}

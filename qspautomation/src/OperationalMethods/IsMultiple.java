package OperationalMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultiple {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Pratiksha/Desktop/web%20page/multiselectdropdown.html");
		WebElement dropdown = driver.findElement(By.id("menu"));
				Select s1 = new Select(dropdown);
		boolean status = s1.isMultiple();
		System.out.println(status);
		Thread.sleep(1000);

	}

}

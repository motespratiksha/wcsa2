package OperationalMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectedOption {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Pratiksha/Desktop/web%20page/multiselectdropdown.html");
		WebElement dropdown = driver.findElement(By.id("menu"));
		
		Select sel = new Select(dropdown);
		
		for(int i=2;i<=6;i++)
		{
			sel.selectByIndex(i);
		}
	   	    WebElement op = sel.getFirstSelectedOption();
           String TextOfFirstSelectedOption = op.getText();
           System.out.println(TextOfFirstSelectedOption);
	}

}

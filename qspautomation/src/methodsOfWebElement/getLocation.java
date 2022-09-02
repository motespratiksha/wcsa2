package methodsOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getLocation 
{

	public static void main(String[] args) 
	{
	   System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	   WebDriver driver= new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://www.instagram.com");
	   
	   WebElement loginbutton = driver.findElement(By.xpath("//div[.='Log In']"));
	   Point point = loginbutton.getLocation();
	   int xaxis = point.getX();
       int yaxis = point.getY();
       
       System.out.println("the parameter of login button is as follows");
       System.out.println("xaxis distance:"+xaxis);
       System.out.println("yaxis distance:"+yaxis);
	}

}

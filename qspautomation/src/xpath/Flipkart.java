package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException
	{
	   System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	   WebDriver driver= new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://www.flipkart.com");
	   Thread.sleep(8000);
	   
	   driver.findElement(By.xpath("//button[text()='✕']")).click();
	   Thread.sleep(3000);

	   driver.findElement(By.name("q")).sendKeys("samsung f22");
	   Thread.sleep(3000);
	   
	   driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	   Thread.sleep(3000);

	   String samsungprice = driver.findElement(By.xpath("//div[text()='SAMSUNG Galaxy F22 (Denim Blue, 128 GB)']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']")).getText();
	   System.out.println(samsungprice);

	}

}

package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class calculator {

	public static void main(String[] args) throws InterruptedException
	{
	   System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	   WebDriver driver= new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://www.calculator.net");
	   Thread.sleep(3000);
	   
	   driver.findElement(By.xpath("//span[.='3']")).click();
	   driver.findElement(By.xpath("//span[.='0']")).click();
	   driver.findElement(By.xpath("//span[.='2']")).click();
	   driver.findElement(By.xpath("//span[.='+']")).click();
	   driver.findElement(By.xpath("//span[.='2']")).click();
	   driver.findElement(By.xpath("//span[.='0']")).click();
	   driver.findElement(By.xpath("//span[.='0']")).click();
	   driver.findElement(By.xpath("//span[.='=']")).click();
	   
	   String result = driver.findElement(By.xpath("//div[@id='sciOutPut']")).getText();
	   System.out.println("Result:"+result);
	   
	   Thread.sleep(3000);
	   
	   driver.findElement(By.xpath("//span[.='8']")).click();
	   driver.findElement(By.xpath("//span[.='0']")).click();
	   driver.findElement(By.xpath("//span[.='0']")).click();
	   driver.findElement(By.xpath("//span[.='–']")).click();
	   driver.findElement(By.xpath("//span[.='2']")).click();
	   driver.findElement(By.xpath("//span[.='0']")).click();
	   driver.findElement(By.xpath("//span[.='0']")).click();
	   driver.findElement(By.xpath("//span[.='=']")).click();
	   
	   String result1 = driver.findElement(By.xpath("//div[@id='sciOutPut']")).getText();
	   System.out.println("Result:"+result1);
	   
	   String value="500";
	    if(value.equalsIgnoreCase(result.trim()))
	    {
	    	System.out.println("verified");
	    }
	    else
	    {
	    	System.out.println("Not verified");
	    }
	  
	}
}
	
	

//span[.='AC']
//span[.='=']
//span[.='3']
//span[.='0']
//span[.='2']
//span[.='5']
//span[.='+']
//span[.='8']
//span[.='4']
//span[.='–']
//span[.='×']
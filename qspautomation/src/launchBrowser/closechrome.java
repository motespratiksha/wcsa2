package launchBrowser;

import org.openqa.selenium.chrome.ChromeDriver;

public class closechrome
{

	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe"); //To handle IllegalStateException
	ChromeDriver driver = new ChromeDriver();  //open chrome browser
	driver.manage().window().maximize();    //maximize window of insta browser
	driver.get("https://www.instagram.com"); //launching insta browser
	Thread.sleep(5000);//delay of 5sec
	driver.close();//close the browser
	

	}

}


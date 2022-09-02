package dataDrivenFrameWork;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeLogin {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://127.0.0.1/login.do;jsessionid=ub974rkesmmi");
		
		 Flib flib = new Flib();
		  String username = flib.readExcelData("./Data/TestDataAct.xlsx", "validcreds",1,0);
		  String password = flib.readExcelData("./Data/TestDataAct.xlsx", "validcreds",1,1);
		  
		  driver.findElement(By.name("username")).sendKeys(username);
		  driver.findElement(By.name("pwd")).sendKeys(password);
		  
		  driver.findElement(By.id("loginButton")).click();
		  
		  
		  
		  
		  		
		 
}

}

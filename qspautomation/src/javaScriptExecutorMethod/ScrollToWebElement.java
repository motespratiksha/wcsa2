package javaScriptExecutorMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollToWebElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.selenium.dev");

		//Scroll to web element
		WebElement element = driver.findElement(By.xpath("//h4[text()='Selenium Grid']"));
		Point loc = element.getLocation();
		int xaxis = loc.getX();
		int yaxis = loc.getY();

		System.out.println(yaxis);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy("+xaxis+","+(yaxis-200)+")");



	}

}

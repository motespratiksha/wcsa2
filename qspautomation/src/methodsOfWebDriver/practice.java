package methodsOfWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Bike");
		Thread.sleep(3000);
		List<WebElement> webElementSuggestion = driver.findElements(By.xpath("//div[@class='wM6W7d']"));

		for(WebElement sugg:webElementSuggestion)
		{
			String webElementText = sugg.getText();
			System.out.println(webElementText);
		}

		for(int i=0;i<webElementSuggestion.size();i++)
		{
			        WebElement sugg = webElementSuggestion.get(i);
					String textOfwebElement = sugg.getText();
					System.out.println(textOfwebElement);
		}
	}


}
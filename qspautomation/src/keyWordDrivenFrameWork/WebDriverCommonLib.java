package keyWordDrivenFrameWork;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WebDriverCommonLib extends BaseTest{
	
	//get options of dropdown
	public void getAllOptionsOfDropdown(WebElement element)
	{
		Select sel=new Select(element);
		List<WebElement> allOps = sel.getOptions();
		for(WebElement op:allOps)
		{
			String textOfOption = op.getText();
			System.out.println(textOfOption);
			
		}
		
	
	
	}

	
	

}

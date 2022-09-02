package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	//Declaration
	@FindBy(name="usersSelector.selectedUser")private WebElement enterTimeTrackDropDown;
	@FindBy(xpath="//a[contains(text(),' new tasks')]")private WebElement createNewTaskLink;
	@FindBy(id="SubmitTTButton")private WebElement saveLeaveTimeButton;
	@FindBy(xpath="//a[text()='Logout']")private WebElement logoutLink;
	
	//initialization
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	//utilization
	public WebElement getEnterTimeTrackDropDown() {
		return enterTimeTrackDropDown;
	}

	public WebElement getCreateNewTaskLink() {
		return createNewTaskLink;
	}

	public WebElement getSaveLeaveTimeButton() {
		return saveLeaveTimeButton;
	}

	public WebElement getLogoutLink() {
		return logoutLink;
	}
	
	
	//operational methods
	public void logoutActiTime()
	{
		logoutLink.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
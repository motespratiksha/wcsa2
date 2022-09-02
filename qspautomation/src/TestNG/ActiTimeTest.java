package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ActiTimeTest {
  @Test(priority=3)
  public void loginActiTime()
  {
	  Reporter.log("LoginActiTime",true);
  }
  
  @Test(priority=2)
  public void createUserActiTime()
  {
	  Reporter.log("Create User Actitime",true);
  }
  
  @Test(priority=1)
  public void logoutActiTime()
  {
	  Reporter.log("logout ACtitime",true);
  }
}

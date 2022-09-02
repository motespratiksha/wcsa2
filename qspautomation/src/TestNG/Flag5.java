package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag5{
	      
	 @Test
	  public void actiTimeLogin()
	  {
		 
		  Reporter.log("Login successful",true);	  
	  }
	  
	  @Test(dependsOnMethods="actiTimeLogin")
	  public void actiTimeCreateUser()
	  {
		  int i=9/0;
		  System.out.println(i);
		  Reporter.log("create user",true);
	  }
	  
	  @Test(dependsOnMethods="actiTimeCreateUser",alwaysRun=true)
	  public void actiTimeLogout()
	  {
		  Reporter.log("logout successful",true);
	  }
}


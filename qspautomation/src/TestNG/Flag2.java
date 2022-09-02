package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag2 {
	
	//This test will not run itself ......It is disabled..!	
  @Test(enabled=false)
  public void method1() 
  {
	Reporter.log("actiTime valid",true);  
  }
  @Test
  public void method2()
  {
	Reporter.log("ActiTime Create User",true);  
  }
  @Test
  public void method3()
  {
	 Reporter.log("ActiTime create reports",true); 
  }
}

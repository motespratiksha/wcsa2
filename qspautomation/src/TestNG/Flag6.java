package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag6 {
  @Test(groups="FUNCTIONAL")
  public void ft1() 
  {
	  Reporter.log("Functional Test Case 1",true);
  }
  @Test(groups="INTEGRATION")
  public void It1() 
  {
	  Reporter.log("Integration Test Case 1",true);
  }
  @Test(groups="SMOKE")
  public void st1() 
  {
	  Reporter.log("Smoke Test Case 1",true);
  }
  //---------------------------------------------------------------
  @Test(groups="FUNCTIONAL")
  public void ft2() 
  {
	  Reporter.log("Functional Test Case 2",true);
  }
  @Test(groups="INTEGRATION")
  public void it2() 
  {
	  Reporter.log("INTEGRATION Test Case 2",true);
  }
  @Test(groups="SMOKE")
  public void St2() 
  {
	  Reporter.log("Smoke Test Case 2",true);
  }
  //--------------------------------------------------------------------
  @Test(groups="FUNCTIONAL")
  public void ft3() 
  {
	  Reporter.log("Functional Test Case 3",true);
  }
  @Test(groups="INTEGRATION")
  public void it3() 
  {
	  Reporter.log("Integration Test Case 3",true);
  }
  @Test(groups="SMOKE")
  public void St3() 
  {
	  Reporter.log("Smoke Test Case 3",true);
  }
  //-----------------------------------------------------
  @Test(groups="FUNCTIONAL")
  public void ft4() 
  {
	  Reporter.log("Functional Test Case 4",true);
  }
  @Test(groups="INTEGARTION")
  public void it4() 
  {
	  Reporter.log("integration Test Case 4",true);
  }
  @Test(groups="SMOKE")
  public void St4() 
  {
	  Reporter.log("Smoke Test Case 4",true);
  }
  //-------------------------------------------------------
  @Test(groups="FUNCTIONAL")
  public void ft5() 
  {
	  Reporter.log("Functional Test Case 5",true);
  }
  @Test(groups="INTEGRATION")
  public void it5() 
  {
	  Reporter.log("Integration Test Case 5",true);
  }
  @Test(groups="SMOKE")
  public void st5() 
  {
	  Reporter.log("Smoke Test Case 5",true);
  }
  //--------------------------------------------------------
  @Test(groups="FUNCTIONAL")
  public void ft6() 
  {
	  Reporter.log("Functional Test Case 6",true);
  }
  @Test(groups="INTEGRATION")
  public void It6() 
  {
	  Reporter.log("Integration Test Case 6",true);
  }
  @Test(groups="SMOKE")
  public void St6() 
  {
	  Reporter.log("Smoke Test Case 6",true);
  }
 // ---------------------------------------------------- 
  
}

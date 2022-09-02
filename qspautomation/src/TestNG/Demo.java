package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
  @Test
  public void  A()
  {
	  Reporter.log("Hi I am from method A",true);
	  
  }
}

package Frame_Work;

import org.testng.annotations.Test;

public class Method_Description {
  @Test(description =" verifying login with valid data")
  public void m1()
  {
	  System.out.println("Login Test Passed");
	  
  }
	  @Test(description ="verifying login with  Invalid data" )
	  public void Tc001()
	  {
		  System.out.println("Login Test failed ");
		  
	  }
  
}

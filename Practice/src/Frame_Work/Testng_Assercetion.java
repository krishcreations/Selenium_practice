package Frame_Work;

import org.testng.Reporter;
import org.testng.annotations.Test;

import org.testng.Assert;

public class Testng_Assercetion {
  @Test
  public void tc_001() 
  {
	  org.testng.Assert.assertEquals("gmail", "Instagram");
  Reporter.log("Instagram Title is verified");
  }
  @Test
  public void tc_002()
  {
	  org.testng.Assert.assertEquals("gmail", "gmail");
	  Reporter.log("gmail title is verified");
  }
  @Test
  public void tc_003()
  {
	 org.testng.Assert.assertTrue(true);
	 Reporter.log("Gmail title is verified");
  }
  
  
}

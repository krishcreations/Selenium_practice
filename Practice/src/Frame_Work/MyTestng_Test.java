package Frame_Work;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTestng_Test {
  @Test
  public void f1() {
	  Reporter.log("f1 success",true);
  }
  @Test 
  public void f2 ()
  {
	  Reporter.log(" f2 success",true);
  }
  @Test
  public void f3 ()
  {
	  Reporter.log(" f3 success",true);
  }
  
}

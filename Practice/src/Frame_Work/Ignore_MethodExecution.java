package Frame_Work;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ignore_MethodExecution {
  @Test(enabled =true ,priority = 0)
  public void m1 () {
	  Reporter.log("m1 excecuted" ,true);
  }
  @Test(priority =1)
  public void m2 ()
  {
	  Reporter.log("m1 success" , true);
  }
  @Test(priority = 2,enabled = true)
  public void m3 ()
  
  {
	  Reporter.log("m2 success",false);
  }
}

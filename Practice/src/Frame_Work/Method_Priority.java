package Frame_Work;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Method_Priority {
	@Test( priority = 0)
	public void f1()
	{
		Reporter.log("f method excuted", true);
	}
	@Test(priority = 1)
	public void f2 ()
	{
		Reporter.log("a method executed ",true);
	}
	@Test(priority = 2)
	public void f3 ()
	{
		Reporter.log("f3 success",true);
	}
}

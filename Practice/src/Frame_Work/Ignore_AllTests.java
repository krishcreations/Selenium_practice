package Frame_Work;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ignore_AllTests {
	@Test
	public void f() {
		Reporter.log("Test Executed",true);
	}
	@Test(enabled = false )
	public void tc002() {

		Reporter.log("Test2 executed",true);
	}
	@Test
	public void tc03()
	{
		Reporter.log("Test3 excuted ",true);
	}
}

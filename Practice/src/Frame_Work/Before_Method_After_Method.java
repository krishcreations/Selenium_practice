package Frame_Work;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Before_Method_After_Method {
  @Test
  public void m1 () {
	  System.out.println("tc 001 executed ");
  }
  @Test
  public void m2 () {
	  System.out.println("tc 002 executed ");
  }
  @Test
  public void m3 () {
	  System.out.println("Tc 003 executed");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Pre conditon ");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Post condition ");
  }

}

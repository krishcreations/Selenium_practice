package Frame_Work;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Before_After_Class {
  @Test
  public void m1() {
	  System.out.println(" tc 001  is executed");
  }
  @Test
  public void m2 ()
  {
	  System.out.println("tc 002 is executed ");
	  
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("Pre condition ");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("POST CONDITION");
  }

}

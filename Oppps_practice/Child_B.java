package Oppps_practice;

public class Child_B extends Child_A
{
	
	public void method3 () {
		Method1(); //parent class 
		method2(); // From child_A class
	
	}

	public static void main(String[] args) {

		Child_B abc = new Child_B();
		abc.Method1();  // parent class method
		abc.method2();  //child_A class method
	//	abc.method3();  // child_b class method
		Parent ref = new Child_B();
		ref.Method1(); // parent class
		
		
	}

}

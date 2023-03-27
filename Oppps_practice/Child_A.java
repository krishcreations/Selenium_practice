package Oppps_practice;

public class Child_A extends Parent
{

	String email="info@gmail.com";
	public void method2()
	{
		System.out.println(name);//parent class
		Method1();//parent class
	}
	public static void main(String[] args) {
		//create object for  current class

	Child_A obj = new Child_A();
	obj.Method1();//Method from parent class
	obj.method2(); // method from child_A class
	
	// object creation with parent class reference
	
	Parent ref = new Child_A();
	ref.Method1();
	
	
	}






}

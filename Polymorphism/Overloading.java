package Polymorphism;

public class Overloading {

	public void print_product() {
		System.out.println("iphone");
	}
	public void print_product(double price)	{
		System.out.println("iphone"+" "+"price");
	}
	public void print_product(String colour,double price)	{
		System.out.println("iphone"+"  "+"colour"+""+"price");
	}
	public void print_product(double price ,String colour) {
		System.out.println("iphone"+" "+"price"+" "+"colour");
	}
	public static void main(String[] args) {
		Overloading obj = new Overloading();
		obj.print_product(100000.99);
		obj.print_product("blue ", 188888.00);
	}


}


package opps.Interface;

interface Book {
	String publisher ="MQ" ; //In Interface Class variable are by default final and Static
	public void Title ();
	public void Author();
	public default void printaddress() {
		System.out.println("hyd,pincode 500075");
	}
}

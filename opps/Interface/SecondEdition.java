package opps.Interface;

public class SecondEdition  implements Book
{

	@Override
	public void Title() {

		System.out.println("Selenium.2.0");		
	}

	@Override
	public void Author() {
		System.out.println("Krish");		
	}
	public static void main(String[] args) {
		Book obj =new SecondEdition();
		obj.Author();
		obj.Title();
		obj.printaddress();
	}

}

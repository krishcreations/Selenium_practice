package opps.Interface;

public class FirstEdition implements Book
{

	@Override
	public void Title() {
		System.out.println("Selenium.1.o");

	}

	@Override
	public void Author() {

		System.out.println("Simmon Stewart");
	}
	public static void main(String[] args) {
		Book obj = new FirstEdition();
		obj.Author();
		obj.Title();
		obj.printaddress();
	}

}

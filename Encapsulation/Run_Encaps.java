package Encapsulation;

public class Run_Encaps {

	public static void main(String[] args) {

		Encaps obj = new Encaps();
		obj.setName("krish");
		String UID =obj.getName();
		System.out.println(UID);
		obj.setPassword(obj.getPassword());
		
	}

}

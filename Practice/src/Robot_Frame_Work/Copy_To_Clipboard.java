package Robot_Frame_Work;

import java.awt.Robot;
import java.io.IOException;

public class Copy_To_Clipboard {

	public static void main(String[] args) throws Exception {

		Runtime.getRuntime().exec("notepad.exe");
		
		Thread.sleep(3000);
		
		Robot robo =new  Robot();
		robo.setAutoDelay(200);
	
	
	}

}

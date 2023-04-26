package Robot_Frame_Work;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class Robot_On_NotepadFile {

	public static void main(String[] args) throws Exception {

		Runtime.getRuntime().exec("Notepad.exe");
		Thread.sleep(3000);
		
		Robot robo = new Robot();
		robo.setAutoDelay(200);
		
		robo.keyPress(KeyEvent.VK_W);
		robo.keyPress(KeyEvent.VK_E);
		robo.keyPress(KeyEvent.VK_L);
		robo.keyPress(KeyEvent.VK_L);
		
		robo.keyPress(KeyEvent.VK_C);
		robo.keyPress(KeyEvent.VK_O);
		robo.keyPress(KeyEvent.VK_M);
		robo.keyPress(KeyEvent.VK_E);
	}

}

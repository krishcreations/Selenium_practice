package Robot_Frame_Work;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

public class Robot_Mouse_Syntax {

	public static void main(String[] args) throws Exception {

		//Create object  for Robot Framework
		
		Robot robot=new Robot();
		robot.setAutoDelay(1000);
		
		
		//Move cursor to required Location
		
		robot.mouseMove(100, 200);
		//Mouse Click 
		robot.mousePress(InputEvent.BUTTON1_MASK);//Left Click
		robot.mousePress(InputEvent.BUTTON2_MASK);//Middle Click
		robot.mousePress(InputEvent.BUTTON3_MASK);//Right Click
		//Release Mouse 
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
		
		//scroll
		robot.mouseWheel(0);
		
	}

}

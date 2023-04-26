package Robot_Frame_Work;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_PopUp_Handling {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		Robot robo = new Robot();
		
		robo.setAutoDelay(1000);
		robo.mouseMove(200 ,177);
		
		robo.mousePress(InputEvent.BUTTON1_MASK);
		robo.mouseRelease(InputEvent.BUTTON1_MASK);
		
		//Mouse Wheel 
		
	}

}

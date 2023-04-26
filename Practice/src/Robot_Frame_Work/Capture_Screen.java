package Robot_Frame_Work;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;



public class Capture_Screen {

	public static void main(String[] args) throws AWTException, IOException {
//Capture img
		Robot robo = new Robot();
BufferedImage Image=robo.createScreenCapture(new Rectangle(new Dimension(800,600)));

//Write img into Local Folder
//ImageIO.write(Image, "PNG", new File("D:\\image.png"));

ImageIO.write(Image ,  "PNG", new File("E:\\Selenium_projects_Mq\\img.png"));
	
System.out.println("Success");
}}

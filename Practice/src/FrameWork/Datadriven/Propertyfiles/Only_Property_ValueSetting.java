package FrameWork.Datadriven.Propertyfiles;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Only_Property_ValueSetting {

	public static void main(String[] args) throws IOException {

		FileInputStream  fi = new FileInputStream("E:\\Testing_work_space\\Practice\\src\\FrameWork\\Datadriven\\Propertyfiles\\Propertyfile.properties");
		System.out.println("File located successfuly");

		//Creating object for property file 
		Properties prop = new Properties();
		prop.load(fi);

		//Get data from property file 
		String browser =prop.getProperty("browser");
		System.out.println( browser );
		String OS =	prop.getProperty("os");
		System.out.println(OS);
		//adding new value to property file 
		prop.setProperty("Status", "Under progress");
		
		//Creating new property file
		FileOutputStream fos = new FileOutputStream("E:\\Testing_work_space\\Practice\\src\\FrameWork\\Datadriven\\Propertyfiles\\Os.properties");
		prop.store(fos, "My Os adding");


	}

}

package FrameWork.Datadriven.Propertyfiles;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Read_Data_From_Propertyfile {

	public static void main(String[] args) throws IOException {

		//Target Property file
		
		FileInputStream fi = new FileInputStream("E:\\Testing_work_space\\Practice\\src\\FrameWork\\Datadriven\\Propertyfiles\\Propertyfile.properties");
		System.out.println("File Located Successfuly");
		
		//Create Object for property file
		Properties repositery = new Properties();
		//Loading Input data to repository
		repositery.load(fi);
		
		//get property value using propertyname
		String url =repositery.getProperty("application.url");
		System.out.println(url);
		//get user name and password
		String uid =repositery.getProperty("username");
		String pwd=repositery.getProperty("password");
		System.out.println(uid +"  "  + pwd);
		//Set key and value to repository file 
		repositery.setProperty("Result", "Tc001_Executed Succesful");
		
		//Store data to new  property file 
		FileOutputStream fos = new FileOutputStream("TestData\\Op.properties");
		repositery.store(fos, "my first test result");
		
	}

}

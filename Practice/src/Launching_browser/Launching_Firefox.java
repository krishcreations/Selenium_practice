package Launching_browser;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Launching_Firefox {

	public static void main(String[] args) {
FirefoxDriver firefox = new FirefoxDriver();
firefox.get("http://google.com");
String title =firefox.getTitle();
//page title printing 
System.out.println(firefox.getCurrentUrl());
		System.out.println(title);
		
		firefox.close();
		
		
	}

}

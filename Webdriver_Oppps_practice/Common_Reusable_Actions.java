package Webdriver_Oppps_practice;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Set;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.internal.AbstractParallelWorker.Arguments;

public class Common_Reusable_Actions {

	private static final Object[] Arguments = null;
	protected WebDriver driver ;
	String mainwindowId;
		
	private WebDriverWait wait ;
	private CharSequence input;
	private Object[] arguments;
	/*keyword-->launch browser [chrome,Firefox,IE]
	 * Author:-->
	 * Parameters used:-->local parameter
	 */

	public void LaunchBrowser(String browsername)
	{
		switch (browsername) {
		case "chrome":
			driver =new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "Ie":
			driver = new InternetExplorerDriver();
			break;
		default:System.out.println("Browser name is mismatched");
		break;
	
		}
	}
	/*keyword:-->set window size 
	 * Author:-->Krish
	 * parameters used :-->Local parameters
	 */
	
	public void setwindow_size(int width,int height) {
		driver.manage().window().setSize(new Dimension(width, height));
	}
	public void maximizeBrowser() {
		driver.manage().window().maximize();
	}
	/*keyword:-->load webpage to browser window
	 * Author:-->krish
	 * parameters used :-->Local parameters
	 */
	public void load_webpage(String url) {
		driver.get(url);
		mainwindowId = driver.getWindowHandle();
		set_explicit_time(30);
	}
	private void set_explicit_time(int i) {
		// TODO Auto-generated method stub
		
		/*keyword:-->This keyword manage implicit timeout 
		 * Krish
		 * parameters used:-->Local parameter
		 */
	}
	public void set_page_load_timeout(int time_in_sec) {
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(time_in_sec));
		
	}
	/*keyword:-->this keyword set explict wait time
	 * Author:-->krish
	 * parameters used:-->local parameters
	 */
	
	public void set_explacitwait_time(int Time_in_sec) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(Time_in_sec));
		
	}
	/*keyword:-->This keyword type text into editbox
	 * Author:-->krish
	 * parameters used :--> local parameter
	 */
	public void type_text(String xpath,String input) {
		try {
			WebElement editbox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
			editbox.clear();
			editbox.sendKeys(input);
		
	}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	/*keyword :--> This keyword type text into editbox
	 * Author:-->krish
	 * parameters used :--> loccal parameter
	 */
public void Type_text(String location_uid,String input) {
	

try {
	//WebElement element1 = ;
	WebElement Editbox = wait.until(ExpectedConditions.visibilityOf(location_uid));
	Editbox.clear();
	//CharSequence input;
	Editbox.sendKeys(input);
}catch(Exception e) {
	e.printStackTrace();
}
}
/*keyword:-->This keyword type
 * Author:-->krish
 * Parameters used:-->Local Parameter
 */

public void Type_text_using_Js(String xpath,String inputdata) {
	try {
		WebElement Element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
	((JavascriptExecutor)driver).executeScript("arguements[0].value='text'", Element );
	}
	catch (Exception e)
{ e.printStackTrace();
		}
}
/*Keyword:--> This keyword Type text into editbox
 * Author:-->Krish
 * Parameters used:--> Local parameter
 */
public void Type_text_using_keyboard(String xpath,String inputdata)
{
	try {
		WebElement Element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
       new Actions(driver).sendKeys(Element,inputdata).perform();	
	}
	catch (Exception e)
	{
		e.printStackTrace();
	}
	}
	/*keyword:-->This keyword Click on Location[button,Radio,Checkbox,list--etc]
	 * Author:-->krish
	 * Parameters used:-->Local Parameter
	 */
public void click_element(String xpath) {
	try {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
	driver.findElement(By.xpath(xpath)).click();
	}
	catch (Exception e) {
		e.printStackTrace();
	}
}
//pageobjects 
	public void click_element(WebElement element)
	{
	try {
		wait.until(ExpectedConditions.visibilityOf(element));
		element.click();
	}
	catch (Exception e)
	{
		e.printStackTrace();
	}
	
}
	/*Keyword:-->This keyword click on location[Button,Radio,Checkbox,list--etc]
	 * Author:-->Krish
	 * Parameters used :-->Local Parameter
	 */
	public void click_element_with_Js(String xpath) {
		try {
			WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
		((JavascriptExecutor)driver).executeScript("arguments[0].click()", element);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	/*
	 * manage static timeout
	 */
public void wait (int ms) {
	try {
		Thread.sleep(3000);
	}catch(Exception e){
		
}
}
/*
 * Keyword:-->This keyword Select Dropdown Option using [text,value,index]numbers
 *Author:-->krish
 *Parameters used:-->Local parameter
 */
public void select_dropdown(String xpath,String selector,String option)
{
	try {

		WebElement Element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
		Select dropdown_selector=new Select(Element);
		switch (selector) {
		case "text":
			dropdown_selector.selectByVisibleText(option);
			break;

		case "value":
			dropdown_selector.selectByValue(option);
			break;

		case "index":
			int index = Integer.parseInt(option);
			dropdown_selector.selectByIndex(index);
			break;

		default:System.out.println("selector mismatch");
			break;
		}

	} catch (Exception e) {
		e.printStackTrace();
	}
}

/*
 * KeyWord:--> This keyword perform mouseHover action on element
 * Author:--> SunilReddy
 * Parameters Used:-->  Local Parameter
 */
public void mousehover(String xpath)
{
	try {

		WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
		new Actions(driver).moveToElement(element).perform();
	} catch (Exception e) {
		e.printStackTrace();
	}
}

/*
 * KeyWord:--> This keyword perform RightClick action on element
 * Author:--> SunilReddy
 * Parameters Used:-->  Local Parameter
 */
public void RightClick_Action(String xpath)
{
	try {

		WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
		new Actions(driver).contextClick(element).perform();
	} catch (Exception e) {
		// TODO: handle exception
	}
}

/*
 * KeyWord:--> This keyword perform DragAndDrop option
 * Author:--> SunilReddy
 * Parameters Used:-->  Local Parameter
 */
public void drag_element_to_Target(String Sourcexpath,String targetxpath)
{

	try {
		WebElement Src=driver.findElement(By.xpath(Sourcexpath));
		WebElement Target=driver.findElement(By.xpath(targetxpath));
		new Actions(driver).dragAndDrop(Src, Target).perform();
	} catch (Exception e) {
		e.printStackTrace();
	}
}


/*
 * KeyWord:--> This keyword drag object to requried target
 * Author:--> SunilReddy
 * Parameters Used:-->  Local Parameter
 */
public void drag_element_to_required_coordinates(String Sourcexpath,int xcoord, int ycoord)
{

	try {
		WebElement Src=driver.findElement(By.xpath(Sourcexpath));
		new Actions(driver).dragAndDropBy(Src, xcoord, ycoord).perform();
	} catch (Exception e) {
		e.printStackTrace();
	}
}



/*
 * KeyWord:--> Send keys any requied location
 * Author:--> SunilReddy
 * Parameters Used:-->  Local Parameter
 */
public void Send_keyboard_keys(String xpath,Keys key)
{

	WebElement Src=driver.findElement(By.xpath(xpath));
	new Actions(driver).sendKeys(Src, key).perform();
}


/*
 * KeyWord:--> Capture Screen
 * Author:--> SunilReddy
 * Parameters Used:-->  Local Parameter
 */
/*
 * KeyWord:--> CaptureScreen
 * Author:--> SunilReddy
 * Parameters Used:-->  Local Parameter
 */
public void capturescreen(String imagename)
{
	//Get System Default Time
	/*
	 * Date date=new Date(); //import java.util; //create simple dataformat
	 * DateFormat df=new SimpleDateFormat("yyyy/MMM/dd/ hh-mm-ss"); //Cover default
	 * system date using date formatter String time=df.format(date);
	 * 
	 * 
	 * File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); try {
	 * FileHandler.createDir(new File("Screens")); FileHandler.copy(src, new
	 * File("Screens\\"+time+imagename+".png")); } catch (Exception e) {
	 * e.printStackTrace(); }
	 */



}


/*
 * KeyWord:--> Switch to Next window
 * Author:--> SunilReddy
 * Parameters Used:-->  Local Parameter
 */
public void switchto_next_window()
{
	Set<String> allwindowids=driver.getWindowHandles();
	for (String eachwindow : allwindowids) {
		driver.switchTo().window(eachwindow);
	}
}


/*
 * KeyWord:--> Switch back to mainwindow
 * Author:--> SunilReddy
 * Parameters Used:-->  Local Parameter
 */
public void switchto_mainwindow()
{
	driver.switchTo().window(mainwindowId);
}



/*
 * KeyWord:--> Switch requried window using it's title
 * Author:--> SunilReddy
 * Parameters Used:-->  Local Parameter
 */
public void swithcto_window_using_page_title(String exp_title)
{
	//Get All Dynamic WIndow ID's
	Set<String> AllWindowIDS=driver.getWindowHandles();
	//Using foreach loop iterate for number of windows
	for (String EachWindowID : AllWindowIDS) 
	{
		driver.switchTo().window(EachWindowID);

		//Get Current FoCused window tilte
		String runtime_title=driver.getTitle();
		//System.out.println(runtime_title);

		if(runtime_title.contains(exp_title))
		{
			break;  //IT stop iteration   [Break will stop iteration when required title found]
		}

	}
}


/*
 * KeyWord:--> CLose alert 
 * Author:--> SunilReddy
 * Parameters Used:-->  Local Parameter
 */

public void close_alert()
{
	try {
		driver.switchTo().alert().accept();
	} catch (Exception e) {
		e.printStackTrace();
	}
}


/*
 * KeyWord:-->Verify alert text
 * Author:--> SunilReddy
 * Parameters Used:-->  Local Parameter
 */
public boolean verify_alert_text(String Exp_text)
{
	boolean flag=false;
	try {
		String alert_text=driver.switchTo().alert().getText();
		flag=alert_text.equals(Exp_text);
	} catch (Exception e) {
		e.printStackTrace();
	}
	return flag;

}


/*
 * KeyWord:-->Verify Switch to frame
 * Author:--> SunilReddy
 * Parameters Used:-->  Local Parameter
 */
public void switchtoFrame_using_FrameName(String FrameID_or_name)
{
	try {
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(FrameID_or_name));
	} catch (Exception e) {
		e.printStackTrace();
	}

}


/*
 * KeyWord:-->Switch to frame using index number
 * Author:--> SunilReddy
 * Parameters Used:-->  Local Parameter
 */
public void switchtoFrame_using_frameindex(int frameIndex)
{
	try {
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameIndex));
	} catch (Exception e) {
		e.printStackTrace();
	}
}


/*
 * KeyWord:-->Switch Control back to mainpage from frame
 * Author:--> SunilReddy
 * Parameters Used:-->  Local Parameter
 */
public void switch_from_frame_tomainwindow()
{
	driver.switchTo().defaultContent();
}

/*
 * KeyWord:-->Verify Expected page title presented
 * Author:--> SunilReddy
 * Parameters Used:-->  Local Parameter
 */
public boolean verify_titlePresented(String Exp_title)
{
	boolean flag=false;
	try {
		wait.until(ExpectedConditions.titleIs(Exp_title));
		flag=true;
	} catch (Exception e) {
		e.printStackTrace();
	}

	return flag;
}



/*
 * KeyWord:-->Verify Expected url presented at webpage
 * Author:--> SunilReddy
 * Parameters Used:-->  Local Parameter
 */
public boolean verify_urlPresented(String Exp_url)
{
	boolean flag=false;
	try {
		wait.until(ExpectedConditions.urlToBe(Exp_url));
		flag=true;
	} catch (Exception e) {
		e.printStackTrace();
	}

	return flag;
}


/*
 * KeyWord:-->Verify Expected element is presented at source
 * Author:--> SunilReddy
 * Parameters Used:-->  Local Parameter
 */
public boolean verify_Element_Presented_Source(String Xpath)
{
	boolean flag=false;
	try {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Xpath)));
		flag=true;
	} catch (Exception e) {
		e.printStackTrace();
	}

	return flag;
}



/*
 * KeyWord:-->Verify Text presented at location
 * Author:--> SunilReddy
 * Parameters Used:-->  Local Parameter
 */
public boolean verify_text_presented_At_location(String Xpath,String text)
{
	boolean flag=false;
	try {
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath(Xpath), text));
		flag=true;
	} catch (Exception e) {
		e.printStackTrace();
	}

	return flag;
}


/*
 * KeyWord:-->THis keyword verify text presented at required location
 * Author:--> SunilReddy
 * Parameters Used:-->  Local Parameter
 */
public boolean Verify_element_text(String xpath,String exp_text)
{
	String element_text=driver.findElement(By.xpath(xpath)).getText();
	boolean flag=element_text.equalsIgnoreCase(exp_text);
	return flag;
}


/*
 * KeyWord:-->Verify Text visible at webpage
 * Author:--> SunilReddy
 * Parameters Used:-->  Local Parameter
 */
public boolean verify_text_visible_at_webpage(String Exp_text)
{
	WebElement Page=driver.findElement(By.tagName("body"));
	String Act_Text=Page.getText();
	return Act_Text.contains(Exp_text);
}


/*
 * KeyWord:-->Verify any inputvalue presented at editbox
 * Author:--> SunilReddy
 * Parameters Used:-->  Local Parameter
 */
public boolean verify_inputPresented_At_Textbox(String Xpath,String exp_input)
{
	boolean flag=false;
	try {
		wait.until(ExpectedConditions.textToBePresentInElementValue(By.xpath(Xpath), exp_input));
		flag=true;
	} catch (Exception e) {
		e.printStackTrace();
	}
	return flag;
}


/*
 * Keyword:-->This keyword return selected value from dropdown
 * Author:-->
 * Parameters used:-->
 */
public String getSelectedValueInDropDown(String xpath)
{
	String OptionText=new Select(driver.findElement(By.xpath(xpath))).getFirstSelectedOption().getText();
	return OptionText;
}


/*
 * Keyword:-->This keyword Verify runtime Attribute value
 * Author:-->
 * Parameters used:-->
 */
public boolean verify_runtime_Attribute_value(String xpath, String attributname,String exp_attibutevalue)
{
	String Runtime_Attribute_Value=driver.findElement(By.xpath(xpath)).getAttribute(attributname);
	return Runtime_Attribute_Value.contains(exp_attibutevalue);
}



/*
 * Keyword:-->Scroll window vertical
 * Author:-->
 * Parameters used:-->
 */
public void ScollWindow_V()
{
	try {
		((JavascriptExecutor)driver).executeScript("window.scroll(0,100)");
	} catch (Exception e) {
		// TODO: handle exception
	}
}




/*
 * Keyword:-->Close Current Window
 * Author:-->
 * Parameters used:-->
 */
public void close_browser()
{
	driver.close();
}


/*
 * Keyword:-->Close all windows
 * Author:-->
 * Parameters used:-->
 */
public void close_Allwindows()
{
	driver.quit();
}







}


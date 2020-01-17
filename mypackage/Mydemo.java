package mypackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.ScreenshotException;

public class Mydemo {
	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Share\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://perromart.com.sg/account/login");
		Loginpage login =new Loginpage(driver);
		login.login();
		
		
		
	}

}

package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginpage {
	
	private WebDriver driver;
	
	public Loginpage(WebDriver driver2)
	{
		driver=driver2;
	}
	//targets
	private By username=By.id("customer-email");
	private By password= By.name("customer[password]");
	private By signinbtn =By.className("submit-login-btn ");
	
	//Actions
	private void setUsername()
	{  driver.findElement(username).sendKeys("9703894660");
	
	}
	private void setPassword()
	{ driver.findElement(password).sendKeys("bheemmehru");
	}
	
	private void clickonsignin()
	{  driver.findElement(signinbtn).click();
	}
	

	
	public void login() {
		this.setUsername();
		this.setPassword();
		this.clickonsignin();
	}
}
	
	

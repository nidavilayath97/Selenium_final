package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompleteFeature {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Share\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/?source=auth_switcher");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("ferre");
		Thread.sleep(3000);
		for (int i=1;i<=3;i++)
		{
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
	}
	

	driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
	Thread.sleep(3000);
	driver.close();
	
	}
}




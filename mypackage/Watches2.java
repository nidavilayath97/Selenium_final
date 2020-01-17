package mypackage;
import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Watches2 {
	public static void takepicture(WebDriver driver, String filename) throws Exception{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File ("D:\\amazonscreenshots"+filename+".png"));
	}
	
	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Share\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		Actions action= new Actions(driver);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("watches");
		WebElement watches= driver.findElement(By.linkText("watches"));
		action.moveToElement(watches).build().perform();
	    watches.click();
	    
	    WebElement beauty= driver.findElement(By.cssSelector("div[data-ri='"+3+"']img"));
	    action.moveToElement(beauty).build().perform();
	    takepicture(driver, "watch4");

}


	
}

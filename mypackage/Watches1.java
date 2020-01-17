package mypackage;

import java.io.File;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Watches1 {
	
	public static void takepicture(WebDriver driver, String filename) throws Exception {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source,new File("D:\\"+filename+".png"));
		
	}

	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\\\Share\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://amazon.in");
		String parent = driver.getWindowHandle();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("watches");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		WebElement watch = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/span[4]/div[1]/div[4]/div/span/div/div/div/div/div[2]/div/span/a/div/img"));
		watch.click();
		Set<String> childwindows = driver.getWindowHandles();

		for (String win : childwindows) {
		if(!parent.equals(win)) {
		driver.switchTo().window(win);
		takepicture(driver, "image");
		Thread.sleep(3000);
		driver.close();
		}
		}
		driver.switchTo().window(parent);
		Thread.sleep(3000);
		
		driver.close();
		
	}
	
	
}

package mypackage;

	
import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class  Watches {
        
	
	public static void takepicture(WebDriver driver, String filename) throws Exception {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source,new File("D:\\"+filename+".png"));
		
	}

	
	
		public static void main(String[] args) throws Exception {

			System.setProperty("webdriver.chrome.driver", "D:\\\\Share\\\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.amazon.in");
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("watches");
			Thread.sleep(3000);
			for (int i = 1; i <= 4; i++) {
				driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ARROW_DOWN);
				Thread.sleep(3000);
			}
			
			takepicture(driver,"img1");

			driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
			Thread.sleep(3000);
			driver.close();

		}

	}




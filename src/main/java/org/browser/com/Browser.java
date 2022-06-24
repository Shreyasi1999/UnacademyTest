package org.browser.com;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.properties.com.Prop;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {
	public static WebDriver driver;
	public static Actions act;
	public static WebDriverWait wait; 
	
	public static void setDriver() throws Exception {
		Prop.setupProperties();
		String driverName = Prop.getProperty("browser");
		
		if(driverName.equals("chrome")) {
			setChromeDriver();
		}else if(driverName.equals("firefox")) {
			setFirefoxDriver();
			
		}else {
			System.out.println("invalid Driver name");
		}
		act = new Actions(driver);
	}
	
	public static String getTitle() {
		return driver.getTitle();
	}
	
	public static void closeBrowser() {
		driver.quit();
	}
	
	public static void  getUrl() {
		String url = Prop.getProperty("url");
		driver.get(url);
		driver.manage().window().maximize();
	}

	private static void setFirefoxDriver() {
		try {
			WebDriverManager.firefoxdriver().setup();
			driver =new FirefoxDriver();
		}
		catch(Exception e) {
			System.out.println("set gecko driver");
			System.out.println(e);
		}
	}
	
	public void waitForElement(WebElement element,Long second) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(second));
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	private static void setChromeDriver() { 
		try {
			WebDriverManager.chromedriver().setup();
			driver =new ChromeDriver();			
		}catch(Exception e) {
			System.out.println("in set Chrome Driver");
			System.out.println(e);
		}
		
	}
	
	public void switchToFrame(WebElement element) {
		driver.switchTo().frame(element);
	}
	
	public void switchToParentFrame() {
		driver.switchTo().parentFrame();
	}
	
	public static String getCurrentUrl() {
		return driver.getCurrentUrl();
	}
	
	public void moveCursorTo(WebElement element) {
		act.moveToElement(element).build().perform();
	}
	
}


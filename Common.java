package seleniumB12;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class Common {
	 String  broswer;
	WebDriver driver;
   WebDriverWait wait;
	@Parameters("browser")
	
	@BeforeClass(alwaysRun=true)
	  public void setup(String browser) {
		this.broswer=browser;
		System.out.println("BROSWERTYPE"+browser);
		
    	if (browser.equalsIgnoreCase("firefox")) {
		 System.setProperty("webdriver.gecko.driver","C:\\Users\\shaik\\eclipse-workspace\\seleniumB12\\src\\main\\resources\\geckodriver.exe");
		 File pathBinary = new File("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		 FirefoxBinary firefoxBinary = new FirefoxBinary(pathBinary);   
		 FirefoxOptions options = new FirefoxOptions();
options.setBinary(firefoxBinary);
		  driver = new FirefoxDriver(options);
	}	 

	else if (browser.equalsIgnoreCase("chrome")){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shaik\\eclipse-workspace\\seleniumB12\\src\\main\\resources\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(ChromeOptions.CAPABILITY,options);
		options.merge(capabilities);
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		
	}
	else if (browser.equalsIgnoreCase("edge")){
		System.setProperty("webdriver.edge.driver","C:\\Users\\shaik\\eclipse-workspace\\seleniumautomation\\src\\main\\resources\\msedgedriver.exe");
		driver= new EdgeDriver();
		driver.manage().window().maximize();
	}
    	wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	}
 
	@AfterClass
	public void shutdown() {
		driver.quit();
	}
public void screenshot(String filename) throws IOException	{
	TakesScreenshot srcfile = (TakesScreenshot)driver;
File file = srcfile.getScreenshotAs(OutputType.FILE);
	File destFIle = new File (broswer+"-"+filename);
	Files.copy(file, destFIle);
	
}
	
	
	}

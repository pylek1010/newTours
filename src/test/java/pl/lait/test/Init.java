package pl.lait.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class Init {
	
	
	static WebDriver driver = null;
	
	public static WebDriver getDriver() {
		
		if (driver == null) {
			System.out.println(" -- Wewnatrz getDriver null");
	        System.setProperty("webdriver.chrome.driver","C:/Users/zbynn/Desktop/Kurs IT/SeleniumLibs/chromedriver.exe");
	        
	        
	        
	        URL remoteAddress = null;
			try {
				remoteAddress = new URL("http://localhost:4444/wd/hub");
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
	        driver = new RemoteWebDriver(remoteAddress, capabilities);
	        //driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	        
	        Dimension rozmiarOkna = driver.manage().window().getSize();
	        int wys = rozmiarOkna.height;
	        int szer = rozmiarOkna.width;
	        System.out.println("Oto rozmiar okna: "+wys+" x "+szer);
	        
	        driver.get("http://newtours.demoaut.com");
	        return driver;
		} else {
			System.out.println(" -- Wewnatrz getDriver else");
			return driver;
		}
		
		
		
	}
	
	public static void end() {
		driver.quit();
		driver = null;
	}
	
	
	
}

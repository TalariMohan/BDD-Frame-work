package Utils;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Resuable_Methods {	
	
		public static WebDriver driver;
		
	    public void visitAdactin()
	    {
	    	WebDriverManager.chromedriver().setup();
	    	driver = new ChromeDriver();
	    	driver.manage().window().maximize();
	    	driver.get("https://adactinhotelapp.com/");
	    	ImpWait(5000);
	    }
	    
	    public void closeBrowser()
	    {
	    	driver.close();
	    }
	    
	    public void addScreenshot()
	    {
	    	
	    }
	    
	    public void ImpWait(int time)
	    {
	    	driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);

	    }

	}




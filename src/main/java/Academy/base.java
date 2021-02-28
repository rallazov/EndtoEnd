package Academy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class base{
	public WebDriver driver;
	public WebDriver initializeDriver() throws Exception  {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\abdi2\\eclipse-workspace\\E2EProject\\data.properties");
		prop.load(fis);
		String browserName = prop.getProperty("browser");

		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\abdi2\\Documents\\chromedriver.exe");
			 driver = new ChromeDriver();
		} else if (browserName.equals("IE")) {
			System.setProperty("webdriver.ie.driver", "C:\\Users\\abdi2\\Documents\\IEDriverServer.exe");

			 driver = new InternetExplorerDriver();
		}
		else if(browserName.equals("Edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\abdi2\\Documents\\msedgedriver.exe");
			 driver=new EdgeDriver();

		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
}

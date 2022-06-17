package browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class launch {

	public static void main(String[] args) throws InterruptedException  {
		//System.out.println(System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		System.out.println(System.getProperty("os.name"));
		//launch.chromebrowser();
		//launch.firefoxbrowser();
		
	}
	public static void chromebrowser() throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");
		//above is the way to incorporate the driver files into the project and can be used in the above mannner-using [/] instead of [\\]
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		//above is the another way to define file path of driver using [\\]
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://122.170.14.195:8080/uth/gadgetsgallery/catalog/");
		//driver.wait(2000);
		Thread.sleep(5000);
		driver.close();
		
	}
	public static void firefoxbrowser() throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/geckodriver.exe");
		//above is the way to incorporate the driver files into the project and can be used in the above mannner-using [/] instead of [\\]
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\drivers\\geckodriver.exe");
		//above is the another way to define file path of driver using [\\]
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://122.170.14.195:8080/uth/gadgetsgallery/catalog/");
		//driver.wait(2000);
		Thread.sleep(5000);
		driver.close();
	}

}

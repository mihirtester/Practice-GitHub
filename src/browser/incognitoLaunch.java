package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class incognitoLaunch {

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--incognito");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		driver.manage().deleteAllCookies();
		driver.close();
		
		/*//object of ChromeOptions class
		c = webdriver.ChromeOptions();
		
		//incognito passed
				
		c.add_argument("--incognito");
		
		//set chromodriver.exe path
		
		driver = WebDriver.Chrome(executable_path="C:\\chromedriver.exe",options=c);
		
		driver.implicitly_wait(0.5);
		
		//launch URL
		driver.get("https://www.tutorialspoint.com/tutor_connect/index.php");*/

	}

}

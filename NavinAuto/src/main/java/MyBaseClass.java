import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyBaseClass {
	
	static WebDriver driver=null;
	
	public static void getBrowserInstance(String browser)
	{
		
		switch(browser) {
		case "Chrome":
		System.setProperty("webdriver.chrome.driver", "D:\\All WEB Drivers\\chromedriver_win32 (3)\\chromedriver.exe");
		driver= new ChromeDriver();
		break;
		
		case "Edge":System.setProperty("webdriver.edge.driver", "D:\\All WEB Drivers\\edgedriver_win64 (1)\\msedgedriver.exe");
		 driver= new EdgeDriver();
		 break;
		
		case "Firefox":
		System.setProperty("webdriver.gecko.driver", "D:\\All WEB Drivers\\geckodriver-v0.30.0-win64(1)\\geckodriver.exe");
		driver= new FirefoxDriver();break;
		 
		default:
		System.setProperty("webdriver.chrome.driver", "D:\\All WEB Drivers\\chromedriver_win32 (3)\\chromedriver.exe");
		driver= new ChromeDriver(); 
		}//getBrowserInstance
		
	}
		public static void validate(String actual, String expected) throws Exception
		{
			if(actual.equals(expected)) {
System.out.println("Successfully validated "+actual+ " result");
				
			}
			else {
				throw new Exception("Invalid "+ actual+" result ---> test case failed");
			}
		}
		
		
		
		public static String generateRandomString(int count)
		{
			Random random= new Random();
			
			return random.ints(65,90).limit(count).collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
			
		}
		
			

}

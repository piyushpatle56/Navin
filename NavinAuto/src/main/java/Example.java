import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Example {

	public static void main(String[] args) {
		
		
		  WebDriver driver=null; System.setProperty("webdriver.chrome.driver",
		  "D:\\All WEB Drivers\\chromedriver_win32 (3)\\chromedriver.exe"); driver= new
		  ChromeDriver(); driver.get(
		  "https://opensource-demo.orangehrmlive.com/symfony/web/index.php/auth/login")
		  ;
		  
		  WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		  wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id(""))));
		 

        System.out.println('j' + 'a' + 'v' + 'a');
		
				
				




	}

}

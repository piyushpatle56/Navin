import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class RedBus extends MyBaseClass{

	public static void main(String[] args) {

		MyBaseClass.getBrowserInstance("Chrome");
		MyBaseClass.getBrowserInstance("Chrome");
		MyBaseClass.getBrowserInstance("Chrome");
		driver.navigate().to("https://www.redbus.in/");
		driver.manage().window().maximize();
		
	WebElement src=driver.findElement(By.xpath("//input[@id=\"src\"]"));
	src.sendKeys("Bangalore"); src.sendKeys(Keys.ENTER);
	
		
		
		
		
	WebElement src1=driver.findElement(By.xpath("//input[@id=\"dest\"]"));
	src1.sendKeys("gujrat");
	src1.sendKeys(Keys.ENTER);

		driver.findElement(By.id("onward_cal")).click();
		driver.findElement(By.xpath("//td[@class=\"we day\" and @css=\"1\"]")).click();
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

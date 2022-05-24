import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LaunchOrangeHRM extends  MyBaseClass {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
		
	getBrowserInstance("Chrome");
		
	driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		  
		  //System.out.println(driver.getTitle());
		  
	validate(driver.getTitle(), "OrangeHRM");
	
	  driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	  driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	  driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
	  driver.manage().window().maximize();
		
		  if(driver.getCurrentUrl().equals(
		  "https://opensource-demo.orangehrmlive.com/index.php/dashboard")) {
		  System.out.println("Login successfull....."); } else{
		  
		  System.out.println("failed to login..");
		  System.out.println(driver.findElement(By.id("spanMessage")).getText());
		  
		}

	 // validate(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		  
		  
	//driver.findElement(By.id("welcome")).click();
	//driver.findElement(By.xpath("//a[@href=\"/index.php/auth/logout\"]")).click();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	//	driver.findElement(By.xpath("//a[@href='/index.php/auth/logout']")).click();		
  
	//	driver.quit();
	
	driver.findElement(By.id("menu_pim_viewPimModule")).click();
	
	
	driver.findElement(By.id("menu_pim_viewEmployeeList")).click();

	driver.findElement(By.id("btnAdd")).click();
	String firstName= generateRandomString(6);
	driver.findElement(By.id("firstName")).sendKeys(firstName);
	String lastName= generateRandomString(8);
	driver.findElement(By.id("lastName")).sendKeys(lastName);
	
	String employeeId= driver.findElement(By.id("employeeId")).getAttribute("value");
	System.out.println("employeeId: "+employeeId);
	
	
	driver.findElement(By.id("chkLogin")).click();
	
	String user_name= firstName+"_"+lastName;
	driver.findElement(By.id("user_name")).sendKeys(user_name);
	
String pwd= lastName+"@123";
driver.findElement(By.id("user_password")).sendKeys(pwd);
driver.findElement(By.id("re_password")).sendKeys(pwd);
	
driver.findElement(By.id("btnSave")).click();
	
//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("menu_pim_viewEmployeeList")));
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
	driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
	
	driver.findElement(By.id("empsearch_id")).sendKeys(employeeId);

driver.findElement(By.id("empsearch_employee_name_empName")).sendKeys(firstName);

driver.findElement(By.id("searchBtn")).sendKeys(Keys.ENTER);
	}

}

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Test {

	public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver", "D:\\All WEB Drivers\\chromedriver_win32 (3)\\chromedriver.exe");
WebDriver driver= new ChromeDriver();

driver.navigate().to("https://www.amazon.in/");

driver.findElement(By.xpath("//select[@aria-describedby=\"searchDropdownDescription\"]")).click();

Select select= new Select(driver.findElement(By.xpath("//select[@aria-describedby=\"searchDropdownDescription\"]")));
select.selectByVisibleText("Electronics");
WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
search.sendKeys("television");
search.submit();

//WebElement result= driver.findElement(By.xpath("//span[text()=\"RESULTS\"]"));
//if(result.isDisplayed())
//{
List<WebElement> imageLink= driver.findElements(By.tagName("img"));
imageLink.remove(null);
 int count =1; 
  for(WebElement i:imageLink) 
  {
	  String imgLink=  i.getAttribute("alt"); 
if(!imgLink.isEmpty()) 
{ 
	if(imgLink.contains("s-image"))
	{
		System.out.println(count +"--> "+imgLink);
count++; 
	}
}
 












/*WebElement search=driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
search.sendKeys("mazon");
search.sendKeys(Keys.ENTER);*/

//Actions act = new Actions(driver);
//act.moveToElement(driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"))).click().build().perform();

		
  }}

}

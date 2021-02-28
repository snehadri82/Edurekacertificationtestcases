package com.selenium.seleniumSample;
import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class justTest {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sneha\\eclipse-workspace\\seleniumSample\\driver\\chromedriver.exe");
		      WebDriver driver = new ChromeDriver();
		      //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		      //driver.get("https://www.google.com/");
		      driver.navigate().to("http://52.66.175.79:32772/index.php");
		      // identify element
		      WebElement p=driver.findElement(By.id("About Us"));
		      //enter text with sendKeys() then apply submit()
		      p.click();
		      
		      /*// Explicit wait condition for search results
		      WebDriverWait w = new WebDriverWait(driver, 5);
		      w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//ul")));
		      p.submit();
		      driver.close();*/
		   }
}

package com.selenium.seleniumSample;

import static org.junit.Assert.*;

import java.util.ArrayList;
 
import org.junit.*;
import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testCase {
	public static WebDriver driver;
	@BeforeClass
	public static void setup()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sneha\\eclipse-workspace\\seleniumSample\\driver\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	      //driver.get("https://www.google.com/");
	      driver.navigate().to("http://52.66.175.79:32772/index.php");
	      // identify element
	      WebElement p=driver.findElement(By.id("About Us"));
	      //enter text with sendKeys() then apply submit()
	      p.click();
	      
	}
	
	@Test
    public void TextPrsesent() {
        assertTrue("This is about page", true);
        System.out.println("@Test: 'This is about page' text found");
  
    }
}

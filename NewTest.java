package defpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class NewTest {
	public String baseUrl = "http://google.com";
    String driverPath = "C:\\chromedriver.exe";
    public WebDriver driver ; 
	
	@Test
  public void javasearching() {
		
		System.out.println("launching the test"); 
	      System.setProperty("webdriver.chrome.driver", driverPath);
	      driver = new ChromeDriver();
	      driver.get(baseUrl);
	      driver.manage().window().maximize();
	      
	      WebElement myElem = driver.findElement(By.name("q"));
	      myElem.sendKeys("Java");
	      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	      driver.findElement(By.name("btnK")).click();
	      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	      if(driver.findElements(By.id("rso")).size() != 0){
	    	  System.out.println("There are search results");
	    	  }else{
	    	  System.out.println("No search results");
	    	  }
	      
	      
	      driver.close();
  }
}

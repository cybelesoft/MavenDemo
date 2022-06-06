/*package example;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
  @Test
  public void f() {
  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}*/

package example;		

import java.time.Duration;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;		
import org.testng.annotations.Test;	
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;		
@SuppressWarnings("unused")
public class NewTest 
{		
	    private WebDriver driver;		
	    private WebDriverWait wait;
	    private String path = "https://192-168-1-129.thinrdp.net:9443/";
	    private String user_windows="local\\martintest";
	    private String password_windows="Admin2020";
		
		//@BeforeTest
		@BeforeMethod
		public void beforeTest() 
		{	
		    driver = new ChromeDriver();  
		    
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
	        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
	        
	        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		}		
		//@AfterTest
		@AfterMethod
		public void afterTest() 
		{
			driver.quit();			
		}
		
		@Test(priority = 20)		
		public void testEasy() 
		{	
			driver.get(path);
			
			String title = driver.getTitle();
			
			try
			{
			driver.wait(5000);
			}
			catch(Exception ex)
			{
				
				
			}
										 
			Assert.assertTrue(title.contains("Thinfinity")); 	
				
		}	
		
		
		@Test(priority = 10)
		public void WindowsLogon_01()
        {
			driver.navigate().to(path + "?signin");	
           
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\'main-container\']//*[@data-qatest=\'username_field\']")));
			driver.findElement(By.xpath("//div[@class=\'main-container\']//*[@data-qatest=\'username_field\']")).sendKeys(user_windows);
					
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\'main-container\']//*[@data-qatest=\'password_field\']")));		
			driver.findElement(By.xpath("//div[@class=\'main-container\']//*[@data-qatest=\'password_field\']")).sendKeys(password_windows + Keys.ENTER);
			            
            String userNameExpected = user_windows;
            userNameExpected = userNameExpected.toLowerCase();

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@data-qatest=\'loggedusername_field\']")));
            WebElement userName = driver.findElement(By.xpath("//*[@data-qatest=\'loggedusername_field\']"));
            String userNameActual = userName.getText().toLowerCase();
            
            /*Path path=Paths.get(userNameActual);
            Path filename  = path.getFileName();
            
            userNameActual = filename.toString().toLowerCase();*/            

            Assert.assertTrue(userNameActual.compareTo(userNameExpected)==0, "Login user as espected");
            
        }
}	




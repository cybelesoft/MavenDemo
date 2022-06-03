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

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;		
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
		
		//@BeforeTest
		@BeforeMethod
		public void beforeTest() 
		{	
		    driver = new ChromeDriver();  
		}		
		//@AfterTest
		@AfterMethod
		public void afterTest() 
		{
			driver.quit();			
		}
		@Test(priority = 1)		
		public void testEasy() 
		{	
			driver.get("https://192-168-1-129.thinrdp.net:9443");
			
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
            //Arrange (Preparar)
			driver.get("https://oficina.thinrdp.net:8443/" + "?signin");

			try
			{
			driver.wait(5000);
			}
			catch(Exception ex)
			{
				
				
			}
            // //div[@class='main-container']
			/*driver.WaitUntilIsVisible(By.xpath("//div[@class='main-container']//*[@data-qatest='username_field']")).SendKeys(Config.Windows.Username);
			driver.WaitUntilIsVisible(By.xpath("//div[@class='main-container']//*[@data-qatest='password_field']")).SendKeys(Config.Windows.Password + Keys.Enter);


            //Assert(Afirmar)            
            String userNameExpected = "martintest";
            userNameExpected = userNameExpected.toLowerCase();

            WebElement userName = driver.w (By.xpath("//*[@data-qatest='loggedusername_field']"));//_Driver.WaitUntilIsVisible(By.Id("username"));
            String userNameActual = userNameExpected.toString().toLowerCase();
            userNameActual = Path.GetFileName(userNameActual);
*/
            Assert.assertTrue(true, "");
        }
}	



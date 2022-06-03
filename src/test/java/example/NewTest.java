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
import org.testng.annotations.AfterTest;		
@SuppressWarnings("unused")
public class NewTest 
{		
	    private WebDriver driver;		
		
		@BeforeTest
		public void beforeTest() 
		{	
		    driver = new ChromeDriver();  
		}		
		@AfterTest
		public void afterTest() 
		{
			driver.quit();			
		}
		@Test				
		public void testEasy() 
		{	
			driver.get("https://192-168-1-129.thinrdp.net:9443");
			
			String title = driver.getTitle();				 
			Assert.assertTrue(title.contains("Thinfinity")); 		
		}	
		@Test
		public void WindowsLogon_01()
        {
            //Arrange (Preparar)
			driver.navigate().to("https://oficina.thinrdp.net:8443/" + "?signin");

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
            Assert.assertTrue(false, "");
        }
}	

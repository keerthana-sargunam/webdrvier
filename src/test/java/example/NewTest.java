package example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;		
public class NewTest {	
	//System.setProperty("webdriver.gecko.driver","C:\\Users\\Administrator\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
	    private WebDriver driver;		
		@Test				
		public void testEasy() {	
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Administrator\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
			
			driver.get("http://www.google.com");  
			String title = driver.getTitle();
			 driver.findElement(By.id("btnk")).click();
		//System.out.println(findElement);
			Assert.assertTrue(title.contains("Google")); 		
		}	
		@BeforeTest

		public void beforeTest() {	
	System.setProperty("webdriver.gecko.driver","C:\\Users\\Administrator\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();  
		}		
		@AfterTest
		public void afterTest() {
			driver.quit();			
		}
	/*	public static void main() {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Administrator\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		}
*/
		}	
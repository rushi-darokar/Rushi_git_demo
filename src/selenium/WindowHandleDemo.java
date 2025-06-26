package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleDemo {

	public static void main(String[] args) throws InterruptedException
	{
		// Set the path of the ChromeDriver executable
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium\\ChromDriver\\chromedriver-win64\\chromedriver.exe");
		
		// Launch a new Chrome browser instance
		WebDriver driver = new ChromeDriver();
		
		// Maximize the browser window
		driver.manage().window().maximize();
		
		// Navigate to the demo popup window page
		driver.get("https://demo.guru99.com/popup.php");
		
		// Store the current (parent) window handle
		String ParentWindowId = driver.getWindowHandle();
		
		// Locate the "Click Here" link on the page
		WebElement ClickLink = driver.findElement(By.xpath("//a[contains(text(),'Click Here')]"));
		
		// Validate if the link is displayed and enabled
		System.out.println("validate here is displayed: " + ClickLink.isDisplayed());
		System.out.println("validate here is enabled: " + ClickLink.isEnabled());
		
		// Click on the link to open a new popup window
		ClickLink.click();
		
		// Get handles for all the open windows
		Set<String> AllWindowsId = driver.getWindowHandles();
		
		// Iterate through all window handles
		for(String str : AllWindowsId) {
			
			// Switch to the child window (i.e., not the parent)
			if(!ParentWindowId.equals(str)) {
				driver.switchTo().window(str);
				
				// Check if the URL of the child window contains 'articles'
				if(driver.getCurrentUrl().contains("articles"))
				{
					// Find the email input field and enter an email address
					WebElement EmailId = driver.findElement(By.xpath("//input[@name='emailid']"));
					EmailId.sendKeys("rushidarokar@gmail.com");
					
					// Pause for 2 seconds (for demo/testing purpose)
					Thread.sleep(2000);
					
					// Click the submit button
					WebElement Submit = driver.findElement(By.xpath("//input[@name='btnLogin']"));
					Submit.click();
					
					// Pause again after submit
					Thread.sleep(2000);
				}
				
				// Close all browser windows and end the session
				driver.quit();
			}
		}
	}
}

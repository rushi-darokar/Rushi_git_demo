package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {

		// Set system property to point to the location of the ChromeDriver executable
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium\\ChromDriver\\chromedriver-win64\\chromedriver.exe");
		
		// Launch a new Chrome browser
		WebDriver driver = new ChromeDriver();
		
		// Maximize the browser window
		driver.manage().window().maximize();
		
		// Navigate to the Guru99 login page
		driver.get("https://demo.guru99.com/V4/");
		
		// Locate the User ID input field and enter a value
		WebElement UserId = driver.findElement(By.xpath("//input[@name='uid']"));
		UserId.sendKeys("12345 ");
		
		// Locate the Password input field and enter a value
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("pass@123");
		
		// Wait for 2 seconds (used here for demonstration purposes)
		Thread.sleep(2000);
		
		// Locate and click on the Login button
		WebElement login = driver.findElement(By.xpath("//input[@name='btnLogin']"));
		login.click();
		
		// Switch Selenium's focus to the alert popup that appears after login
		Alert alert = driver.switchTo().alert();
		
		// Get the text (message) from the alert
		String alertmsg = alert.getText();
		
		// Print the alert message (optional debug step)
		System.out.println("Alert message: " + alertmsg);
		
		// Accept (click OK) on the alert
		alert.accept();

		// Optional: try to send text to the alert — not supported in simple alerts (will throw exception)
		// alert.sendKeys("hi"); // This will fail because it's not a prompt alert (it's a simple alert)

		// Validate the alert message content
		if(alertmsg.equals("User or Password is not valid")) {
			System.out.println("Correct alert message generated");
		} else {
			System.out.println("Incorrect alert message");
		}
	}
}

package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeDemo {

	public static void main(String[] args) {
		
		// Set system property for ChromeDriver to enable automation on Chrome
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium\\ChromDriver\\chromedriver-win64\\chromedriver.exe");
		
		// Initialize WebDriver instance with ChromeDriver
		WebDriver driver = new ChromeDriver();
		
		// Maximize the browser window
		driver.manage().window().maximize();
		
		// Navigate to the demo iframe web page
		driver.get("https://demo.guru99.com/test/guru99home/");
		
		// ---- IFRAME HANDLING SECTION ----
		// Locate the iframe using XPath (by its ID attribute)
		WebElement iframe = driver.findElement(By.xpath("//iframe[@id='a077aa5e']"));
		
		// Switch the WebDriver context to the iframe so elements inside it can be accessed
		driver.switchTo().frame(iframe); 
		
		// Locate the image inside the iframe and perform a click action
		WebElement bannerImg = driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		bannerImg.click();  // Clicking the image opens a new tab to JMeter page
		
		// Note:
		// iframe stands for inline frame. It is an HTML element (<iframe>) used to embed one HTML page into another.
		// Selenium can't access elements inside an iframe directly — we must switch to the iframe first.
		
		// If needed, we can switch back to the main page using:
		// driver.switchTo().defaultContent();
	}
}

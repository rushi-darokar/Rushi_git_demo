package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpath {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium\\ChromDriver\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver =  new ChromeDriver();
		
		driver.manage() .window() .maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
		username.sendKeys("rushidarokar74@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
		password.sendKeys("rushi@123");

		WebElement logbutton = driver.findElement(By.xpath("//button[@name='login']"));
		Thread.sleep(2000);
		
		logbutton.click();
		
	}

}

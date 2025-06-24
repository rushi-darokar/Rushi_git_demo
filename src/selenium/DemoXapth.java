package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoXapth {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium\\ChromDriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	    driver.manage().window().maximize();
	    
	    driver.get("https://www.flipkart.com/account/login?ret=/account/login%3Fret%3D%252F");
	    
		Thread.sleep(2000);

	    
	 //  WebElement username = driver.findElement(By.xpath("//*[@id='container']/div/div[3]/div/div[2]/div/form/div[1]/input"));
//	    
//	    WebElement username = driver.findElement(By.xpath("//input[@class='r4vIwl BV+Dqf']"));
//	    
//	    username.sendKeys("rushidarokar96@gmail.com");
//	    
//	    WebElement  reqOtp = driver.findElement(By.xpath("//Button[@class='QqFHMw twnTnD _7Pd1Fp']"));
//	    
//		reqOtp.click();
		
		WebElement createAccount = driver.findElement(By.xpath("//a[@class='azBkHf']"));
		createAccount.click();
		Thread.sleep(2000);

		
		WebElement MobNo = driver.findElement(By.xpath("//input[@class=\"r4vIwl BV+Dqf\"]"));
		MobNo.sendKeys("9096095293");
		
		WebElement ContButton = driver.findElement(By.xpath("//button[@class=\"QqFHMw twnTnD _7Pd1Fp\"]"));
		
		ContButton.click();
		
		
		
		
		
		
		
		
		

		 
		
		
	}

}

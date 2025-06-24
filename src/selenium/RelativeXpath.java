package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium\\ChromDriver\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/automation-practice-form");
		
		WebElement FirstName = driver.findElement(By.xpath("//input[@id='firstName']"));   
		FirstName.sendKeys("Rushi");
		
		WebElement LastName = driver.findElement(By.xpath("//input[@id='lastName']")); 
		LastName.sendKeys("Daro");
		
		WebElement EmailId = driver.findElement(By.xpath("//input[@id='userEmail']")); 
		EmailId.sendKeys("rushi12@gmail.com");

		WebElement Gender = driver.findElement(By.xpath("//label[@for='gender-radio-1']"));
		Gender.click();
		
		WebElement MobNo = driver.findElement(By.xpath("//input[@id='userNumber']"));
		MobNo.sendKeys("9899999990");
		
		//WebElement DateOfBirth = driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
		//DateOfBirth.click();
		
		WebElement Subject = driver.findElement(By.xpath("//*[@id='subjectsInput']"));
		Subject.sendKeys("English");
		
		
		WebElement Hobbies1 = driver.findElement(By.xpath("//label[@for='hobbies-checkbox-1']"));
		Hobbies1.click();
		
		WebElement Upload = driver.findElement(By.xpath("//input[@id='uploadPicture']"));
		Upload.sendKeys();
		
		
		
		
	
	}

}

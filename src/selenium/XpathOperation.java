package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class XpathOperation {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium\\ChromDriver\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement name = driver.findElement(By.xpath("//input[@id='name']"));
		name.sendKeys("Rushi");
		
		WebElement Email = driver.findElement(By.xpath("//input[@id='email'][@placeholder='Enter EMail']"));
		Email.sendKeys("rushi@gmail.com");
		
		WebElement phoneNumber = driver.findElement(By.xpath("//input[@type='text'][3]"));
		phoneNumber.sendKeys("1234567890");
		
		WebElement address = driver.findElement(By.xpath("//textarea[@id='textarea']"));
		address.sendKeys("Pune");
		
		WebElement gender = driver.findElement(By.xpath("//input[@id='male']"));
		gender.click();
		
		WebElement Day1 = driver.findElement(By.xpath("//label[@for='sunday']"));
		Day1.click();
		
		WebElement Day2 = driver.findElement(By.xpath("//input[@id='tuesday']"));
		Day2.click();
		
		WebElement Country = driver.findElement(By.xpath("//select[@id='country']"));
		Country.sendKeys("India");
		
		WebElement Colour = driver.findElement(By.xpath("//select[@id='colors']"));
		Colour.sendKeys("Red");
	
		
		WebElement dateInput = driver.findElement(By.id("datepicker"));
		dateInput.click();
		WebElement dateToSelect = driver.findElement(By.xpath("//a[text()='24']"));
		dateToSelect.click(); // This should close the calendar popup automatically

		
		WebElement LaptopLinks = driver.findElement(By.xpath("//a[text()='Apple']"));
		LaptopLinks.click();

		

	}

}

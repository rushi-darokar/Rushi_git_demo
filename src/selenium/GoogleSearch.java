package selenium;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebElement searchfield, language, settings,luckyButton;        	//Declares WebElement variables
															
		//Sets the path to the ChromeDriver executable. This is required for Selenium to control the Chrome browser.
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium\\ChromDriver\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();         //Launches a new instance of the Chrome browser and assigns it to driver.
		driver.get("https://www.google.com/");         //Opens the Google homepage in the browser.
		
		driver.manage() .window() .maximize();       //Maximizes the browser window
		
		searchfield = driver.findElement(By.id("APjFqb"));     //shows an alternate way to locate the search field using its id.
				
//		searchfield = driver.findElement(By.name("q"));	   //Locates the Google search box using its name	
//		searchfield.sendKeys("pune");                             // Enters the text "pune" into the search box.
//		searchfield.submit();                                    //Submits the search form.
		
//		language=driver.findElement(By.linkText("हिन्दी"));         //This locates the "हिन्दी" (Hindi) language link using full link text and clicks it.	
//		language.click();
		
//		language=driver.findElement(By.partialLinkText("हि"));   //Locates the same language link using a partial match of the link text ("हि").
//		language.click();

//		language=driver.findElement(By.linkText("বাংলা"));         
//		language.click();
		
//	    language=driver.findElement(By.partialLinkText("मरा"));   
//		language.click();

//		settings=driver.findElement(By.linkText("Settings"));   		
//		settings.click();
//		
		luckyButton=driver.findElement(By.name("btnI"));
		luckyButton.click();

		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

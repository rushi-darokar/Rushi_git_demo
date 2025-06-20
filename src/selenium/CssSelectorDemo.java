package selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CssSelectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebElement username,pass,logButton;
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium\\ChromDriver\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/?_rdr");
		driver.manage().window().maximize();
		
		username=driver.findElement(By.cssSelector("input[id='email']"));    //Find an <input> tag with an id attribute equal to "email".


		username.sendKeys("rushidarokar96@gmail.com");
		
//		username=driver.findElement(By.cssSelector("input#email"));
		
//		username=driver.findElement(By.cssSelector("input[id*='em']"));   //To handle dynamic or partially known IDs.
		

		
//		username=driver.findElement(By.cssSelector("input.inputtext._55r1.inputtext._1kbt.inputtext._1kbt"));   //Matches a specific combination of class names.
//		username.sendKeys("rushidarokar96@gmail.com");
		
		
		pass=driver.findElement(By.cssSelector("input[id='pass']"));
		pass.sendKeys("Rushi@123");
//		
//		pass=driver.findElement(By.cssSelector("input[id^='pass']"));            //Starts with" match using ^= operator
//		pass=driver.findElement(By.cssSelector("input[name$='ss']"));			//Ends with" match using $= operator.


//		pass=driver.findElement(By.cssSelector("input[id*='ma']"));				//Contains" match again using *= operator.
//		

		logButton=driver.findElement(By.cssSelector("button[name='login']"));      //button[name='login'] → <button> element with a name attribute equal to "login".
		logButton.click();   
		
		
		
		
		
	}

}

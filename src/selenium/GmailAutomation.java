package selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GmailAutomation {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium\\ChromDriver\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&dsh=S1291853850%3A1750428607604952&emr=1&flowEntry=ServiceLogin&flowName=GlifWebSignIn&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&ifkv=AdBytiObA0Q5OOtLj_Z1RiNhtoeRwnmbYJ6unvURK6BikJ_xw6FssSB2kMBipj0xCdIGDys3W_EIyg&osid=1&service=mail");
		
//		WebElement username = driver.findElement(By.id("identifierId"));
//		username.sendKeys("rushidarokar96@gmail.com");
	
//		WebElement btn = driver.findElement(By.cssSelector("button[class*='VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc LQeN7 BqKGqe Jskylb TrZEUc lw1w4b']"));
//		btn.click();
//	
		WebElement createAccount = driver.findElement(By.cssSelector("button[jsname='Cuz2Ue']"));
		createAccount.click();
	
		WebElement forMyselfOption = driver.findElement(By.cssSelector("div[data-value='1']"));
		forMyselfOption.click();
		
		
		

		
		
		
		

	}

}

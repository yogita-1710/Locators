package locatorsdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LocatorsDemo4_XpathOptions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\jars 2024\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	//	driver.navigate().to("http://www.automationpractice.pl/index.php");
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		// Xpath Options -OR
		//driver.findElement(By.xpath("//input[@id='search_query_top' or @name='search_query']")).sendKeys("T-shirts");
		//driver.close();
		//driver.findElement(By.xpath("//input[ @type=\"password\" or @id=\"email\"]")).sendKeys("yogitapore4");
		//driver.findElement(By.xpath("//input[@type='password'or @id='email1']")).sendKeys("yogita");
		driver.findElement(By.xpath("//input[contains(@id,'email')]")).sendKeys("Sakshi");
	}

}
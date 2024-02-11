package locatorsdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\jars 2024\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.navigate().to("http://www.automationpractice.pl/index.php");
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		// driver.findElement(By.xpath("//*[@id=\"search_query_top\"]")).sendKeys("T-Shirts");
		// driver.findElement(By.xpath("//button[contains(@name,'search')]")).click();
		// driver.findElement(By.xpath("//button[starts-with(@name,'submit_')]")).click();
//		driver.findElement(By.xpath("//a[text()='Messenger']")).click();
		driver.findElement(By.xpath("//input[@id='email']//input[contains(@name,'email')]")).sendKeys("siddhu");
	}

}

package locatorsdemo;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LocatorsDemo2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\jars\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		/*
		 * cssSelectors tag and id tag and class tag and attribute tag,class and
		 * attribute
		 */
		// tag and id
		// driver.findElement(By.cssSelector("input#email")).sendKeys("yogitapore17");
		// driver.findElement(By.cssSelector("#email")).sendKeys("yogitapore4");
		// tag and class
		// driver.findElement(By.cssSelector(".inputtext")).sendKeys("yogitapore4");
		driver.findElement(By.cssSelector("input.inputtext")).sendKeys("yogitapore4");
		// tag,class and attribute
		driver.findElement(By.cssSelector("input.inputtext[type=\"password\"]")).sendKeys("yogita17");
		driver.quit();
	}
}

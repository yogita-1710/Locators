package locatorsdemo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\jars 2024\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.automationpractice.pl/index.php");
		driver.manage().window().maximize();
		// Locator 4-className
		int no_of_sliders = driver.findElements(By.className("homeslider-container")).size();
		System.out.println("Nummber of sliders on page::"+no_of_sliders);
		//Locator 5-tagName
		int no_of_links=driver.findElements(By.tagName("a")).size();
		System.out.println("Number of links on page::"+no_of_links);
		// Locator 1 -id
		driver.findElement(By.id("search_query_top")).sendKeys("T-shirts");
		// Locator 2-name
		WebElement button = driver.findElement(By.name("submit_search"));
		button.click();
		// Locator 3-LinkText/Partial Link Text
		// driver.findElement(By.linkText("Printed Chiffon Dress")).click();
		driver.findElement(By.partialLinkText("Chiffon Dress")).click();
driver.quit();
	}

}

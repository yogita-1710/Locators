package locatorsdemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorsDemo3_Xpath {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.gecko.driver","C:\\jars\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.automationpractice.pl/index.php");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//Relative xpath
		//driver.findElement(By.xpath("//*[@id=\"search_query_top\"]")).sendKeys("T-shirts");
		//Absolute Xpath //full xpath
		driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[2]/form/input[4]")).sendKeys("Dresses");
		//Relative xpath
		//driver.findElement(By.xpath("//*[@type=\"submit\"]")).click();
		//driver.quit();
		
		//Absolute Xpath //full xpath
		driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[2]/form/button")).click();
	}

}

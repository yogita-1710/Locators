package locatorsdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo7_XpathAxes_Facebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\jars 2024\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		String selfnode = driver.findElement(By.xpath("//*[@id='u_0_0_D/']/self::a")).getText();
		System.out.println("Self Node-->" + selfnode);
		/*String parentNode=driver.findElement(By.xpath("//a[@id=\"u_0_0_D/\"]/parent::div")).getText();
		System.out.println("Parent Node-->"+parentNode);*/
	}

}

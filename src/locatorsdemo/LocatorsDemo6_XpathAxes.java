package locatorsdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo6_XpathAxes {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\jars 2024\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		driver.manage().window().maximize();
		String selfnode = driver.findElement(By.xpath("//*[contains(text(),'Steel Authority')]/self::a")).getText();
		System.out.println("Self Node-->" + selfnode);
		String parentNode=driver.findElement(By.xpath("//*[contains(text(),'Steel Authority')]/parent::td")).getText();
		System.out.println("Parent Node-->"+parentNode);
		//ancestor
		String ancestorNode=driver.findElement(By.xpath("//*[contains(text(),'Steel Authority')]/ancestor::tr")).getText();
		System.out.println("Ancestor Node-->"+ancestorNode);
		int no_of_childs=driver.findElements(By.xpath("//*[contains(text(),'Steel Authority')]/ancestor::tr/child::td")).size();
		System.out.println("number of child of ancestor-->"+no_of_childs);
		Thread.sleep(1000);
		driver.close();
	}

}

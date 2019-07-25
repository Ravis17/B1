package twitter;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amit {
	
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "D:\\Ravi Singh\\chromedriver.exe");
WebDriver driver=new ChromeDriver();

driver.get("https://www.google.com/");
WebElement myelement = driver.findElement(By.name("q"));
myelement.sendKeys("amitabh bachchan");
myelement.sendKeys(Keys.ENTER);

String verifyname=driver.findElement(By.xpath("//span[contains(text(),'Amitabh Bachchan')]")).getText();
System.out.println("name is displayed , "+verifyname);

{
WebElement myelement1 = driver.findElement(By.xpath("//a[contains(text(),'amitabh bachchan on Twitter')]"));
myelement1.sendKeys(Keys.ENTER);

	}
	}
}

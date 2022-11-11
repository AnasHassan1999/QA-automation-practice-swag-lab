import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Swag_test {

	public static void main(String[] args) {
		;
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "H:\\my new wep driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		String username = "standard_user";
		String password = "secret_sauce";

		driver.get("https://www.saucedemo.com/");

		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(username);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		String actualtitel = driver.getTitle();
		String expectedtitel = "Swag Labs";
		Assert.assertEquals(actualtitel, expectedtitel);
		int counter = 0;
		int expectedcounter = 6;

		List<WebElement> listofadded = driver.findElements(By.className("btn"));

		for (int i = 0; i < listofadded.size(); i++) {

			listofadded.get(i).click();

		}

		String actualvalue = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span")).getText();

		System.out.println(actualvalue);
		
		int actualvalueint= Integer.parseInt(actualvalue);
		
		Assert.assertEquals(actualvalueint, expectedcounter);

	}

}

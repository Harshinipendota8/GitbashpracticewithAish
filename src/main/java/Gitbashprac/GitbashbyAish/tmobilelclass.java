package Gitbashprac.GitbashbyAish;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class tmobilelclass {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.t-mobile.com/");
		
		Actions act = new Actions(driver);
		WebElement wb = driver.findElement(By.xpath("//a[text()='Plans']"));
		act.moveToElement(wb).build().perform();
		
		driver.findElement(By.xpath("//a[text()='Unlimited Phone Plans']")).click();

	}

}

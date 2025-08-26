package Action_Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex2_SpiceJet {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.spicejet.com/");
        Actions action = new Actions(driver);
        WebElement from= driver.findElement(By.xpath("(//input)[1]"));
        action.sendKeys(from,"BLR").build().perform();
    }
}

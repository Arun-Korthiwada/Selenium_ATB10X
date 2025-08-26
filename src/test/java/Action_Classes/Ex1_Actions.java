package Action_Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex1_Actions {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/practice.html");
        Actions action = new Actions(driver);
        WebElement first_name= driver.findElement(By.xpath("//input[@name='firstname']"));
        action.moveToElement(first_name)
                .click()
                .keyDown(Keys.SHIFT)
                .sendKeys("hello world")  // This will be typed as "HELLO WORLD"
                .keyUp(Keys.SHIFT)
                .build()
                .perform();
    }
}

package Action_Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex3_Makemytrip {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
        driver.manage().window().maximize();
        Actions action = new Actions(driver);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@data-cy='closeModal']")).click();
        WebElement from = driver.findElement(By.xpath("//input[@id='fromCity']"));
        WebElement firstElement = driver.findElement(By.xpath("(//div[@class=\"makeFlex\"])[1]"));
        //action.sendKeys(from,"BLR");
        action.moveToElement(from).click().sendKeys("BLR").build().perform();

//        firstElement.click();
    }
}

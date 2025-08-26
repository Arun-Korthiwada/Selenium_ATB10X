package Selenium_Input_Select_Alerts_Radio_Checkbox;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Alerts {
    public static void main(String[] args) {

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        WebElement JSalert = driver.findElement(By.xpath("//button[contains(text(),\"Click for JS Alert\")]\n"));
        WebElement Confirm = driver.findElement(By.xpath("//button[contains(text(),\"Click for JS Confirm\")]\n"));
        WebElement Prompt = driver.findElement(By.xpath("//button[contains(text(),\"Click for JS Prompt\")]\n"));
        WebElement Result = driver.findElement(By.xpath("//p[@id='result']"));

        Alert alert = driver.switchTo().alert();

    }
}

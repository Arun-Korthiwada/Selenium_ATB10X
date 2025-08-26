package Selenium_SVGElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class SVG_Map {
    WebDriver driver = new EdgeDriver();
    @BeforeTest
    public void openbrowser(){

        driver.manage().window().maximize();
    }

    @Test
    public void test_SVG_Maps(){
        driver.get("https://www.amcharts.com/svg-maps/?map=india");
        List<WebElement> states = driver.findElements(By.xpath("//*[name()='svg']/*[name()='g'][7]/*[name()='g']/*[name()='g']/*[name()='path']"));
        for(WebElement state: states){
            String name= state.getAttribute("aria-label");
            if (name.contains("Telangana")){
                state.click();

            }
        }


        }
    @AfterTest
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}

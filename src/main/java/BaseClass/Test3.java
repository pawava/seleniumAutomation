package BaseClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test3 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        Actions actions=new Actions(driver);
        Actions actions1= (Actions) actions.moveToElement(driver.findElement(By.id("user-name"))).click()
                .sendKeys("standard_user", Keys.TAB)
                .sendKeys("secret_sauce",Keys.ENTER).build();
        actions1.perform();
        }

    }


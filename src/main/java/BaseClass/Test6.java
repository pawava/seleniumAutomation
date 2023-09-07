package BaseClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test6 {
    public static void main(String []args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        Actions a=new Actions(driver);

      WebElement blogmenue= driver.findElement(By.id("blogsmenu"));

        WebElement blog= driver.findElement(By.xpath("//span[text()='Selenium143']"));
        a.moveToElement(blogmenue).perform();
        Thread.sleep(3000);
        a.moveToElement(blog).perform();

    }

}

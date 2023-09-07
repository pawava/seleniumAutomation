package BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test11 {
    public static void main(String[]args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        //driver.get("https://opensource-demo.orangehrmlive.com/");
        Test12 t=new Test12();
        driver.get(t.getURL());

        driver.findElement(By.name("username")).sendKeys(t.getName());
        driver.findElement(By.name("password")).sendKeys(t.getPassword());
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
}

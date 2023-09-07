package BaseClass;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test7 {
    public static void main(String[]args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hugedomains.com/domain_profile.cfm?d=uitestpractice.com");
        JavascriptException js = (JavascriptException) driver;
        //js.executeScript("document.getElementById('hdv3HeaderSearchTextID').vslue='vikash');


    }

}

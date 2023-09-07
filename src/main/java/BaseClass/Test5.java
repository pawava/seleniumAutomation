package BaseClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 {
    public static void main(String[]args){
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.rediff.com/");
        //switch to iframe

        driver.switchTo().frame("moneyiframe");
        //find web element and print value
       String neindex= driver.findElement(By.id("nseindex")).getText();
       System.out.println(neindex);
    }
}

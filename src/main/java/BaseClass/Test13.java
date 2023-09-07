package BaseClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Test13 {
    public static void main(String[]args){
        //launch chrome browser
        WebDriver driver=new ChromeDriver();
        //maxmize browser
        driver.manage().window().maximize();
        driver.get("https://udyamregistration.gov.in/Udyam_Login.aspx");
    List<WebElement> element =  driver.findElements(By.xpath("//input[@type='radio']"));
       System.out.println("Total no rado button on web page"+element);
        driver.close();

    }
}

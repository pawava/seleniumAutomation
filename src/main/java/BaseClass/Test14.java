package BaseClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Test14 {
    public static void main(String[]args){
        String expectedDay="2";
        String expectedMonth="May";
        String expectedYear="2022";
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/datepicker/");
        driver.switchTo().frame(0);
        WebElement datePicker= driver.findElement(By.id("datepicker"));
        datePicker.click();
        while (true){
          String calenderMonth=  driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
            String calenderYears=  driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
            if(calenderMonth.equals(expectedMonth)&& calenderYears.equals(expectedYear)){
                List<WebElement> daylist= driver.findElements(By.xpath("//table/tbody/tr/td"));
                    for(WebElement e:daylist){
                        String calenderXday=e.getText();
                        if(calenderXday.equals(expectedDay)){
                            e.click();
                            break;
                        }
                }
                break;
            }

            else{
                driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();

            }
        }

    }
}

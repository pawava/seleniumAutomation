package BaseClass;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class Test2 {
    public static void main(String[]args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.venuelook.com/");
        driver.manage().window().maximize();
        //convert webdriver object to TakeScreenShot interface
        TakesScreenshot screenshot=((TakesScreenshot) driver);
        //getScreenShotAs method to create image file
        screenshot.getScreenshotAs(OutputType.FILE);
        File scr=screenshot.getScreenshotAs(OutputType.FILE);
        File dest=new File("/home/sudha-admin/IdeaProjects/POM/src/main/resources/ScreenShot/photo.png");
        try {
            FileUtils.copyFile(scr,dest);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

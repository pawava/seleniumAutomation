import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class Test3 {

        public void main(String[]args) throws IOException {
            WebDriver driver=new ChromeDriver();
            driver.get("https://www.google.com/");
            driver.manage().window().maximize();
            //convert webdriver object to TakeScreenShot interface
            TakesScreenshot screenshot=((TakesScreenshot) driver);
            //getScreenShotAs method to create image file
            screenshot.getScreenshotAs(OutputType.FILE);
            File scr=screenshot.getScreenshotAs(OutputType.FILE);
            File dest=new File("/home/sudha-admin/IdeaProjects/POM/src/main/resources/ScreenShot/photo.png");
            FileUtils.copyFile(scr,dest);
        }
    }



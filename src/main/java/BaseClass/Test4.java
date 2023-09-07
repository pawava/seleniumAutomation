package BaseClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Test4 {
    public static void main(String[]args){
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        // wait 10 seconds
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //open URL
        driver.get("http://www.deadlinkcity.com/");
        //find hyperlink
        List<WebElement> linkList=driver.findElements(By.tagName("a"));
        int resCode=200;//2xx response code is valid link
        int brokenLinkCnt=0;
        for(WebElement element:linkList){
            String url=element.getAttribute("href");
            try{
                URL urlLink=new URL(url);
                HttpURLConnection huc=(HttpURLConnection) urlLink.openConnection();
                huc.setRequestMethod("HEAD");
                huc.connect();
                if(resCode>=400){
                    System.out.println(url + "broken link.");
                }

            }
            catch(MalformedURLException e){

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

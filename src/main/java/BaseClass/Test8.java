package BaseClass;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Test8 {
    WebDriver driver;

    @BeforeMethod
    public void SetUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

    }

    @Test(dataProvider = "SearchDataProvider")
    public void searchKeyword(String keyword) {
        WebElement searchbox = driver.findElement(By.name("q"));
        searchbox.sendKeys(keyword);
        searchbox.sendKeys(Keys.ENTER);


    }



    @DataProvider(name = "earchDataProvider")
    public Object[][] searchDataProviderMethod() {
        Object[][] serchdata = new Object[2][1];//2 rows & 1 column
        serchdata[0][0]="TajMahal";
        serchdata[1][0]="TajMahal";
        return serchdata;
    }


    public void teardown(){
        driver.quit();

    }
}

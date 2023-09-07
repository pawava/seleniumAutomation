package BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.*;

public class Test10 {
    public static void main(String[] args) throws IOException {
        XSSFWorkbook ExcelWBook = null;
        XSSFSheet ExecleWSheet;
        // XSSFRow row;
        // XSSFCell Cell;
        File excelFile = new File("/home/sudha-admin/Documents/Data_Driven_Automation.ods");
        FileInputStream inputStream = null;
        //create an object of FileInputSteam to read data from file
        try {
            inputStream = new FileInputStream(excelFile);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ExcelWBook = new XSSFWorkbook(inputStream);
        //to access workbook sheet
        ExecleWSheet = ExcelWBook.getSheetAt(0);
        //get total row count
        int ttRows = ExecleWSheet.getLastRowNum() + 1;
      //  int ttcells = ExecleWSheet.getRow(0).getLastCellNum();
        for (int currentRow = 0; currentRow < ttRows; currentRow++) {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.saucedemo.com/");
            driver.findElement(By.id("user-name")).sendKeys(ExecleWSheet.getRow(currentRow).getCell(0).toString());
            driver.findElement(By.id("password")).sendKeys(ExecleWSheet.getRow(currentRow).getCell(1).toString());
            driver.findElement(By.id("login-button")).click();
            try {
                Thread.sleep(3000);

                // //     for (int currentCell = 0; currentCell < ttcells; currentCell++) {
                //      System.out.println(ExecleWSheet.getRow(currentRow).getCell(currentCell).toString());
                //     System.out.print("\t");
                //   }
                // System.out.println();

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            try {
                ExcelWBook.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

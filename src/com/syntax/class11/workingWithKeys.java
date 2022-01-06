package com.syntax.class11;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class workingWithKeys {
    public static String url = "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";


    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

        // locate the user name

        WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));

        WebElement password = driver.findElement(By.name("ctl00$MainContent$password"));

        username.sendKeys("Tester", Keys.TAB);
        password.sendKeys("test", Keys.ENTER);

        TakesScreenshot ts = (TakesScreenshot) driver;

        // to take the screen shot, this step takes the screenshot
        File sourceFile = ts.getScreenshotAs(OutputType.FILE);

        //save the screenshot in our computer

        try{
            FileUtils.copyFile(sourceFile, new File("Screenshot/smartBear/adminlogin.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

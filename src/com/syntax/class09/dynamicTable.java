package com.syntax.class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class dynamicTable {

    public static String url = "http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx";

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);

        //        print all the rows of the webtable in the console

//        Login to the website
        driver.findElement(By.cssSelector("input#ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.cssSelector("input#ctl00_MainContent_password")).sendKeys("test");
        driver.findElement(By.cssSelector("input#ctl00_MainContent_login_button")).click();

//        get all the rows
        List<WebElement> rows = driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr"));
//        print all the rows
        for (int i = 1; i < rows.size(); i++) {
            String text = rows.get(i).getText();
            System.out.println(text);

            if (text.contains("ScreenSaver")) {
                List<WebElement> checkBoxes = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[1]"));

                checkBoxes.get(i - 1).click();
            }


        }
    }
}

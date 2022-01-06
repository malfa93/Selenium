package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class dropDown {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");
        WebElement option = driver.findElement(By.cssSelector("select#select-demo"));


        // Use the select class to select from the dropdown.
        Select select = new Select(option);

        select.selectByIndex(1);


        select.selectByVisibleText("Thursday");


        select.selectByValue("Wednesday");

        List<WebElement> allOptions = select.getOptions();

        int size = allOptions.size();

        System.out.println(size);


        for(int i=0; i<size; i++){

           String days= allOptions.get(i).getText();

            System.out.println(days);
        }

    }
}

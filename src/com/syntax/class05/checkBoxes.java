package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class checkBoxes {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        driver.get("https://syntaxprojects.com/basic-checkbox-demo.php");
        WebElement singleCheckbox = driver.findElement(By.cssSelector("input#isAgeSelected"));
        singleCheckbox.click();
        Thread.sleep(2000);
        singleCheckbox.click();

        //task2

        List<WebElement> allCheckBoxes = driver.findElements(By.xpath("//input[@class='cb1-element']"));

        //print the size of the list

        int size = allCheckBoxes.size();

        System.out.println("The total number of checkboxes is: "+size);

        for (WebElement checkbox:allCheckBoxes
             ) {
            checkbox.click();



            String attri = checkbox.getAttribute("value");
            System.out.println(attri);
            System.out.println("------------");


            if(attri.equalsIgnoreCase("Option-3")){
                checkbox.click();
            }

        }



    }
}
